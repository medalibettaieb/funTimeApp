package tn.edu.espritCs.funTime.tests;

import junit.framework.Assert;

import org.junit.Test;

import tn.edu.espritCs.funTime.dao.UserDao;
import tn.edu.espritCs.funTime.domain.User;
import tn.edu.espritCs.funTime.technical.UtilJdbc;

public class TestRealPlatforme {

	@Test
	public void testAddUser() {

	User user = new User("Ali", "ben salah", "198", "salah@bensalah.com");
	UserDao userDao = new UserDao();
	Assert.assertTrue(userDao.addUser(user));
	}
	
	@Test
	public void testHetliConnetionMrigle(){
		UtilJdbc utilJdbc=new UtilJdbc();
		utilJdbc.hetliConnetionMrigla();
	}

}
