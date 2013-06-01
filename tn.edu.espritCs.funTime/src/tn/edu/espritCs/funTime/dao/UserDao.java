package tn.edu.espritCs.funTime.dao;

import tn.edu.espritCs.funTime.domain.User;

public class UserDao {

	public boolean addUser(User user) {
		boolean b = false;
		try {

			b = true;

		} catch (Exception e) {
			
			System.out.println("7awel marra o5ra");
		}
		return b;
	}

}
