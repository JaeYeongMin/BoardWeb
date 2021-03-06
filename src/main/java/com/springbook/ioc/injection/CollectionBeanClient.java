package com.springbook.ioc.injection;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

    public static void main(String[] args) {
        
        
        AbstractApplicationContext factory =
                new GenericXmlApplicationContext("applicationContext.xml");
        
        CollectionBean bean =(CollectionBean) factory.getBean("collectionBean");
        
        List<String> addrList = bean.getAddrList();
        
        for (String addr : addrList) {
            System.out.println(addr.toString());
        }
        
        factory.close();

    }

}
