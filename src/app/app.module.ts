import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
<<<<<<< HEAD
import { PageHeaderComponent } from './page-header/page-header.component';
=======
import { NavigationComponent } from './navigation/navigation.component';
>>>>>>> 2c475f9f8e445a7c5f56c1e7f0050c16f54c4714

@NgModule({
  declarations: [
    AppComponent,
<<<<<<< HEAD
    PageHeaderComponent
=======
    NavigationComponent
>>>>>>> 2c475f9f8e445a7c5f56c1e7f0050c16f54c4714
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
