import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map, catchError } from 'rxjs/operators';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class IndicadorService  {

  private BASE_PATH = `https://localhost:8080/banco-mundial`;
    httpOptions = {
    headers: new HttpHeaders({'Content-Type': 'application/json'})
  };

  constructor(private http: HttpClient, private router: Router) {
    
  }

  public loadPobreza(idPais: String): Observable<any> {
    console.log(idPais);
    return this.http.get(
      `${this.BASE_PATH}/pais/${idPais}`,
      this.httpOptions
    ).pipe(
      map((response: any) => {
        if (response && response.resultado) {
          return response.resultado;
        }
      }),
      catchError(error =>  error)
    );
  }


}
