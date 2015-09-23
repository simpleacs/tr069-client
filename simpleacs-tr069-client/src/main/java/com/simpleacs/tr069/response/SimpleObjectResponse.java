/*
 * Copyright 2014 VNPT-Technology. All rights reserved.
 * VNPT-Technology PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.simpleacs.tr069.response;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import com.simpleacs.tr069.datamodel.SimpleObject;

/**
 *
 * @author Vunb
 * @date Jun 9, 2014
 * @update Jun 9, 2014
 */
public class SimpleObjectResponse extends ListTemplResponse<SimpleObject> {

    @Override
    @XmlElementWrapper(name = "Results")
    @XmlElement(name = "SimpleObject")
    public ArrayList<SimpleObject> getRetValue() {
        return super.getRetValue();
    }

}
