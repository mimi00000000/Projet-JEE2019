import { Component, OnInit } from '@angular/core';
import { User } from '../User';
import { SignupservService } from '../signupserv.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
    user: User;
    router: any;

  constructor(private signupservService: SignupservService) { }
  ngOnInit() {
        this.resetForm();
     // this.profilService.getAll().subscribe(data => {
       //     this.users = data;
      // });
  }

  onSubmit() {
    // this.signupservService.save(this.user).subscribe(result => this.gotoUserList());
        this.signupservService.save(this.user).subscribe(result => this.gotoaccueil());
  }

   gotoaccueil() {
    this.router.navigate(['/accueil']);
  }

  resetForm(form?: NgForm) {
      if ( form != null) {
         form.resetForm();
         this.user = {
            cin: '',
            nom: '',
            prenom: '',
            email: '',
            adresse: '',
            dateNaissance: new Date(),
            numTele: '',
            sexe: '',
            ville: ''
        };
      }
  }


}
