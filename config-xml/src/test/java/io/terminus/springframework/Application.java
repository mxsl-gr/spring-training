package io.terminus.springframework;

import io.terminus.springframework.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gengrong on 2017/3/19.
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        MessageService messageService = (MessageService) ctx.getBean("messageService");
        System.out.println(messageService.getMessage());
    }
}
