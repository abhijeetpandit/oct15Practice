package beans;

public class DummyDataSource {
	private String dbUrl;
	private String userName;
	private String password;
	public String getDbUrl() {
		return dbUrl;
	}
	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "DummyDataSource [dbUrl=" + dbUrl + ", userName=" + userName + ", password=" + password + "]";
	}
	
}
