package tn.edu.espritCs.funTime.tests;

import junit.framework.Assert;

import org.junit.Test;

import tn.edu.espritCs.funTime.dao.UserDao;
import tn.edu.espritCs.funTime.domain.User;

public class TestRealPlatforme {

	@Test
	public void testAddUser() {

	User user = new User("salah", "ben salah", "198", "salah@bensalah.com");
	UserDao userDao = new UserDao();
	Assert.assertTrue(userDao.addUser(user));
	
	
	
	
	}

}
