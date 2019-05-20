import { Component, OnInit } from '@angular/core';
import { User } from '../User';
import { ProfilService } from '../profil.service'; 
@Component({
  selector: 'app-profil',
  templateUrl: './profil.component.html',
  styleUrls: ['./profil.component.css']
})
export class ProfilComponent implements OnInit {

    profils : Array<any>;
   /* public user: User;
    ngOnInit(): void {
    }
  constructor() {
      this.user = {
                cin: 'kherra',
                nom: 'kherra',
                prenom: 'kherra',
                email: 'kherra',
                adresse: 'kherra',
                dateNaissance: new Date(),
                numTele: 'kherra',
                sexe: 'kherra',
                ville: 'kherra'
      };

  }*/

  //what i added here ,n just in case ...
  constructor(private profilService: ProfilService){}
  ngOnInit(): void {
      this.profilService.getAll().subscribe(data => {
          this.profils = data;
      });
    }
}
