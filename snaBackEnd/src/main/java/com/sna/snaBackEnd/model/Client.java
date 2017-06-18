package com.sna.snaBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer clientId;
	@NotEmpty
	@NotBlank
	@Pattern(regexp="[a-zA-Z]{6,}", message="Username must contain only alphabet with atleast 6 characters")
	private String firstName;
	@NotBlank
	@NotEmpty
	@Pattern(regexp="[a-zA-Z]{6,}", message="Username must contain only alphabet with atleast 6 characters")
	private String lastName;
	@NotBlank
	@NotEmpty
	@Pattern(regexp="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
	private String email;
	@Pattern(regexp="[0-9]{10}")
	private String mobile;
	@NotEmpty
	@NotBlank
	@Pattern(regexp="[a-zA-Z]{6,}", message="Username must contain only alphabet with atleast 6 characters")
	private String userName;
	@NotBlank
	@NotEmpty
	@Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,}")
	private String password;
	@NotBlank
	@NotEmpty
	@Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,}")
	@Transient
	private String cpassword;
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	
	@Override
	public String toString() {
		return "Clients [clientId=" + clientId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", mobile=" + mobile + ", userName=" + userName + ", password=" + password + ", cpassword="
				+ cpassword + "]";
	}

}
