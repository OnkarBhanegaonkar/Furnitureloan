import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Cibil } from 'app/model/cibil';
import { CommonService } from 'app/shared/common.service';
import { Location } from '@angular/common';
import { Email } from 'app/model/email';
import { Enquiry } from 'app/model/enquiry';

@Component({
  selector: 'app-cibil',
  templateUrl: './cibil.component.html',
  styleUrls: ['./cibil.component.css']
})
export class CibilComponent implements OnInit {

  constructor(private cs:CommonService, private loc:Location) { }

  enquirylist:Enquiry[];

  ngOnInit(): void {
  
    this.cs.getData().subscribe(list=>this.enquirylist=list);
   
  }
  mail(e:Enquiry){
    this.cs.mailsender(e).subscribe()
    alert("mail send")
  }

  getback(){
    this.loc.back();
  }

}
