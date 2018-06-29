package com.flag42.crb.methods.impl;


import com.flag42.crb.om.GetConfirmRegistrationResponse;
import com.flag42.crb.om.GetCreditCertificateRequestResponse;
import com.flag42.crb.om.GetCreditReportRequestResponse;
import com.flag42.crb.om.GetCreditScoreResponse;
import com.flag42.crb.om.GetCreditStatusResponse;
import com.flag42.crb.om.GetPaymentResponse;
import com.flag42.crb.om.GetRegistrationMobileUserResponse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;

import org.w3c.dom.NodeList;

import com.flag42.crb.om.GetRegistrationStatusResponse;
import com.flag42.crb.om.GetServerInfoResponse;

import com.flag42.crb.om.SoapConstants;
import com.flag42.crb.om.SoapResponse;

public class CrbMethods {
                private SoapConstants soapConstants = new SoapConstants();
                private SoapMethods soapMethods = new SoapMethods();
                public GetServerInfoResponse GetServerInfo(){
                                try {
                                                System.out.println("Fetching server info");
                                                SoapResponse soapresponse = new SoapResponse();
                                                soapresponse = soapMethods.getSoapResponse();
                                                if (soapresponse == null){throw new Exception ("Soap response is null");}
                                                SOAPBody body = soapresponse.getSoapbody();
                                                SOAPMessage request = soapresponse.getSoapmessage();
                                                Dispatch<SOAPMessage> dispatch = soapresponse.getDispatch();
                                                
                                                // Construct the message payload.
                                                SOAPElement operation = body.addChildElement("getServerInfo","ws",soapConstants.getNamespaceURI());
                                                operation.setPrefix("ws");
                                                SOAPElement value_username = operation.addChildElement("username");
                                                value_username.addTextNode("WS_FG42");
                                                SOAPElement value_password = operation.addChildElement("password");
                                                value_password.addTextNode("pRuwbd");
                                                SOAPElement value_code = operation.addChildElement("code");
                                                value_code.addTextNode("2197");
                                                SOAPElement value_infinityCode = operation.addChildElement("infinityCode");
                                                value_infinityCode.addTextNode("1328KE46406");
                                                
                                                request.saveChanges();
                                                soapMethods.PrintXml(request);              
                                                dispatch.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "cX26K2W836QT8Up");
                                                dispatch.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "D57Jc8SdsSJ1gAE");
                                                SOAPMessage response = dispatch.invoke(request);
                                                
                                                soapMethods.PrintXml(response);
                                                
                                                GetServerInfoResponse serverInfo = new GetServerInfoResponse();

                                    SOAPBody sb = response.getSOAPBody();
                                    NodeList list = sb.getElementsByTagName("*");
                                    for (int i = 0; i < list.getLength(); i++) {
                                                NodeList innerList = list.item(i).getChildNodes();

                                                for (int j = 0; j < innerList.getLength(); j++) {
                                                                if (innerList.item(j).getNodeName().equals("country")){
                                                                                serverInfo.setCountry(innerList.item(j).getTextContent());
                                                                }
                                                                if (innerList.item(j).getNodeName().equals("responseCode")){
                                                                                serverInfo.setResponseCode(innerList.item(j).getTextContent());
                                                                }
                                                                if (innerList.item(j).getNodeName().equals("version")){
                                                                               serverInfo.setVersion(innerList.item(j).getTextContent());
                                                                }
                                                }              
                                    }
                                                return serverInfo;
                                } catch (Exception e){
                                                e.printStackTrace();
                                                return null;
                                }
                }
                
                public GetRegistrationStatusResponse GetRegistrationStatus(){
            		try {
            			System.out.println("Fetching registration status");
            			SoapResponse soapresponse = new SoapResponse();
            			soapresponse = soapMethods.getSoapResponse();
            			if (soapresponse == null){throw new Exception ("Soap response is null");}
            			SOAPBody body = soapresponse.getSoapbody();
            			SOAPMessage request = soapresponse.getSoapmessage();
            			Dispatch<SOAPMessage> dispatch = soapresponse.getDispatch();
            			
            			// Construct the message payload.
            			SOAPElement operation = body.addChildElement("getProduct401","ws",soapConstants.getNamespaceURI());
            			operation.setPrefix("ws");
            			SOAPElement value_username = operation.addChildElement("username");
                        value_username.addTextNode("WS_FG42");
                        SOAPElement value_password = operation.addChildElement("password");
                        value_password.addTextNode("pRuwbd");
                        SOAPElement value_code = operation.addChildElement("code");
                        value_code.addTextNode("2197");
                        SOAPElement value_infinityCode = operation.addChildElement("infinityCode");
                        value_infinityCode.addTextNode("1328KE46406");
                        
            			
            			SOAPElement value_phoneNumber = operation.addChildElement("phoneNumber");
            			value_phoneNumber.addTextNode("254717776274");
            			SOAPElement value_reportSector = operation.addChildElement("reportSector");
            			value_reportSector.addTextNode("2");
            			SOAPElement value_reportReason = operation.addChildElement("reportReason");
            			value_reportReason.addTextNode("4");
            			SOAPElement value_message = operation.addChildElement("message");
            			value_message.addTextNode("New User Registration check");
            			
            			request.saveChanges();
            			System.out.println("REQUEST");
            			System.out.println("------------------------");
            			soapMethods.PrintXml(request);	
            			dispatch.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "cX26K2W836QT8Up");
                        dispatch.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "D57Jc8SdsSJ1gAE");
            			SOAPMessage response = dispatch.invoke(request);
            			System.out.println("RESPONSE");
            			System.out.println("------------------------");
            			soapMethods.PrintXml(response);
            			
            			GetRegistrationStatusResponse getRegistrationStatusResponse = new GetRegistrationStatusResponse();

            		    SOAPBody sb = response.getSOAPBody();
            		    NodeList list = sb.getElementsByTagName("*");
            		    for (int i = 0; i < list.getLength(); i++) {
            		    	NodeList innerList = list.item(i).getChildNodes();

            		    	for (int j = 0; j < innerList.getLength(); j++) {
            		    		if (innerList.item(j).getNodeName().equals("responseCode")){
            		    			getRegistrationStatusResponse.setResponseCode(innerList.item(j).getTextContent());
            		    		}
            		    	}	
            		    }
            			return getRegistrationStatusResponse;
            		} catch (Exception e){
            			e.printStackTrace();
            			return null;
            		}
            }
                public GetRegistrationMobileUserResponse GetMobileRegistration()
                {
                    try {
                                                        System.out.println("Fetching registration status");
                                                        SoapResponse soapresponse = new SoapResponse();
                                                        soapresponse = soapMethods.getSoapResponse();
                                                        if (soapresponse == null)
                                {
                                    throw new Exception ("Soap response is null");
                                }
                                                        SOAPBody body = soapresponse.getSoapbody();
                                                        SOAPMessage request = soapresponse.getSoapmessage();
                                                        Dispatch<SOAPMessage> dispatch = soapresponse.getDispatch();
                                                        
                                                        // Construct the message payload.
                                                        SOAPElement operation = body.addChildElement("getProduct402","ws",soapConstants.getNamespaceURI());
                                                        operation.setPrefix("ws");
                                                        SOAPElement value_username = operation.addChildElement("username");
                                                        value_username.addTextNode("WS_FG42");
                                                        SOAPElement value_password = operation.addChildElement("password");
                                                        value_password.addTextNode("pRuwbd");
                                                        SOAPElement value_code = operation.addChildElement("code");
                                                        value_code.addTextNode("2197");
                                                        SOAPElement value_infinityCode = operation.addChildElement("infinityCode");
                                                        value_infinityCode.addTextNode("1328KE46406");
                                                        ;
                                
                                SOAPElement value_documentNumber = operation.addChildElement("documentNumber");
                                //add document number here for 402
                                                        value_documentNumber.addTextNode("30539475");
                                
                                SOAPElement value_names = operation.addChildElement("names");
                                //names
                                                        value_names.addTextNode("Purity");
                                
                                
                                                        
                                                        SOAPElement value_phoneNumber = operation.addChildElement("phoneNumber");
                                                        value_phoneNumber.addTextNode ("254706943520");
                                
                                
                                                        SOAPElement value_reportSector = operation.addChildElement("reportSector");
                                                        value_reportSector.addTextNode("2");
                                                        SOAPElement value_reportReason = operation.addChildElement("reportReason");
                                                        value_reportReason.addTextNode("4");
                                                        
                                                        
                                                        request.saveChanges();
                                                        soapMethods.PrintXml(request);              
                                                        dispatch.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "cX26K2W836QT8Up");
                                                        dispatch.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "D57Jc8SdsSJ1gAE");
                                                        SOAPMessage response = dispatch.invoke(request);
                                                        
                                                        soapMethods.PrintXml(response);
                                                        
                                                        GetRegistrationMobileUserResponse getRegistrationMobileUserResponse = new GetRegistrationMobileUserResponse();

                                            SOAPBody sb = response.getSOAPBody();
                                            NodeList list = sb.getElementsByTagName("*");
                                            for (int i = 0; i < list.getLength(); i++) {
                                                        NodeList innerList = list.item(i).getChildNodes();

                                                        for (int j = 0; j < innerList.getLength(); j++) {
                                                                        if (innerList.item(j).getNodeName().equals("responseCode")){
                                                                                        getRegistrationMobileUserResponse.setResponseCode(innerList.item(j).getTextContent());
                                                                        }
                                                        }              
                                            }
                                                        return getRegistrationMobileUserResponse;
                                        } catch (Exception e){
                                                        e.printStackTrace();
                                                        return null;
                                        }
                }
        public GetCreditStatusResponse GetCreditStatus(){
                                try {
                                                System.out.println("Fetching credit status");
                                                SoapResponse soapresponse = new SoapResponse();
                                                soapresponse = soapMethods.getSoapResponse();
                                                if (soapresponse == null)
                        {
                            throw new Exception ("Soap response is null");
                        }
                                                SOAPBody body = soapresponse.getSoapbody();
                                                SOAPMessage request = soapresponse.getSoapmessage();
                                                Dispatch<SOAPMessage> dispatch = soapresponse.getDispatch();
                                                
                                                // Construct the message payload.
                                                SOAPElement operation = body.addChildElement("getProduct403","ws",soapConstants.getNamespaceURI());
                                                operation.setPrefix("ws");
                                                SOAPElement value_username = operation.addChildElement("username");
                                                value_username.addTextNode("WS_FG42");
                                                SOAPElement value_password = operation.addChildElement("password");
                                                value_password.addTextNode("pRuwbd");
                                                SOAPElement value_code = operation.addChildElement("code");
                                                value_code.addTextNode("2197");
                                                SOAPElement value_infinityCode = operation.addChildElement("infinityCode");
                                                value_infinityCode.addTextNode("1328KE46406");
                                                
                                                
                                                SOAPElement value_phoneNumber = operation.addChildElement("phoneNumber");
                                                value_phoneNumber.addTextNode("254700187501 ");
                                                SOAPElement value_reportSector = operation.addChildElement("reportSector");
                                                value_reportSector.addTextNode("2");
                                                SOAPElement value_reportReason = operation.addChildElement("reportReason");
                                                value_reportReason.addTextNode("4");
                                                
                                                
                                                request.saveChanges();
                                                soapMethods.PrintXml(request);              
                                                dispatch.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "cX26K2W836QT8Up");
                                                dispatch.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "D57Jc8SdsSJ1gAE");
                                                SOAPMessage response = dispatch.invoke(request);
                                                
                                                soapMethods.PrintXml(response);
                                                
                                                GetCreditStatusResponse getCreditStatusResponse = new GetCreditStatusResponse();

                                    SOAPBody sb = response.getSOAPBody();
                                    NodeList list = sb.getElementsByTagName("*");
                                    for (int i = 0; i < list.getLength(); i++) {
                                                NodeList innerList = list.item(i).getChildNodes();

                                                for (int j = 0; j < innerList.getLength(); j++) {
                                                                if (innerList.item(j).getNodeName().equals("category")){
                                                                	getCreditStatusResponse.setcategory(innerList.item(j).getTextContent());
                                                                }
                                                }
                      /*  for (int j = 0; j < innerList.getLength(); j++) {
                                                                if (innerList.item(j).getNodeName().equals("accountList")){
                                                                                getMobileCreditResponse.setAccountList((List) innerList.item(j).getUserData("accountList"));
                                                                }
                                                } */
                       
                                    }
                                                return getCreditStatusResponse;
                                } catch (Exception e){
                                                e.printStackTrace();
                                                return null;
                                }
                }
        
        
        
        public GetPaymentResponse GetPayment()
        {
            try {
                                                System.out.println("Fetching payment status");
                                                SoapResponse soapresponse = new SoapResponse();
                                                soapresponse = soapMethods.getSoapResponse();
                                                if (soapresponse == null)
                        {
                            throw new Exception ("Soap response is null");
                        }
                                                SOAPBody body = soapresponse.getSoapbody();
                                                SOAPMessage request = soapresponse.getSoapmessage();
                                                Dispatch<SOAPMessage> dispatch = soapresponse.getDispatch();
                                                
                                                // Construct the message payload.
                                                SOAPElement operation = body.addChildElement("getProduct405","ws",soapConstants.getNamespaceURI());
                                                operation.setPrefix("ws");
                                                SOAPElement value_username = operation.addChildElement("username");
                                                value_username.addTextNode("WS_FG42");
                                                SOAPElement value_password = operation.addChildElement("password");
                                                value_password.addTextNode("pRuwbd");
                                                SOAPElement value_code = operation.addChildElement("code");
                                                value_code.addTextNode("2197");
                                                SOAPElement value_infinityCode = operation.addChildElement("infinityCode");
                                                value_infinityCode.addTextNode("1328KE46406");
                                                
                        
                        SOAPElement value_dest = operation.addChildElement("dest");
                        //add destination for 405
                                                value_dest.addTextNode(" ");
                        
                        SOAPElement value_origin = operation.addChildElement("origin");
                        //add origin for 405
                                                value_origin.addTextNode(" ");
                        
                        SOAPElement value_receivedTimeStamp = operation.addChildElement("receivedTimeStamp");
                        //add timestamp
                                                value_receivedTimeStamp.addTextNode(" ");
                        
                        SOAPElement value_transactionDate = operation.addChildElement("transactionDate");
                        //add transaction date
                                                value_transactionDate.addTextNode(" ");
                        
                         SOAPElement value_transactionTime = operation.addChildElement("transactionTime");
                        //add transaction time
                                                value_transactionTime.addTextNode(" ");
                        
                         SOAPElement value_textToUser = operation.addChildElement("textToUser");
                        //add text to user
                                                value_textToUser.addTextNode(" ");
                        
                         SOAPElement value_transactionCode = operation.addChildElement("transactionCode");
                        //add transaction code
                                                value_transactionCode.addTextNode(" ");
                        
                         SOAPElement value_transactionAccount = operation.addChildElement("transactionAccount");
                        //add transaction account
                                                value_transactionAccount.addTextNode(" ");
                        
                        
                        SOAPElement value_senderNames = operation.addChildElement("senderNames");
                        //add sender name
                                                value_senderNames.addTextNode(" ");
                        
                         SOAPElement value_transactionAmount = operation.addChildElement("transactionAmount");
                        //add transaction amount
                                                value_transactionAmount.addTextNode(" ");
                     
                                                SOAPElement value_phoneNumber = operation.addChildElement("phoneNumber");
                                                value_phoneNumber.addTextNode("254723263151");
                      
                                                
                                                
                                                request.saveChanges();
                                                soapMethods.PrintXml(request);              
                                                dispatch.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "cX26K2W836QT8Up");
                                                dispatch.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "D57Jc8SdsSJ1gAE");
                                                SOAPMessage response = dispatch.invoke(request);
                                                
                                                soapMethods.PrintXml(response);
                                                
                                                GetPaymentResponse getPaymentResponse = new GetPaymentResponse();

                                    SOAPBody sb = response.getSOAPBody();
                                    NodeList list = sb.getElementsByTagName("*");
                                    for (int i = 0; i < list.getLength(); i++) {
                                                NodeList innerList = list.item(i).getChildNodes();

                                                for (int j = 0; j < innerList.getLength(); j++) {
                                                                if (innerList.item(j).getNodeName().equals("responseCode")){
                                                                	getPaymentResponse.setResponseCode(innerList.item(j).getTextContent());
                                                                }
                                                }              
                                    }
                                                return getPaymentResponse;
                                } catch (Exception e){
                                                e.printStackTrace();
                                                return null;
                                }
        }
        
        public GetCreditReportRequestResponse GetCreditRequest()
        {
            try {
                                                System.out.println("Fetching Report Request");
                                                SoapResponse soapresponse = new SoapResponse();
                                                soapresponse = soapMethods.getSoapResponse();
                                                if (soapresponse == null){throw new Exception ("Soap response is null");}
                                                SOAPBody body = soapresponse.getSoapbody();
                                                SOAPMessage request = soapresponse.getSoapmessage();
                                                Dispatch<SOAPMessage> dispatch = soapresponse.getDispatch();
                                                
                                                // Construct the message payload.
                                                SOAPElement operation = body.addChildElement("getProduct406","ws",soapConstants.getNamespaceURI());
                                                operation.setPrefix("ws");
                                                SOAPElement value_username = operation.addChildElement("username");
                                                value_username.addTextNode("WS_FG42");
                                                SOAPElement value_password = operation.addChildElement("password");
                                                value_password.addTextNode("pRuwbd");
                                                SOAPElement value_code = operation.addChildElement("code");
                                                value_code.addTextNode("2197");
                                                SOAPElement value_infinityCode = operation.addChildElement("infinityCode");
                                                value_infinityCode.addTextNode("1328KE46406");
                                                
                        
                        SOAPElement value_emailAddress = operation.addChildElement("emailAddress");
                                                value_emailAddress.addTextNode("puritymaina001@gmail.com");
                                                
                        SOAPElement value_phoneNumber = operation.addChildElement("phoneNumber");
                                                value_phoneNumber.addTextNode("254723263151");
                             
                                                SOAPElement value_reportSector = operation.addChildElement("reportSector");
                                                value_reportSector.addTextNode("2");
                                                SOAPElement value_reportReason = operation.addChildElement("reportReason");
                                                value_reportReason.addTextNode("4");
                                                
                        
                                                request.saveChanges();
                                                soapMethods.PrintXml(request);              
                                                dispatch.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "cX26K2W836QT8Up");
                                                dispatch.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "D57Jc8SdsSJ1gAE");
                                                SOAPMessage response = dispatch.invoke(request);
                                                
                                                soapMethods.PrintXml(response);
                                                
                                                GetCreditReportRequestResponse getCreditReportRequestResponse = new GetCreditReportRequestResponse();

                                  SOAPBody sb = response.getSOAPBody();
                                    NodeList list = sb.getElementsByTagName("*");
                                    for (int i = 0; i < list.getLength(); i++) {
                                                NodeList innerList = list.item(i).getChildNodes();

                                                for (int j = 0; j < innerList.getLength(); j++) {
                                                                if (innerList.item(j).getNodeName().equals("responseCode")){
                                                                	getCreditReportRequestResponse.setResponseCode(innerList.item(j).getTextContent());
                                                                }
                                                }              
                                    }
                                                return getCreditReportRequestResponse;
                                } catch (Exception e){
                                                e.printStackTrace();
                                                return null;
                                }
        }
       public GetConfirmRegistrationResponse GetConfirmRegistration()
       {
           try {
                                                System.out.println("Confirming Registration Response info");
                                                SoapResponse soapresponse = new SoapResponse();
                                                soapresponse = soapMethods.getSoapResponse();
                                                if (soapresponse == null){throw new Exception ("Soap response is null");}
                                                SOAPBody body = soapresponse.getSoapbody();
                                                SOAPMessage request = soapresponse.getSoapmessage();
                                                Dispatch<SOAPMessage> dispatch = soapresponse.getDispatch();
                                                
                                                // Construct the message payload.
                                                SOAPElement operation = body.addChildElement("getProduct407","ws",soapConstants.getNamespaceURI());
                                                operation.setPrefix("ws");
                                                SOAPElement value_username = operation.addChildElement("username");
                                                value_username.addTextNode("WS_FG42");
                                                SOAPElement value_password = operation.addChildElement("password");
                                                value_password.addTextNode("pRuwbd");
                                                SOAPElement value_code = operation.addChildElement("code");
                                                value_code.addTextNode("2197");
                                                SOAPElement value_infinityCode = operation.addChildElement("infinityCode");
                                                value_infinityCode.addTextNode("1328KE46406");
                                                
                        
                        SOAPElement value_documentNumber = operation.addChildElement("documentNumber");
                                                value_documentNumber.addTextNode(" ");
                                                
                        SOAPElement value_phoneNumber = operation.addChildElement("phoneNumber");
                                                value_phoneNumber.addTextNode("254723263151");
                             
                                                
                                                
                        
                                                request.saveChanges();
                                                soapMethods.PrintXml(request);              
                                                dispatch.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "cX26K2W836QT8Up");
                                                dispatch.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "D57Jc8SdsSJ1gAE");
                                                SOAPMessage response = dispatch.invoke(request);
                                                
                                                soapMethods.PrintXml(response);
                                                
                                                GetConfirmRegistrationResponse getConfirmRegistrationResponse = new GetConfirmRegistrationResponse();

                                  SOAPBody sb = response.getSOAPBody();
                                    NodeList list = sb.getElementsByTagName("*");
                                    for (int i = 0; i < list.getLength(); i++) {
                                                NodeList innerList = list.item(i).getChildNodes();

                                                for (int j = 0; j < innerList.getLength(); j++) {
                                                                if (innerList.item(j).getNodeName().equals("responseCode")){
                                                                	getConfirmRegistrationResponse.setResponseCode(innerList.item(j).getTextContent());
                                                                }
                                                }              
                                    }
                                                return getConfirmRegistrationResponse;
                                } catch (Exception e){
                                                e.printStackTrace();
                                                return null;
                                }
       }
       
       public GetCreditCertificateRequestResponse GetCreditCertificateRequest()
       {
            try {
                                                System.out.println("Fetching credit certificate");
                                                SoapResponse soapresponse = new SoapResponse();
                                                soapresponse = soapMethods.getSoapResponse();
                                                if (soapresponse == null){throw new Exception ("Soap response is null");}
                                                SOAPBody body = soapresponse.getSoapbody();
                                                SOAPMessage request = soapresponse.getSoapmessage();
                                                Dispatch<SOAPMessage> dispatch = soapresponse.getDispatch();
                                                
                                                // Construct the message payload.
                                                SOAPElement operation = body.addChildElement("getProduct408","ws",soapConstants.getNamespaceURI());
                                                operation.setPrefix("ws");
                                                SOAPElement value_username = operation.addChildElement("username");
                                                value_username.addTextNode("WS_FG42");
                                                SOAPElement value_password = operation.addChildElement("password");
                                                value_password.addTextNode("pRuwbd");
                                                SOAPElement value_code = operation.addChildElement("code");
                                                value_code.addTextNode("2197");
                                                SOAPElement value_infinityCode = operation.addChildElement("infinityCode");
                                                value_infinityCode.addTextNode("1328KE46406");
                                                
                        
                        SOAPElement value_emailAddress = operation.addChildElement("emailAddress");
                                                value_emailAddress.addTextNode("puritymaina001@gmail.com");
                                                
                        SOAPElement value_phoneNumber = operation.addChildElement("phoneNumber");
                                                value_phoneNumber.addTextNode("254723263151");
                             
                                                
                                                
                        
                                                request.saveChanges();
                                                soapMethods.PrintXml(request);              
                                                dispatch.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "cX26K2W836QT8Up");
                                                dispatch.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "D57Jc8SdsSJ1gAE");
                                                SOAPMessage response = dispatch.invoke(request);
                                                
                                                soapMethods.PrintXml(response);
                                                
                                                GetCreditCertificateRequestResponse getCreditCertificateRequestResponse = new GetCreditCertificateRequestResponse();

                                  SOAPBody sb = response.getSOAPBody();
                                    NodeList list = sb.getElementsByTagName("*");
                                    for (int i = 0; i < list.getLength(); i++) {
                                                NodeList innerList = list.item(i).getChildNodes();

                                                for (int j = 0; j < innerList.getLength(); j++) {
                                                                if (innerList.item(j).getNodeName().equals("responseCode")){
                                                                	getCreditCertificateRequestResponse.setResponseCode(innerList.item(j).getTextContent());
                                                                }
                                                }              
                                    }
                                                return getCreditCertificateRequestResponse;
                                } catch (Exception e){
                                                e.printStackTrace();
                                                return null;
                                }
            
                
       }
       
       public GetCreditScoreResponse GetCreditScore()
       {
             try {
                                                System.out.println("Fetching credit score");
                                                SoapResponse soapresponse = new SoapResponse();
                                                soapresponse = soapMethods.getSoapResponse();
                                                if (soapresponse == null){throw new Exception ("Soap response is null");}
                                                SOAPBody body = soapresponse.getSoapbody();
                                                SOAPMessage request = soapresponse.getSoapmessage();
                                                Dispatch<SOAPMessage> dispatch = soapresponse.getDispatch();
                                                
                                                // Construct the message payload.
                                                SOAPElement operation = body.addChildElement("getProduct409","ws",soapConstants.getNamespaceURI());
                                                operation.setPrefix("ws");
                                                SOAPElement value_username = operation.addChildElement("username");
                                                value_username.addTextNode("WS_FG42");
                                                SOAPElement value_password = operation.addChildElement("password");
                                                value_password.addTextNode("pRuwbd");
                                                SOAPElement value_code = operation.addChildElement("code");
                                                value_code.addTextNode("2197");
                                                SOAPElement value_infinityCode = operation.addChildElement("infinityCode");
                                                value_infinityCode.addTextNode("1328KE46406");
                                                
                      
                        SOAPElement value_phoneNumber = operation.addChildElement("phoneNumber");
                                                value_phoneNumber.addTextNode("254723263151");
                             
                                                
                                                
                        
                                                request.saveChanges();
                                                soapMethods.PrintXml(request);              
                                                dispatch.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "cX26K2W836QT8Up");
                                                dispatch.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "D57Jc8SdsSJ1gAE");
                                                SOAPMessage response = dispatch.invoke(request);
                                                
                                                soapMethods.PrintXml(response);
                                                
                                                GetCreditScoreResponse getCreditScoreResponse = new GetCreditScoreResponse();

                                  SOAPBody sb = response.getSOAPBody();
                                    NodeList list = sb.getElementsByTagName("*");
                                    for (int i = 0; i < list.getLength(); i++) {
                                                NodeList innerList = list.item(i).getChildNodes();

                                                for (int j = 0; j < innerList.getLength(); j++) {
                                                                
                                                                if (innerList.item(j).getNodeName().equals("responseCode")){
                                                                                getCreditScoreResponse.setResponseCode(innerList.item(j).getTextContent());
                                                                }
                                                                
                                                }              
                                    }
                                                return getCreditScoreResponse;
                                } catch (Exception e){
                                                e.printStackTrace();
                                                return null;
                                }
       }
}
