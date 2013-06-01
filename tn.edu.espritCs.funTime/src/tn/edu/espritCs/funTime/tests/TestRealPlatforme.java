package tn.edu.espritCs.funTime.tests;

import junit.framework.Assert;

import org.junit.Test;

import tn.edu.espritCs.funTime.dao.UserDao;
import tn.edu.espritCs.funTime.domain.User;
import tn.edu.espritCs.funTime.technical.UtilJdbc;

public class TestRealPlatforme {
	private UserDao userDao = new UserDao();

	@Test
	public void testAddUser() {
		User user = new User("Ali", "ben salah", "198", "salah@bensalah.com");
		Assert.assertTrue(userDao.addUser(user));
	}

	@Test
	public void testHetliConnetionMrigle() {
		UtilJdbc utilJdbc = new UtilJdbc();
		utilJdbc.hetliConnetionMrigla();
	}

	@Test
	public void testFindUserById() {
		User user = userDao.findUserById(1);
		Assert.assertEquals("Ali", user.getFirstNameUser());
	}

	@Test
	public void testDeleteUserById() {
		User user = userDao.findUserById(1);
		System.out.println(user.getFirstNameUser());
		Assert.assertTrue(userDao.deleteUserById(1));
	}
	@Test
	public void testUpdateUser() {
		User user = userDao.findUserById(2);
		System.out.println("old one :"+user.getFirstNameUser());
		user.setFirstNameUser("new look");
		System.out.println("new one :"+user.getFirstNameUser());
		Assert.assertTrue(userDao.updateUser(user));
	}
}
