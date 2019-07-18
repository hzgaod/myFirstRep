package 动态代理;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.text.MessageFormat;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





public class asd extends HttpServlet{
	
	private ServletConfig servletConfig;
	
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		this.servletConfig.getInitParameter("");
		response.getWriter().print("231");
		PrintWriter out=response.getWriter();
		//this.getServletContext().getResourceAsStream(path);
	//	asd.class.getClassLoader().getResourceAsStream(name);
		Properties prop=new Properties();
	//	prop.load(inStream);
	//	response.getWriter().print(MessageFormat.format(pattern, arguments));
		
	}
	
	public static void main(String[] args) {
		//
		Subject realSubject = new RealSubject(); //多态
		InputStream in =new InputStream() {
			
			@Override
			public int read() throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		InvocationHandler handler=new DynamicProxy(realSubject);
		Subject subject= (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(),handler);
		subject.hello("world");
		subject.rent();
		System.out.println(subject.getClass().getName());
	}

}
