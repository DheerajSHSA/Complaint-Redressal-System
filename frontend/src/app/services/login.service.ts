import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }

  authenticate(username: string, password: string)
  {
    if(username === 'admin' && password === 'admin')
    {
      console.log("Login Success, ADMIN")
    }
  }
}
