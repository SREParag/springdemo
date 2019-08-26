package com.sabre.dcn.domain;

import javax.persistence.*;

@Entity
public class OrgChart {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "org_chart_seq")
	@SequenceGenerator(name="org_chart_seq", sequenceName = "org_chart_seq")
	private Integer id;

	private String name;
	private String gid;
	private String mgid;
	private String role;
	private String disabled;
	private String rootPath;
	private String displayName;
	private String office;
	private String email;
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
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getMgid() {
		return mgid;
	}
	public void setMgid(String mgid) {
		this.mgid = mgid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDisabled() {
		return disabled;
	}
	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}
	public String getRootPath() {
		return rootPath;
	}
	public void setRootPath(String rootPath) {
		this.rootPath = rootPath;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
