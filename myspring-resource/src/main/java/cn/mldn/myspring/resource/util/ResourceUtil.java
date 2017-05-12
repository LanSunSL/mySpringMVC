package cn.mldn.myspring.resource.util;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.core.io.Resource;

public class ResourceUtil {
	private Resource[] src ;
	public void setSrc(Resource[] src) {
		this.src = src;
	}
	public void print() throws IOException {
		for (int i = 0 ; i < src.length ; i ++) {
			Scanner scan = new Scanner(src[i].getInputStream());
			scan.useDelimiter("\n");
			while (scan.hasNext()) {
				System.out.println(scan.next());
			}
			System.out.println("**************************************");
		}
	}
}
