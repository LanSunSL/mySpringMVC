package cn.mldn.myspring.di.vo;

import java.io.Serializable;
import java.util.Arrays;

@SuppressWarnings("serial")
public class Dept implements Serializable {
	private Integer deptno;
	private String dname ;
	private Emp mgr;
	private Emp[] emps;
	public void setEmps(Emp[] emps) {
		this.emps = emps;
	}
	public Emp[] getEmps() {
		return emps;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Emp getMgr() {
		return mgr;
	}
	public void setMgr(Emp mgr) {
		this.mgr = mgr;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", mgr=" + mgr + ", emps=" + Arrays.toString(emps) + "]";
	}
	
	
}
