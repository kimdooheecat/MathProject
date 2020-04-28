package kr.gudi.web.bean;

public class StudentanswerBean {
	
	int a_s_no; 
	int p_no;
	int s_no;
	String a_s_answer;
	String a_s_date;
	
	public int getA_s_no() {
		return a_s_no;
	}
	public void setA_s_no(int a_s_no) {
		this.a_s_no = a_s_no;
	}
	public int getP_no() {
		return p_no;
	}
	public void setP_no(int p_no) {
		this.p_no = p_no;
	}
	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	public String getA_s_answer() {
		return a_s_answer;
	}
	public void setA_s_answer(String a_s_answer) {
		this.a_s_answer = a_s_answer;
	}
	public String getA_s_date() {
		return a_s_date;
	}
	public void setA_s_date(String a_s_date) {
		this.a_s_date = a_s_date;
	}
	@Override
	public String toString() {
		return "StudentanswerBean [a_s_no=" + a_s_no + ", p_no=" + p_no + ", s_no=" + s_no + ", a_s_answer="
				+ a_s_answer + ", a_s_date=" + a_s_date + "]";
	}
	
}
