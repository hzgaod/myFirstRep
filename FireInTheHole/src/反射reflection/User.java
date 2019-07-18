package 反射reflection;

public class User {

	private String name;
	public Integer age;
	private Double money;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	private void show() {
		System.out.println("调用私有方法");
	}
	
	public void showAge(int a) {
		System.out.println("调用工有方法"+"_______"+a);
	}
	
}
