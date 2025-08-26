package com.tnsif.certificateservice;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;
    private String certificateName;
    private String issuingOrganization;
    private Date issueDate;
    private Date expirationDate;
    private Date renewalDate;
    private String status;
    private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	public String getIssuingOrganization() {
		return issuingOrganization;
	}
	public void setIssuingOrganization(String issuingOrganization) {
		this.issuingOrganization = issuingOrganization;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public Date getRenewalDate() {
		return renewalDate;
	}
	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Certificate(Long id, Long studentId, String certificateName, String issuingOrganization, Date issueDate,
			Date expirationDate, Date renewalDate, String status, String description) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.certificateName = certificateName;
		this.issuingOrganization = issuingOrganization;
		this.issueDate = issueDate;
		this.expirationDate = expirationDate;
		this.renewalDate = renewalDate;
		this.status = status;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Certificate [id=" + id + ", studentId=" + studentId + ", certificateName=" + certificateName
				+ ", issuingOrganization=" + issuingOrganization + ", status=" + status + ", description=" + description
				+ "]";
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

    // Getters and Setters
    // Constructors
    // toString() method
}
