package com.mycompany.service.impl;

import com.mycompany.bean.User;
import com.mycompany.service.IUser;
/**
 * 
 * @author yu_feng
 *
 */
public class UserImpl implements IUser {

	@Override
	public User queryUserByName() {
		User usr = new User();
		usr.setName("yu_feng");
		return usr;
	}

}
