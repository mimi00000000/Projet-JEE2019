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
    invalidLogin: boolean;

    login: any;


  constructor(private router: Router, private loginservice: AuthentificationService) {
      this.cin = '';
      this.motdepasse = '';
      this.invalidLogin = false;
  }

  ngOnInit() {
       
  }

  loginfunc() {
      //normally , this is what it was written in static way :); let's change the thing to the best ; YAAAY!
   /* if (this.loginservice.authenticate(this.cin, this.motdepasse)
    ) {
      this.router.navigate(['profil'])
      this.invalidLogin = false
    } else 
      this.invalidLogin = true
  }*/
//let's write a new condition here !!
    this.loginservice.get(this.cin, this.motdepasse).subscribe(data => {
                this.login = data;
    });
    if (this.login == null) {
      this.invalidLogin = true;
  } else {
      this.router.navigate(['profil']);  /* it is static!! need to change the path from profil to sth more dynamic */
      this.invalidLogin = false;
  }


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