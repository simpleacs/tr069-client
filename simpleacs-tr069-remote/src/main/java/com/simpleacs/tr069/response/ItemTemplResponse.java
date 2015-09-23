/*
 * Copyright 2015 VNPT-Technology. All rights reserved.
 * VNPT-Technology PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.simpleacs.tr069.response;

/**
 *
 * @author Vunb
 * @param <T>
 * @date Jul 17, 2015
 * @update Jul 17, 2015
 */
public abstract class ItemTemplResponse<T> {

    private int errorCode;
    private String message;
    private T retValue;

    public ItemTemplResponse() {
        this.errorCode = 0;
        this.message = "(not provided)";
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    protected T getRetValue() {
        return retValue;
    }

    public void setRetValue(T retValue) {
        this.retValue = retValue;
    }

}
