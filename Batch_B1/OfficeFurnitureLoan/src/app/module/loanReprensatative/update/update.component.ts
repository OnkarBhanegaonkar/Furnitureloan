import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { CommonService } from 'app/shared/common.service';
import { Location } from '@angular/common';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  constructor(private fb: FormBuilder, private common: CommonService, private locations: Location) { }

  updateForm: FormGroup;
  cibill:any;
  
  ngOnInit(): void {
    this.updateForm = this.fb.group({
      enquiryId:[''],
	    name:[''],
      dob:[''],
	    age:[''],
      gender:[''],
	    email:[''],
    	mobileno:[''],
    	pancardno:[''],
	    adharcardno:[''],
      status:[''],
      cibil:['']
      
    })

    this.editData();
  }

  editData(){
    let empObj:any = this.locations.getState();
    console.log("getState()" +empObj.id);
    if(empObj.id!=0){
      this.updateForm.get('enquiryId').setValue(empObj.enquiryId);
      this.updateForm.get('name').setValue(empObj.name);
      this.updateForm.get('dob').setValue(empObj.dob);
      this.updateForm.get('age').setValue(empObj.age);
      this.updateForm.get('gender').setValue(empObj.gender);
      this.updateForm.get('email').setValue(empObj.email);
      this.updateForm.get('mobileno').setValue(empObj.mobileno);
      this.updateForm.get('pancardno').setValue(empObj.pancardno);
      this.updateForm.get('adharcardno').setValue(empObj.adharcardno);
      this.updateForm.get('status').setValue(empObj.status);
      this.updateForm.get('cibil').setValue(empObj.cibil);
    }
  }

  goBack(){
    this.locations.back();
  }
  generatecibilscore()
  {
    this.common.getsingledata().subscribe((d1:any)=>
    {
        this.cibill=d1;
    })
  }

  onSubmit(){
   
    this.common.updateEmployee(this.updateForm.value).subscribe();
    window.location.reload();
    this.locations.back() 
   
  }
}
