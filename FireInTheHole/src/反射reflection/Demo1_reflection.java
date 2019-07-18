package 反射reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Demo1_reflection {

	public static void main(String[] args) throws Exception {
		//Class<?> user=User.class;      //类加载了 但是木有初始化
		Class<?> user2=Class.forName("反射reflection.User");
		User user3= (User) user2.newInstance();
		System.out.println(user3.getAge());
		//getFields() 
        // 返回一个包含某些 Field 对象的数组，这些对象反映此 Class 对象所表示的类或接口的所有可访问公共字段。
		Field[] field= user2.getFields();
		for (Field field2 : field) {
			System.out.println(field2);
		}
		System.out.println(user2.getClassLoader());
		System.out.println("--------------------------");
		//getDeclaredFields() 
        //返回 Field 对象的一个数组，这些对象反映此 Class 对象所表示的类或接口所声明的所有字段。
		Field[] field1=user2.getDeclaredFields();
		for (Field field2 : field1) {
			//以整数形式返回由此 Field 对象表示的字段的 Java 语言修饰符。
			System.out.println(field2.getModifiers());
			System.out.println(Modifier.toString(field2.getModifiers()) + " ");
			System.out.println(field2);
			//输出变量的类型及变量名
	        System.out.println(field2.getType().getName() + " " + field2.getName());
	        System.out.println(field2.getType());
		}
	}
}
