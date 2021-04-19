package kosta.dto;

public class Member {
	private int mbCode;
	private String mbName;
	private String id;
	private String pwd;
	private String email;
	private String addr;
	private String jumin;
	private String tel;
	private String signUpDate;
	
	public Member(int mbCode, String mbName, String id, String pwd, String email, String addr, String jumin,
			String tel, String signUpDate) {
		super();
		this.mbCode = 1;
		this.mbName = "동헌김";
		this.id = "asd123";
		this.pwd = "123456";
		this.email = "asd123@naver.com";
		this.addr = "seongnamsi";
		this.jumin = "123456-1234567";
		this.tel = "010-1234-5678";
		this.signUpDate = "2020-01-01";
	}
	public int getMbCode() {
		return mbCode;
	}
	public void setMbCode(int mbCode) {
		this.mbCode = mbCode;
	}
	public String getMbName() {
		return mbName;
	}
	public void setMbName(String mbName) {
		this.mbName = mbName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSignUpDate() {
		return signUpDate;
	}
	public void setSignUpDate(String signUpDate) {
		this.signUpDate = signUpDate;
	}
	
	
}
