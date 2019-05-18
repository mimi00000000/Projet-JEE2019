import { Injectable, SystemJsNgModuleLoader } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
//export class AuthentificationService {
  //  private host:string='http://localhost:8080';
  //constructor(private http: HttpClient) { }

  //loginfuncService(cin: string, motdepasse: string) {
    // return this.http.get(this.host+"/tasks");
   //}

    //getUsers() {
    //const url = 'http://localhost:7070/api/heroes';    
    //return this.http.get(url);
  //}

//}
export class AuthentificationService {
  constructor() { }

  authenticate(cin, motdepasse) {
    if (cin === "cin" && motdepasse === "mdp") {
      sessionStorage.setItem('cin', cin)
      return true;
    } else {
      return false;
    }
  }

  isUserLoggedIn() {
    let user = sessionStorage.getItem('cin')
    console.log(!(user === null))
    return !(user === null)
  }

  logOut() {
    sessionStorage.removeItem('cin')
  }
}
