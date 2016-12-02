package com.aicubes;

import javax.ws.rs.GET;
import javax.ws.rs.POST;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.core.MediaType;


/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {



//	/**
//     * Method handling HTTP GET requests. The returned object will be sent
//     * to the client as "text/plain" media type.
//     *
//     * @return String that will be returned as a text/plain response.
//     */
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getIt(@DefaultValue("2") @QueryParam("step") int step) {
//    	JaxbBean jaxb= new JaxbBean("tarek");
//
//        return "{\"data\" : \"Got it! GET\", \"step\" : " + step +  "}";
//    }
    
    
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String setIt() {
  
        return "{\"data\" : \"Got it! POST\"}";
    }
    
    
    
    
	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Device getIt2(@DefaultValue("2") @QueryParam("value") String value) {
    	Device device= new Device();
    	
        return device;
    }
    
    
    
    
    
    
    
    
    
}
