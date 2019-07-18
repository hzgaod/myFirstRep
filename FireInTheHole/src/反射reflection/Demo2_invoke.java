package 反射reflection;

import java.lang.reflect.Method;

public class Demo2_invoke {

	public static void main(String[] args) throws Exception {
		Class<?> classA=User.class;
		Method method= classA.getDeclaredMethod("show",null);
		if(method!=null) {
			method.setAccessible(true);
			User user=(User) classA.newInstance();
			method.invoke(user,null);
		}

	}

}
