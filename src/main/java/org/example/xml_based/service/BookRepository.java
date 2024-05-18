package org.example.xml_based.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookRepository implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init");
    }

    public void destroyXml() {
        System.out.println("destroy-xml");
    }

    public void initXml() {
        System.out.println("init-xml");
    }

}
