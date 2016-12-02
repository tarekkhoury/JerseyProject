package com.aicubes;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class JaxbBean {
 
    private String value;
 
    public JaxbBean() {}
 
    public JaxbBean(final String value) {
        this.value = value;
    }
 
    public String getValue() {
        return value;
    }
 
    public void setValue(final String value) {
        this.value = value;
    }
}