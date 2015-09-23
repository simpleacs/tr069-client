/*
 * Copyright 2014 VNPT-Technology. All rights reserved.
 * VNPT-Technology PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.simpleacs.tr069.response;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import com.simpleacs.tr069.datamodel.NamedKeyValue;

/**
 *
 * @author Vunb
 * @date Oct 21, 2014
 * @update Oct 21, 2014
 */
public class NamedKeyValueResponse extends ListTemplResponse<NamedKeyValue> {

    @Override
    @XmlElementWrapper(name = "Results")
    @XmlElement(name = "NamedItem")
    public ArrayList<NamedKeyValue> getRetValue() {
        return super.getRetValue();
    }

    public void addDescription(String description) {
        this.addRetValue(new NamedKeyValue("Description", description));
    }

    public void addNamedKeyValue(String key, String value) {
        this.addRetValue(new NamedKeyValue(key, value));
    }

}
