package com.swan.user.service;

import com.swan.user.bean.User;
import com.swan.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<User> findAll() {
		return userMapper.findAll();
	}

	/**
	 * 根据ID查询实体
	 * @param id
	 * @return
	 */
	public User findById(String id) {
		return userMapper.findById(id).get();
	}

}
