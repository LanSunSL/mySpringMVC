package cn.mldn.myspring.context.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.myspring.context.dao.IDeptDAO;
import cn.mldn.myspring.context.service.IDeptService;
import cn.mldn.myspring.context.vo.Dept;
@Service
public class DeptServiceImpl implements IDeptService {
	@Resource
	private IDeptDAO deptDAO ;
	
	@Override
	public boolean add(Dept vo) {
		System.out.println("**********【IDeptService业务层：数据增加】**********");
		return this.deptDAO.doCreate(vo);
	}

}
