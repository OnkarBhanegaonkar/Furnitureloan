import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Cibil } from 'app/model/cibil';
import { Customer1 } from 'app/model/customer1';
import { Email } from 'app/model/email';
import { Enquiry } from 'app/model/enquiry';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CommonService {

  constructor(private hclient:HttpClient) { }

  regurl:string="http://localhost:9090/regData";

  custregurl:string="http://localhost:9090/custregdata";

  url:string="http://localhost:9090";

  getCibil = "http://localhost:9090/getallcibildata";

  addCibil = "http://localhost:9090/saveCibil";

  chckCibil = "http://localhost:9090/checkCibil";

  sendEMail = "http://localhost:9090/sendMail";

  geturl="http://localhost:9090/getAllData";

  updateurl:string="http://localhost:9090/updateData";

  cibilget:string="http://localhost:9090/cibilGenerate";

  saveCustomer(e:Enquiry):Observable<Enquiry>
  {
  
    return this.hclient.post<Enquiry>(this.regurl,e);
  }

  saveDetails(c:Customer1):Observable<Customer1>
  {
  
    return this.hclient.post<Customer1>(this.custregurl,c);
  }

  postDocument(d:any):Observable<Document>
  {
      return this.hclient.post<Document>(this.url+"/addDoc",d);;
  }

  c:Cibil={
    cid:0,
    cibilScore:0,
    panCard:'',
    cibilGeneratedDate:'',
    cibilGeneratedBy:'',
    cmRemark:''
  }

  sendMail(e: Email): Observable<any> {
    console.log("Send EMail URL : " + this.sendEMail);
    return this.hclient.post<Cibil>(this.sendEMail, e);
  }

  saveCibil(c: Cibil): Observable<Cibil> {
    console.log("Save CIBIL URL : " + this.addCibil);
    return this.hclient.post<Cibil>(this.addCibil, c);
  }

  checkCibil(c: Cibil)  {
    console.log("CIBIL SCORE URL : " + this.chckCibil + "/" + c.panCard);
    return this.hclient.get(this.chckCibil + "/" + c.panCard);
  }

  getALLData():Observable<Cibil[]>{
    console.log("GET ALL CIBIL URL : " + this.getCibil);
    return this.hclient.get<Cibil[]>(this.getCibil);
  }

  getData():Observable<Enquiry[]>
  {
    return this.hclient.get<Enquiry[]>(this.geturl);
  }

  mail:string="http://localhost:9090/mail";

  mailsender(e:Enquiry):Observable<Enquiry>
{
  return this.hclient.post<Enquiry>(this.mail,e)
}


updateEmployee(emp:Enquiry):Observable<Enquiry>{
  return this.hclient.put<Enquiry>(this.updateurl+'/'+emp.enquiryId,emp)
}

getsingledata():Observable<any>
{
    return this.hclient.get<any>(this.cibilget);
}
}


