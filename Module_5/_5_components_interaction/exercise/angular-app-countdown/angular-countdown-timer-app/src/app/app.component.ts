import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-countdown-timer-app';

  value=0;
  countChangedHandler(event: number) {
    this.value=event;
  }
}
