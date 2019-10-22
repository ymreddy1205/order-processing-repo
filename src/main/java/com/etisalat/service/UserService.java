package com.etisalat.service;

import java.util.List;

import com.etisalat.domain.User;
import com.etisalat.exception.UserException;

public interface UserService {
	public abstract Integer addNewUser(User user) throws UserException;
	public abstract User getUserDetails(Integer userId) throws UserException;
	public abstract User getUserDetails(String userName, String password) throws UserException;
	public abstract List<User> getAllUsers() throws UserException;
}
