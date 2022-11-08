/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { AddConductorComponent } from './add-conductor.component';

describe('AddConductorComponent', () => {
  let component: AddConductorComponent;
  let fixture: ComponentFixture<AddConductorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddConductorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddConductorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
