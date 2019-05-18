import { Component, OnInit } from '@angular/core';
import { ProfilService } from '../profil.service';

@Component({
  selector: 'app-profil',
  templateUrl: './profil.component.html',
  styleUrls: ['./profil.component.css']
})
export class ProfilComponent implements OnInit {
    public users: Array<any>;

  constructor(private profilService: ProfilService) { }

  ngOnInit() {
      this.profilService.getAll().subscribe(data => {
            this.users = data;
      });
  }

}
