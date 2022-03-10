import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CustomerregisterComponent } from './customerregister/customerregister.component';
import { DocumentComponent } from './document/document.component';
import { EnquiryComponent } from './enquiry/enquiry.component';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CibilComponent } from './cibil/cibil.component';

import { UpdateComponent } from './update/update.component';


const routing: Routes = [
  {path: 'oeenquiry', component:EnquiryComponent },
  {path:'oecibil',component:CibilComponent,
children:[
  {
    path:'updateenquirylist',component:UpdateComponent
  }
]},
  {path:'oecustomer',component:CustomerregisterComponent},
  {path:'oedocument',component:DocumentComponent}
 
  
];
@NgModule({
  declarations: [CustomerregisterComponent, DocumentComponent, EnquiryComponent, CibilComponent, UpdateComponent],
  imports: [
    CommonModule,RouterModule.forChild(routing),ReactiveFormsModule,FormsModule
  ]
})
export class loanReprensatativeModule { }
