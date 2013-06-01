package tn.edu.espritCs.funTime.dao;

import java.sql.SQLException;
import java.sql.Statement;

import tn.edu.espritCs.funTime.domain.User;
import tn.edu.espritCs.funTime.technical.UtilJdbc;

public class UserDao {
	private UtilJdbc utilJdbc = new UtilJdbc();

	public boolean addUser(User user) {
		boolean b = false;
		try {
			Statement statement = utilJdbc.hetliConnetionMrigla()
					.createStatement();
			String sql = "insert into user (firstNameUser) values('"
					+ user.getFirstNameUser() + "')";
			statement.executeUpdate(sql);
			System.out.println("youppy user added ...");
			b = true;
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return b;
	}

}
