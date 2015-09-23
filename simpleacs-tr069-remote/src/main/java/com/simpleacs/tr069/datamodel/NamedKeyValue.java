/*
 * Copyright 2014 VNPT-Technology. All rights reserved.
 * VNPT-Technology PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.simpleacs.tr069.datamodel;

/**
 *
 * @author Vunb
 * @date Oct 21, 2014
 * @update Oct 21, 2014
 */
public class NamedKeyValue {

    private String key;
    private String value;
    private String tag;

    public NamedKeyValue() {
    }

    public NamedKeyValue(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}
