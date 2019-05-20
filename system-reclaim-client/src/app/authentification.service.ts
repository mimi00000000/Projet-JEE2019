import { Injectable, SystemJsNgModuleLoader } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

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

//code static by kaoutar
/*export class AuthentificationService {
  constructor() { }

  authenticate(cin, motdepasse) {
    if (cin === "cin" && motdepasse === "mdp") {
      sessionStorage.setItem('cin', cin)
      return true;
    } else {
      return false;
    }
  }

  

 
}*/

export class AuthentificationService {
    

    //some strings that define the road to the link

    public API = '//localhost:8080';
    public API_LOGIN = this.API = '/login';
  constructor(private http: HttpClient) { }
  // in case we want all the logins: getAll but it is nt implemented

  // just one user
  get(cin: string, motdepasse: string) {
      sessionStorage.setItem('cin_user_login', cin);
      return this.http.get(this.API + '/{' + cin + ',' + motdepasse + '}');
  }
isUserLoggedIn() {
    let user = sessionStorage.getItem('cin');
    console.log(!(user === null));
    return !(user === null);
  }

 logOut() {
    sessionStorage.removeItem('cin');
  }
}
