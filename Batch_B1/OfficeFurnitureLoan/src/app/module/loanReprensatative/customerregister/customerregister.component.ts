import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CommonService } from 'app/shared/common.service';

@Component({
  selector: 'app-customerregister',
  templateUrl: './customerregister.component.html',
  styleUrls: ['./customerregister.component.css']
})
export class CustomerregisterComponent implements OnInit {

  constructor(private _fb:FormBuilder, private commonService: CommonService) { }

   //customerDetailsForm:FormGroup;
   
 //details: Array<any> =[];

 customerDetailsForm=this._fb.group({
  cid:[''],
  name:[''],
  dob:[''],
  age:[''],
  gender:[''],
  email:[''],
  mobileno:[''],
  alternatemobileno:[''],
  loanAmaount:[''],
  duration:[''],
  cibilscore:[''],
  
  customeraddress:this._fb.group({
    id:[''],
    state:[''],
    district:[''],
    pincode:[''],
    areaName:[''],
    cityName:[''],
   
  }),
  
  businessDetails:this._fb.group({
    bankId:[''],
    businessName:[''],
    bankName:[''],
    branchName:[''],
    accountNo:[''],
    ifscCode:[''],
    turnOver:[''],
    address:[''],
  }),


 
  propertyDetails:this._fb.group({
    propertyid:[''],
    propertytype:[''],
    areaname:[''],
    cityname:[''],
    propertyprice:[''],
    constructionprice:[''],
  
  }),
 
 
  guarantor:this._fb.group({
    gid:[''],
    name:[''],
    dob:[''],
    mobileNo:[''],
    gender:[''],
    emailId:[''],
    adharNo:[''],
 
  }),
})
 ngOnInit(): void {

 }
 saveData()
 {
   alert("in");
   this.commonService.saveDetails(this.customerDetailsForm.value).subscribe()
   window.location.reload();
   
 }


}

