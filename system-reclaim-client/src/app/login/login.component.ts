import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  cin: string;
  motdepasse: string;

  constructor() {
      this.cin = '';
      this.motdepasse = '';
  }

  ngOnInit() {
  }

   loginfunc() {
    if (this.cin === 'JB333333') {
      if (this.motdepasse === 'jb333333') {
        console.log('Bienvenue');
      } else {
        console.log('Cin incorrect');
      }
    } else {
      console.log('Mot de passe incorrect');
    }
  }
  
}
