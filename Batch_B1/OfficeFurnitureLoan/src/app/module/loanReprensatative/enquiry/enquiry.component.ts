import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { CommonService } from 'app/shared/common.service';

@Component({
  selector: 'app-enquiry',
  templateUrl: './enquiry.component.html',
  styleUrls: ['./enquiry.component.css']
})
export class EnquiryComponent implements OnInit {

  constructor(private cs:CommonService,private fb:FormBuilder) { }

  enquiryform:FormGroup;

  ngOnInit() {

    this.enquiryform=this.fb.group({
      enquiryId:[''],
	    name:[''],
      dob:[''],
	    age:[''],
      gender:[''],
	    email:[''],
    	mobileno:[''],
    	pancardno:[''],
	    adharcardno:[''],
      status:['']
    })
  }

  onSubmit()
  {
    window.location.reload();
    if(this.enquiryform.valid){
      console.log("in submit method");
      this.cs.saveCustomer(this.enquiryform.value).subscribe();
    }
  }

  // tabchange(s)
 // {
    
 // }

}
