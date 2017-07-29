package cn.com.rbac.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.rbac.dao.UsersMapper;
import cn.com.rbac.domain.Users;
import cn.com.rbac.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	
	@Resource
	private UsersMapper usersMapper;
	
	
	@Override
	public void insertUser(Users user) {
		// TODO Auto-generated method stub
		usersMapper.insertUser(user);
	}

}
