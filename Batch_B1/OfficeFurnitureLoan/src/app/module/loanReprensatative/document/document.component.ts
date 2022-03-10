import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { CommonService } from 'app/shared/common.service';
import { Location } from '@angular/common';

@Component({
  selector: 'app-document',
  templateUrl: './document.component.html',
  styleUrls: ['./document.component.css']
})
export class DocumentComponent implements OnInit {

  constructor(private formBuilder:FormBuilder, private common:CommonService,private location:Location) { }

  docForm!:FormGroup;
  // doc=new Document();
 
  selectedaddressproof:any;
  selectedpancard:any;
  selecteditr:any;
  selectedadharCard:any;
  selectedpassphoto:any;
  selectedsignature:any;
  selectedthumbimprssion:any;
   selectedbankCheque:any;
   selectedbankStatement:any;

    
   
   ngOnInit(): void {
 
     this.docForm=this.formBuilder.group({
 
       cid:[],
       status:['']
     })
    }
 
   onselectedFile1(event:any){this.selectedaddressproof=event.target.files[0];}
   onselectedFile2(event:any){this.selectedpancard=event.target.files[0];}
   onselectedFile3(event:any){this.selecteditr=event.target.files[0];}
   onselectedFile4(event:any){this.selectedadharCard=event.target.files[0];}
   onselectedFile5(event:any){this.selectedpassphoto=event.target.files[0];}
   onselectedFile6(event:any){this.selectedsignature=event.target.files[0];}
   onselectedFile7(event:any){this.selectedthumbimprssion=event.target.files[0];}
   onselectedFile8(event:any){this.selectedbankCheque=event.target.files[0];}
   onselectedFile9(event:any){this.selectedbankStatement=event.target.files[0];}
 
 
   
 
   save()
   {
     const document1=JSON.stringify(this.docForm.value);
     const uploadDocument= new FormData();
     uploadDocument.append("addressproof",this.selectedaddressproof);
     uploadDocument.append("pancard",this.selectedpancard);
     uploadDocument.append("itr",this.selecteditr);
     uploadDocument.append("adharCard",this.selectedadharCard);
     uploadDocument.append("passphoto",this.selectedpassphoto);
     uploadDocument.append("signature",this.selectedsignature);
     uploadDocument.append("thumbimprssion",this.selectedthumbimprssion);
     uploadDocument.append("bankCheque",this.selectedbankCheque);
     uploadDocument.append("bankStatement",this.selectedbankStatement);
      
      
     uploadDocument.append("doc",document1);
 
 
     this.common.postDocument(uploadDocument).subscribe();
     console.log("Upload Method")
     alert("File uploaded Successfully !!");
     this.location.back();
     
   
   
     
 
   }

}