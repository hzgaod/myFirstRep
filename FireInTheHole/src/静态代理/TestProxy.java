package 静态代理;

public class TestProxy {

	public static void main(String[] args) {
		UserManage userManage=new ProxyUserManage(new UserManageImpl());
		userManage.addUser("qwe", 3);

	}

}
