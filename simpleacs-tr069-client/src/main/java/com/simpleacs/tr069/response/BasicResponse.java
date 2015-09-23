/*
 * Copyright 2014 VNPT-Technology. All rights reserved.
 * VNPT-Technology PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.simpleacs.tr069.response;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 *
 * @author Vunb
 * @date Jun 9, 2014
 * @update Jun 9, 2014
 */
public class BasicResponse extends ListTemplResponse<String> {

    @Override
    @XmlElementWrapper(name = "Results")
    @XmlElement(name = "String")
    public ArrayList<String> getRetValue() {
        return super.getRetValue();
    }

    public void addRetValue(boolean retValue) {
        this.addRetValue(String.valueOf(retValue));
    }

}
