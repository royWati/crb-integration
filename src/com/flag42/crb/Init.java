package com.flag42.crb;

import com.flag42.crb.methods.impl.CrbMethods;
import com.flag42.crb.om.GetCreditReportRequestResponse;
import com.flag42.crb.om.GetCreditStatusResponse;
import com.flag42.crb.om.GetPaymentResponse;
import com.flag42.crb.om.GetRegistrationMobileUserResponse;
import com.flag42.crb.om.GetServerInfoResponse;

public class Init {
    public static void main(String[] args){
        System.out.println("Starting");
        CrbMethods c = new CrbMethods();
        GetRegistrationMobileUserResponse s = c.GetMobileRegistration();
        System.out.println(s.getResponseCode());
        
        System.out.println("Completed");
    }
}
