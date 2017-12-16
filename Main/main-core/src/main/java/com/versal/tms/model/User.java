package com.versal.tms.model;
/**
 * user class is use to traverse data layer by layer
 * @author firoz
 *
 */
public class User {
	
	/**
	 * it is id of user and it is PK and AI
	 * 
	 *
	 */
	private Integer id;
	

	/**
	 * it is name of user
	 * 
	 *
	 */
	private String name;

	/**
	 * it is cotacts of user
	 * 
	 *
	 */
	private String contact;

	/**
	 * it is email of user 
	 * 
	 *
	 */
	private String email;

	/**
	 * it is address of user.
	 * 
	 *
	 */
	private String address;

	/**
	 * it is  loginname of user.
	 
	 *
	 */
	private String loginname;

	/**
	 * it is password of user.
	 * 
	 *
	 */
	private String password;

	/**
	 * it is role of user.
	 * 1.trainer 2.trainee 3.admin
	 * 
	 *
	 */
	private  Integer role;
	

	/**
	 * it is staus of user
	 * 1.active 2.inactive
	 * 
	 *
	 */
	private  Integer status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String paasword) {
		this.password = paasword;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	
	

}
