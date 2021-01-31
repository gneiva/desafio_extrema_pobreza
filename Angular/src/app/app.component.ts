import { Component } from '@angular/core';
import { IndicadorService } from './indicadores.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  constructor(
    private indicadorService: IndicadorService
    ) { }

  title = 'angular';
  pais: String = '';
  consultaPais(){
    console.log(this.indicadorService.loadPobreza(this.pais));
  }
}
