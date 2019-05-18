import { Component, OnInit } from '@angular/core';
import { LoginComponent } from './login/login.component';
import { AuthentificationService } from './authentification.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
    constructor(public LoginService: AuthentificationService){}

    ngOnInit(){
    }

  title = 'system-reclaim-client';
}
