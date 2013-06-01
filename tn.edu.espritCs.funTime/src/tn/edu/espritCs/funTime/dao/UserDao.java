package tn.edu.espritCs.funTime.dao;

import java.sql.ResultSet;
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

	public User findUserById(int idUser) {
		User userTMP = new User();
		try {
			Statement statement = utilJdbc.hetliConnetionMrigla()
					.createStatement();
			String sql = "select * from user where idUser=" + idUser;
			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				userTMP.setIdUser(resultSet.getInt("idUser"));
				userTMP.setFirstNameUser(resultSet.getString("firstNameUser"));
				System.out.println("l9inah hakel user ...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userTMP;
	}

	public boolean deleteUserById(int idUser) {
		boolean b = false;
		try {
			Statement statement = utilJdbc.hetliConnetionMrigla()
					.createStatement();
			String sql = "delete from user where idUser=" + idUser;
			statement.executeUpdate(sql);
			System.out.println("youppy user deleted ...");
			b = true;
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return b;
	}

	public boolean updateUser(User user) {
		boolean b = false;
		try {
			Statement statement = utilJdbc.hetliConnetionMrigla()
					.createStatement();
			String sql = "update user set firstNameUser='"
					+ user.getFirstNameUser() + "' where idUser="
					+ user.getIdUser();
			statement.executeUpdate(sql);
			System.out.println("youppy user modified ...");
			b = true;
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return b;
	}
}
