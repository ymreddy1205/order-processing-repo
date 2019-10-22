package com.etisalat.dao;

public interface QueryMapper {
	public static final String ADD_USER="insert into users_sapient(user_name,pwd,create_date,email) values(?,?,?,?)";
	public static final String GET_USER="select * from users_sapient where user_name=? and pwd=?";
	public static final String GET_ALL_USERS= "select * from users_sapient";
}
