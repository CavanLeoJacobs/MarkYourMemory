import { Component, OnInit, EventEmitter, Input, Output } from '@angular/core';


@Component({
  selector: 'app-my-new-component',
  templateUrl: './my-new-component.component.html',
  styleUrls: ['./my-new-component.component.css']

})
export class MyNewComponentComponent implements OnInit{
  @Input()
  name: string ="Angular";
  @Input()
  version: number = 13.0;
  @Output()
  readonly release: EventEmitter<void> = new EventEmitter();
  constructor()
  {

  }
 ngOnInit(): void
 {

 }
myFunction()
{
var path = "/about.html";
 window.location.href = path;
}
}

