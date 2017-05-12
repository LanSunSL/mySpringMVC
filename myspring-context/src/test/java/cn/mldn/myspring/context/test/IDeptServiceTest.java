package cn.mldn.myspring.context.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.myspring.context.service.IDeptService;
import cn.mldn.myspring.context.vo.Dept;
import junit.framework.TestCase;

@ContextConfiguration(locations ={"classpath:spring/spring-common.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class IDeptServiceTest {
	@Resource
	private IDeptService deptService;
	@Test
	public void testAdd() {
		Dept vo = new Dept();
		vo.setDeptno(200);
		vo.setDname("Sales");
		TestCase.assertTrue(deptService.add(vo));
	}

}
