import { Component, OnInit } from '@angular/core';
import { Conductor } from 'src/app/model/Conductor';
import { ConductorService } from 'src/app/services/conductor.service';


@Component({
  selector: 'app-add-conductor',
  templateUrl: './add-conductor.component.html',
  styleUrls: ['./add-conductor.component.css']
})
export class AddConductorComponent implements OnInit {

  conductor = new Conductor();
  submitted = false;
  msgError = '';
  isDisabled = true; 

  constructor(private conductorService: ConductorService) { }

  ngOnInit(): void {
  }

  existsPK (val:string): void {
    this.msgError  = '';
    this.isDisabled = true; 
    this.conductorService.get(val)
      .subscribe(
        data => {
          if (data!=null){
            this.msgError  = 'PK exists';
            this.isDisabled = true; 
          } else {
            this.isDisabled = false; 
          }
        },
        error => {
          this.msgError  = '';
          console.log(error);
        });
  }

  saveBook(): void {
    const data = {
      isbn: this.conductor.id,
      name: this.conductor.nombre,
      author: this.conductor.fecha_ingreso
    };

    this.conductorService.create(data)
      .subscribe(
        data => {
          this.submitted=true;
          console.log(data);
        },
        err => {
          this.msgError  = err.error.message;
          console.log(err);
        });
  }

  newBook() {
    this.submitted = false;
    this.conductor.id = "";
    this.conductor.nombre = "";
    this.conductor.fecha_ingreso = "";
    this.isDisabled = true;
  }

}
