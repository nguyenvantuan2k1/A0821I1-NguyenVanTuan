import {Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-progress-bar';
  value: number=0;
  loading() {
    let interval = setInterval(() => {
      this.value = this.value + 1;
      if (this.value == 100) {
          // clearInterval(interval);
          this.value=0;
      }
    }, 100);
  }
}
