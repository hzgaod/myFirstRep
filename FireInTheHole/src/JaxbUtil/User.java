package JaxbUtil;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="user")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1040846028596998323L;
	
	@XmlAttribute(name="属性")
	private String name1;

	private Integer age;
	
	@XmlElementWrapper(name="haha")
	@XmlElement(name="ListName")
	private List<Menu> list;

	
	
	public User(List<Menu> list) {
		super();
		this.list = list;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name1, Integer age) {
		super();
		this.name1 = name1;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name1=" + name1 + ", age=" + age + "]";
	}
    
	
	

	public void setName1(String name1) {
		this.name1 = name1;
	}

	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}



	public void setList(List<Menu> list) {
		this.list = list;
	}
	
	

}
