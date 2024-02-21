package com.l4cky_russ1ano.weblistenerevents;

import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionActivationListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionBindingListener;

//interfaces which allow listen event in our application
//ServletContextListener
//HttpSessionListener
//HttpSessionAttributeListener
//HttpSessionActivationListener
//HttpSessionBindingListener
//ServletRequestListener
//ServletRequestAttributeListener



//@WebListener
public class HttpSessionListenerExample implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("Was adding next attribute: " +event.getName() + event.getValue().toString());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        HttpSessionAttributeListener.super.attributeRemoved(event);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        HttpSessionAttributeListener.super.attributeReplaced(event);
    }
}
