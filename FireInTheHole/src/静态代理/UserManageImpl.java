package 静态代理;

public class UserManageImpl implements UserManage {

	@Override
	public void addUser(String name, Integer age) {
		System.out.println("-------添加用户------");

	}

	@Override
	public void delUser(String name, Integer age) {
		System.out.println("-----删除------");

	}

}
