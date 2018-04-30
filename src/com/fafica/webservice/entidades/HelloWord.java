package com.fafica.webservice.entidades;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding (style = Style.RPC)	
public interface HelloWord {
	
	@WebMethod
	String Ola();

}
