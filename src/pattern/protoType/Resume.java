package pattern.protoType;

import java.io.Serializable;

/**
 * 原型模式，实现JDK提供的Cloneable接口，并实现clone()方法
 * @author lenovo
 *
 */
public class Resume implements Cloneable ,Serializable{

	private String name;
	private String sex;
	
	public Resume(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getSex() {
		return sex;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		Resume resume =null;
		try{
			resume = (Resume) super.clone();
		}catch(Exception e){
			e.printStackTrace();
		}
		return resume;
	}
	
	
}
