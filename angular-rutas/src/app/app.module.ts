import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaRutasComponent } from './components/lista-rutas/lista-rutas.component';

@NgModule({
  declarations: [
    AppComponent,
    ListaRutasComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NgModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
