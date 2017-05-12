package cn.mldn.myspring.context.service.impl;

import cn.mldn.myspring.context.dao.IDeptDAO;
import cn.mldn.myspring.context.service.IDeptService;
import cn.mldn.myspring.context.vo.Dept;

public class DeptServiceImpl implements IDeptService {
	private IDeptDAO deptDAO ;
	public void setDeptDAO(IDeptDAO deptDAO) {
		this.deptDAO = deptDAO;
	}
	@Override
	public boolean add(Dept vo) {
		System.out.println("**********【IDeptService业务层：数据增加】**********");
		return this.deptDAO.doCreate(vo);
	}

}
