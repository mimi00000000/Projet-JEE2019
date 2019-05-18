import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ProfilComponent } from './profil/profil.component';
import { SignupComponent } from './signup/signup.component';
import { IndexComponent } from './index/index.component';
import { AccueilComponent } from './accueil/accueil.component';

const appRoutes: Routes = [
    {path: '', redirectTo: 'accueil', pathMatch: 'full'},
    {path: 'login', component: LoginComponent},
    {path: 'profil', component: ProfilComponent},
    {path: 'signup', component: SignupComponent},
    {path: 'index', component: IndexComponent},
    {path: 'accueil', component: AccueilComponent}
];

@NgModule({
imports: [
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],  exports: [RouterModule]
})
export class AppRoutingModule { }
