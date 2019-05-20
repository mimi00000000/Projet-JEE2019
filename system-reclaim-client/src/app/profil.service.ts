import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProfilService {

  constructor(private http: HttpClient) {
  }

       getAll(): Observable<any> {
         return this.http.get('//localhost:8080/users');
     }
     // i wanted to add sth; but i forgot
     //ooh yes; it's the other functions that are needed to the treatments,as : getall; get(this one is in case oon searshin gjust for one thing)
     // the methods save and remove!! 
     //lmohim hettal apres
}
