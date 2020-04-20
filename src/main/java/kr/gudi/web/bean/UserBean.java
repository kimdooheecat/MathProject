package kr.gudi.web.bean;

public class UserBean {
	
	int s_no;
	String s_name;
	String s_id;
	String s_pwd;
	String s_gender;
	String s_grade;
	String s_tell;
	String s_delYN;
	String s_date;
	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	public String getS_pwd() {
		return s_pwd;
	}
	public void setS_pwd(String s_pwd) {
		this.s_pwd = s_pwd;
	}
	public String getS_gender() {
		return s_gender;
	}
	public void setS_gender(String s_gender) {
		this.s_gender = s_gender;
	}
	public String getS_grade() {
		return s_grade;
	}
	public void setS_grade(String s_grade) {
		this.s_grade = s_grade;
	}
	public String getS_tell() {
		return s_tell;
	}
	public void setS_tell(String s_tell) {
		this.s_tell = s_tell;
	}
	public String getS_delYN() {
		return s_delYN;
	}
	public void setS_delYN(String s_delYN) {
		this.s_delYN = s_delYN;
	}
	public String getS_date() {
		return s_date;
	}
	public void setS_date(String s_date) {
		this.s_date = s_date;
	}
	@Override
	public String toString() {
		return "UserBean [s_no=" + s_no + ", s_name=" + s_name + ", s_id=" + s_id + ", s_pwd=" + s_pwd + ", s_gender="
				+ s_gender + ", s_grade=" + s_grade + ", s_tell=" + s_tell + ", s_delYN=" + s_delYN + ", s_date="
				+ s_date + "]";
	}
	
	
	

	
}

