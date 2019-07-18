package JaxbUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBException;

public class JaxbTest {

	public static void main(String[] args) throws JAXBException {
		User user =new User("tom", 18);
		Menu m1=new Menu("tomcat", new Date());
		Menu m2=new Menu("welogic", new Date());
		List<Menu> list=new ArrayList<Menu>();
		list.add(m1);
		list.add(m2);
		user.setList(list);
		ParserUtil.convertToXml(user, new File("E:\\user.xml"));
	}
}
