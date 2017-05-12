package cn.mldn.myspring.ioc.service.impl;

import cn.mldn.myspring.ioc.service.IMessage;

public class MessageImpl implements IMessage {

	public String getInfo() {
		return "www.mldn.cn";
	}

}
