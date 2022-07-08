import {Component, EventEmitter, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-countdown-timer',
  templateUrl: './countdown-timer.component.html',
  styleUrls: ['./countdown-timer.component.css']
})
export class CountdownTimerComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    this.dem.emit(this.number);
  }
  number=60;
  status=false;
  @Output()
  dem : EventEmitter<number> = new EventEmitter<number>();
  interval;

  Start() {
    // this.number=60;
    this.status=true;
     this.interval = setInterval(() => {
      this.number--;
      this.dem.emit(this.number);

      if (this.number == 0) {
        // this.number=60;
        // this.status=false;
        clearInterval(this.interval);
        // return;
      }
    }, 1000);
  }

  Stop() {
    this.status=false;
    this.dem.emit(this.number);
    clearInterval(this.interval);
  }

  Reset() {
    this.number=60;
    this.status=false;
    this.dem.emit(this.number);
    clearInterval(this.interval);
  }
}
