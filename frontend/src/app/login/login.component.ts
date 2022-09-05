import { LoginService } from './../services/login.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username = ''
  password = ''
  constructor(
    public service: LoginService
  ) { }

  ngOnInit(): void {
  }

  login()
  {
    this.service.authenticate(this.username, this.password)
  }
}
