package cn.mldn.myspring.resource;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class TestResource {
	public static void main(String[] args) throws IOException {
//		String info = "www.helloworld.com; www.nihao.cn";
//		Resource res = new ByteArrayResource(info.getBytes());
		
//		File file = new File("D:" + File.separator + "info.txt");
//		Resource res = new FileSystemResource(file);
		
//		String path = "spring/spring-resource.xml";
//		Resource res = new ClassPathResource(path);
		
//		String path = "file:" + "D:" + File.separator + "info.txt";
//		String path = "classpath:spring/spring-resource.xml";
		String path = "http://www.springframework.org/schema/beans/spring-beans.xsd";
		ResourceLoader loader = new DefaultResourceLoader();
		Resource res = loader.getResource(path);
		
		
		
		Scanner scan = new Scanner(res.getInputStream());
		scan.useDelimiter("\n");
		while (scan.hasNext()) {
			System.out.println(scan.next());
		}
		scan.close();
	}
}
