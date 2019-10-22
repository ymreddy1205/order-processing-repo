package com.etisalat.dao;



import java.util.List;

import com.etisalat.domain.User;

public interface UserDAO {
	public abstract Integer addNewUser(User user) throws Exception;
	public abstract User getUserDetails(Integer userId) throws Exception;
	public abstract User getUserDetails(String userName, String password) throws Exception;
	public abstract List<User> getAllUsers() throws Exception;
}
