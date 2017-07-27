package cn.com.lanou.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.lanou.dao.UserMapper;
import cn.com.lanou.domain.User;
import cn.com.lanou.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper UserMapper;
	
	@Override
	public void insertUser(User user) {
		UserMapper.insertUser(user);
	}

}
