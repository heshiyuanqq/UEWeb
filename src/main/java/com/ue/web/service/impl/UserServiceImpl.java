package com.ue.web.service.impl;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.jdbc.util.Base64Decoder;
import com.thoughtworks.xstream.core.util.Base64Encoder;
import com.ue.web.dao.UserMapper;
import com.ue.web.pojo.User;
import com.ue.web.service.UserService;
import com.ue.web.utils.Md5Util;
@Service(value="userServiceImpl")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	public User getUserByUsernamePassword(String username, String password) throws NoSuchAlgorithmException {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("username", username);
			params.put("password", Md5Util.toMD5(password));
			return userMapper.getUserByUsernamePassword(params);
	}

	@Override
	public User getByUsername(String username) {
		return userMapper.getByUsername(username);
	}

	@Override
	public List<String> getRolenameListByUsername(String username) {
		return userMapper.getRolenameListByUsername(username);
	}
		
}
