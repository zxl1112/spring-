package com.statement.test;

import com.statement.controller.StatementController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLTest {
    public static void main(String [] args){
        ApplicationContext context=new ClassPathXmlApplicationContext
                ("/com/statement/xml/annotationstatementapplicationContext.xml");
        StatementController ct=(StatementController) context.getBean("sattementController");
        ct.test();
    }
}
