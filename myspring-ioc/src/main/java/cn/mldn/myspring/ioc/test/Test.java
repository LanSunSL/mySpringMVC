package cn.mldn.myspring.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.myspring.ioc.service.IMessage;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-ioc.xml");
		IMessage obj = context.getBean("msg", IMessage.class);
		System.out.println(obj.getInfo());
	}

}
