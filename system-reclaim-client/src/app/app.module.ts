import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AgmCoreModule } from '@agm/core';

import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import {ToastrModule} from 'ngx-toastr';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations'



import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { ProfilComponent } from './profil/profil.component';
import { SignupComponent } from './signup/signup.component';
import { IndexComponent } from './index/index.component';
import { AccueilComponent } from './accueil/accueil.component';
import { WarningsComponent } from './warnings/warnings.component';
import { StatisticsComponent } from './statistics/statistics.component';
import { MapComponent } from './map/map.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ProfilComponent,
    SignupComponent,
    IndexComponent,
    AccueilComponent,
    WarningsComponent,
    StatisticsComponent,
    MapComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot({
     timeOut :50000,
     positionClass : 'toast-top-right' ,
     preventDuplicates : true}),
     AgmCoreModule.forRoot({
     apiKey: 'AIzaSyBL07HIFgk1ImXlFVPryqnJkjxB8iwMOVE'})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
