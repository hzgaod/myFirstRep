package 静态代理;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProxyUserManage implements UserManage{
	private static final Logger logger=LoggerFactory.getLogger(ProxyUserManage.class);
	private UserManageImpl userManageImpl;
	

	public ProxyUserManage(UserManageImpl userManageImpl) {
		super();
		this.userManageImpl = userManageImpl;
	}

	@Override
	public void addUser(String name, Integer age) {
		logger.info("开始添加用户");
		userManageImpl.addUser(name, age);
		logger.info("结束添加用户");
		
	}

	@Override
	public void delUser(String name, Integer age) {
		logger.info("开始删除用户");
		userManageImpl.delUser(name, age);
		logger.info("结束删除用户");
		
	}

}
