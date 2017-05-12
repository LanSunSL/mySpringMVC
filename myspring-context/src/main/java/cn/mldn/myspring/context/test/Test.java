package cn.mldn.myspring.context.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.myspring.context.service.IDeptService;
import cn.mldn.myspring.context.vo.Dept;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-*.xml");
		IDeptService deptService = context.getBean("deptServiceImpl", IDeptService.class);
		Dept vo = new Dept();
		vo.setDeptno(100);
		vo.setDname("TEST");
		System.out.println(deptService.add(vo));
	}

}
