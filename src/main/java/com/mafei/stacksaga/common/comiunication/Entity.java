package com.mafei.stacksaga.common.comiunication;

import java.io.Serializable;

public class Entity implements Serializable {

    private Object data;

    public void setBody(Object data) {
        this.data = data;
    }

    public <T> T get(Class<?> aClass) {
        return (T) aClass.cast(data);
    }
}
