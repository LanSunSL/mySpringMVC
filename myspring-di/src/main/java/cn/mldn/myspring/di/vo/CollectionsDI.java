package cn.mldn.myspring.di.vo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@SuppressWarnings("serial")
public class CollectionsDI implements Serializable {
	private String[] stringArray;
	private List<String> stringList;
	private Set<String> stringSet;
	private Map<Integer, String> stringMap;
	private Properties pro; 
	private Dept[] deptArray;
	private List<Dept> deptList;
	private Set<Dept> deptSet;
	private Map<Integer, Dept> deptMap;
	public String[] getStringArray() {
		return stringArray;
	}
	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
	}
	public List<String> getStringList() {
		return stringList;
	}
	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}
	public Set<String> getStringSet() {
		return stringSet;
	}
	public void setStringSet(Set<String> stringSet) {
		this.stringSet = stringSet;
	}
	public Map<Integer, String> getStringMap() {
		return stringMap;
	}
	public void setStringMap(Map<Integer, String> stringMap) {
		this.stringMap = stringMap;
	}
	public Properties getPro() {
		return pro;
	}
	public void setPro(Properties pro) {
		this.pro = pro;
	}
	public Dept[] getDeptArray() {
		return deptArray;
	}
	public void setDeptArray(Dept[] deptArray) {
		this.deptArray = deptArray;
	}
	public List<Dept> getDeptList() {
		return deptList;
	}
	public void setDeptList(List<Dept> deptList) {
		this.deptList = deptList;
	}
	public Set<Dept> getDeptSet() {
		return deptSet;
	}
	public void setDeptSet(Set<Dept> deptSet) {
		this.deptSet = deptSet;
	}
	public Map<Integer, Dept> getDeptMap() {
		return deptMap;
	}
	public void setDeptMap(Map<Integer, Dept> deptMap) {
		this.deptMap = deptMap;
	}
	@Override
	public String toString() {
		return "CollectionsDI [stringArray=" + Arrays.toString(stringArray) + ",\r\n\t stringList=" + stringList
				+ ",\r\n\t stringSet=" + stringSet + ",\r\n\t stringMap=" + stringMap + ",\r\n\t pro=" + pro + ",\r\n\t deptArray="
				+ Arrays.toString(deptArray) + ",\r\n\t deptList=" + deptList + ",\r\n\t deptSet=" + deptSet + ",\r\n\t deptMap="
				+ deptMap + "]";
	}
	
}
