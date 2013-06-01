package tn.edu.espritCs.funTime.domain;

public class User {

	private int idUser;
	private String firstNameUser;
	private String lastNameUser;
	private String telUser;
	private String emailUser;

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getFirstNameUser() {
		return firstNameUser;
	}

	public void setFirstNameUser(String firstNameUser) {
		this.firstNameUser = firstNameUser;
	}

	public String getLastNameUser() {
		return lastNameUser;
	}

	public void setLastNameUser(String lastNameUser) {
		this.lastNameUser = lastNameUser;
	}

	public String getTelUser() {
		return telUser;
	}

	public void setTelUser(String telUser) {
		this.telUser = telUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String firstNameUser, String lastNameUser, String telUser,
			String emailUser) {
		super();
		this.firstNameUser = firstNameUser;
		this.lastNameUser = lastNameUser;
		this.telUser = telUser;
		this.emailUser = emailUser;
	}

}
