import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './User';

@Injectable({
  providedIn: 'root'
})
export class SignupservService {

     private usersUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = '//localhost:8080/users';
  }
  public findAll(): Observable<User[]> {
    return this.http.get<User[]>(this.usersUrl);
  }

  public save(user: User) {
    return this.http.put<User>(this.usersUrl, user);
  }

}
