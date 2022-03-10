import { BusinessDetails } from "./business-details";
import { CustomerAddress } from "./customer-address";
import { Guarantor } from "./guarantor";
import { PropertyDetails } from "./property-details";

export class Customer1 {

    cid: number;
    name: String;
    dob: String;
    age: number;
    gender: String;
    email: String;
    mobileno: number;
    alternatemobileno: number;
    loanAmaount: number; 
    duration: number;
    cibilscore:number;
    
    customeraddress:CustomerAddress
    businessDetails:BusinessDetails
    propertyDetails:PropertyDetails
    guarantor:Guarantor

}
