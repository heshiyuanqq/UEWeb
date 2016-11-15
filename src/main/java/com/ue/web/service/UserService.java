package com.ue.web.service;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ue.web.pojo.User;



public interface UserService {

	User getUserByUsernamePassword(String username, String password) throws NoSuchAlgorithmException ;

	User getByUsername(String username);

	List<String> getRolenameListByUsername(String username);




}
