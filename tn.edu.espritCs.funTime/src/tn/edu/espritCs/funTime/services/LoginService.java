package tn.edu.espritCs.funTime.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import tn.edu.espritCs.funTime.technical.UtilJdbc;

public class LoginService {
	UtilJdbc utilJdbc = new UtilJdbc();
	Connection connection = utilJdbc.hetliConnetionMrigla();

	public boolean login(String login, String password) {
		boolean b = false;
		try {
			Statement statement = connection.createStatement();
			String sql = "select * from user where login='" + login
					+ "' and password ='" + password + "' ";
			System.out.println(sql);
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				System.out.println("l9inah ...");
				b = true;
			}
		} catch (Exception e) {

		}
		return b;
	}

}
