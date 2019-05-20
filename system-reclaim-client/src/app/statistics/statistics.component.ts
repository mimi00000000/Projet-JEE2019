import { Component, OnInit } from '@angular/core';
import { ShowwarningsService } from '../showwarnings.service';
import { Reclamation } from '../Reclamation';

@Component({
  selector: 'app-statistics',
  templateUrl: './statistics.component.html',
  styleUrls: ['./statistics.component.css']
})
export class StatisticsComponent implements OnInit {
    public reclamations: Array<Reclamation>;


  constructor(private showstatistics: ShowwarningsService) { }

  ngOnInit() {
       this.showstatistics.getAll().subscribe(data => {
            this.reclamations = data;
      });
  }

}
