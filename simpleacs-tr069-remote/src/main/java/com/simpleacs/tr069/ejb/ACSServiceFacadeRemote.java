/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simpleacs.tr069.ejb;

import com.simpleacs.tr069.datamodel.SimpleObject;
import com.simpleacs.tr069.response.BasicResponse;
import java.util.ArrayList;
import javax.ejb.Remote;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Vunb
 */
@Remote
public interface ACSServiceFacadeRemote {

    @WebMethod
    BasicResponse addObjectValue(
            @WebParam(name = "serialNumber") @XmlElement(required = true) String serialNumber,
            @WebParam(name = "requestUrl") @XmlElement(required = true) String urlRequestCpe,
            @WebParam(name = "dataTree") @XmlElement(required = true) String dataTree,
            @WebParam(name = "typeAddObj") @XmlElement(required = true) String typeAddObj,
            @WebParam(name = "simpleObject") @XmlElement(required = true) ArrayList<SimpleObject> data
    );

    @WebMethod
    BasicResponse getDataTree(
            @WebParam(name = "serialNumber") @XmlElement(required = true) String serialNumber,
            @WebParam(name = "requestUrl") @XmlElement(required = true) String urlRequestCpe,
            @WebParam(name = "dataTree") @XmlElement(required = true) String dataTree);

    @WebMethod
    public BasicResponse setValue(
            @WebParam(name = "serialNumber") @XmlElement(required = true) String serialNumber,
            @WebParam(name = "requestUrl") @XmlElement(required = true) String urlRequestCpe,
            @WebParam(name = "simpleObject") ArrayList<SimpleObject> data);
}
