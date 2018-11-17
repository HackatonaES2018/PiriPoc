import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NavigationComponent } from './navigation/navigation.component';
import { CadastroLoginComponent } from './cadastro-login/cadastro-login.component';

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    CadastroLoginComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
