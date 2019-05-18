import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthentificationService } from '../authentification.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

    cin: string;
    motdepasse: string;
    invalidLogin:boolean;

  constructor(private router: Router,private loginservice: AuthentificationService) {
      this.cin = '';
      this.motdepasse = '';
      this.invalidLogin = false;
  }

  ngOnInit() {
  }

  loginfunc() {
    if (this.loginservice.authenticate(this.cin, this.motdepasse)
    ) {
      this.router.navigate(['profil'])
      this.invalidLogin = false
    } else 
      this.invalidLogin = true
  }

}





/****************************************************************** */
/*export class LoginComponent implements OnInit {
  user: Object;
  cin: string;
  motdepasse: string;

  constructor(private data: AuthentificationService) {
      this.cin = '';
      this.motdepasse = '';
  }

  ngOnInit() {
        this.data.getUsers().subscribe(
      data => this.user = data
    );
  }

   loginfunc() {
    return this.data.loginfuncService(this.cin, this.motdepasse);
  }

}*/