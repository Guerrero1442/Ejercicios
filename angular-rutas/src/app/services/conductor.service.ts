import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Conductor } from '../model/Conductor';

const baseUrl = 'http://localhost:8080/api/v1/Conductor';

@Injectable({
  providedIn: 'root'
})
export class ConductorService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<Conductor[]> {
    return this.http.get<Conductor[]>(baseUrl);
  }

  get(id: String): Observable<Conductor> {
    return this.http.get<Conductor>(`${baseUrl}/${id}`);
  }

  create(data: any): Observable<any> {
    return this.http.post(baseUrl, data);
  }

  update(id: string, data: any): Observable<any> {
    return this.http.put(`${baseUrl}/${id}`, data);
  }

  delete(id: string): Observable<any> {
    return this.http.delete(`${baseUrl}/${id}`);
  }

  deleteAll(): Observable<any> {
    return this.http.delete(baseUrl);
  }

  findByConductor(conductor:string): Observable<any> {
    return this.http.get(`${baseUrl}?conductor=${conductor}`);
  }
}
