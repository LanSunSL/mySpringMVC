package cn.mldn.myspring.context.dao.impl;

import cn.mldn.myspring.context.dao.IDeptDAO;
import cn.mldn.myspring.context.vo.Dept;

public class DeptDAOImpl implements IDeptDAO {

	@Override
	public boolean doCreate(Dept vo) {
		System.out.println("*********【IDeptDAO数据层：数据增加】*********");
		return true;
	}

}
