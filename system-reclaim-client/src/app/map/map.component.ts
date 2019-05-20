import { Component, OnInit } from '@angular/core';
import {ToastrService} from 'ngx-toastr';


@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.css']
})
export class MapComponent implements OnInit {


  texto = 'Wenceslau Braz - Cuidado com as cargas';
  lat = -22.8779431;
  lng = -49.8046873;
  zoom = 15;
  constructor( private toastr: ToastrService) { }

      ngOnInit(): void {}

  ShowSuccess() {
    this.toastr.success('hello' , 'Toastr fun');
  }
   ErrorSuccess() {
    this.toastr.error('hello' , 'Error');
  }

    InfoSuccess() {
    this.toastr.error('hello' , 'Info');
  }
    WarningSuccess() {
    this.toastr.warning('hello' , 'warning');
  }
}
