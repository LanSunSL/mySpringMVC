package cn.mldn.myspring.resource;

import java.io.IOException;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.myspring.resource.util.ResourceUtil;

@ContextConfiguration(locations={"classpath:spring/spring-resource.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestResourceTest{
	@Resource
	private ResourceUtil resourceUtil;
	@Test
	public void testPrint() {
		try {
			this.resourceUtil.print();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}