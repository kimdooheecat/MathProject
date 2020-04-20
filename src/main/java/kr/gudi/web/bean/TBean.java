package kr.gudi.web.bean;

public class TBean {

	int    t_no;
	String t_name;
	String t_id;
	String t_pwd;
	String t_delYN;
	String t_date;
	
	public int getT_no() {
		return t_no;
	}
	public String getT_name() {
		return t_name;
	}
	public String getT_id() {
		return t_id;
	}
	public String getT_pwd() {
		return t_pwd;
	}
	public String getT_delYN() {
		return t_delYN;
	}
	public String getT_date() {
		return t_date;
	}
	@Override
	public String toString() {
		return "TBean [t_no=" + t_no + ", t_name=" + t_name + ", t_id=" + t_id + ", t_pwd=" + t_pwd + ", t_delYN="
				+ t_delYN + ", t_date=" + t_date + "]";
	}
	
	
	
}
