package com.example.demo.model;

import java.util.Date;

public class UserBaseInf {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_baseinf.user_email
     *
     * @mbggenerated
     */
    private String userEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_baseinf.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_baseinf.user_telephone
     *
     * @mbggenerated
     */
    private String userTelephone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_baseinf.user_address
     *
     * @mbggenerated
     */
    private String userAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_baseinf.user_good
     *
     * @mbggenerated
     */
    private Double userGood;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_baseinf.user_trust
     *
     * @mbggenerated
     */
    private Double userTrust;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_baseinf.role
     *
     * @mbggenerated
     */
    private String role;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_baseinf.lastPasswordResetDate
     *
     * @mbggenerated
     */
    private Date lastpasswordresetdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_baseinf.user_password
     *
     * @mbggenerated
     */
    private String userPassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_baseinf
     *
     * @mbggenerated
     */
    public UserBaseInf(String userEmail, String userName, String userTelephone, String userAddress, Double userGood, Double userTrust, String role, Date lastpasswordresetdate, String userPassword) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.userTelephone = userTelephone;
        this.userAddress = userAddress;
        this.userGood = userGood;
        this.userTrust = userTrust;
        this.role = role;
        this.lastpasswordresetdate = lastpasswordresetdate;
        this.userPassword = userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_baseinf
     *
     * @mbggenerated
     */
    public UserBaseInf() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_baseinf.user_email
     *
     * @return the value of user_baseinf.user_email
     *
     * @mbggenerated
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_baseinf.user_email
     *
     * @param userEmail the value for user_baseinf.user_email
     *
     * @mbggenerated
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_baseinf.user_name
     *
     * @return the value of user_baseinf.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_baseinf.user_name
     *
     * @param userName the value for user_baseinf.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_baseinf.user_telephone
     *
     * @return the value of user_baseinf.user_telephone
     *
     * @mbggenerated
     */
    public String getUserTelephone() {
        return userTelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_baseinf.user_telephone
     *
     * @param userTelephone the value for user_baseinf.user_telephone
     *
     * @mbggenerated
     */
    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone == null ? null : userTelephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_baseinf.user_address
     *
     * @return the value of user_baseinf.user_address
     *
     * @mbggenerated
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_baseinf.user_address
     *
     * @param userAddress the value for user_baseinf.user_address
     *
     * @mbggenerated
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_baseinf.user_good
     *
     * @return the value of user_baseinf.user_good
     *
     * @mbggenerated
     */
    public Double getUserGood() {
        return userGood;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_baseinf.user_good
     *
     * @param userGood the value for user_baseinf.user_good
     *
     * @mbggenerated
     */
    public void setUserGood(Double userGood) {
        this.userGood = userGood;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_baseinf.user_trust
     *
     * @return the value of user_baseinf.user_trust
     *
     * @mbggenerated
     */
    public Double getUserTrust() {
        return userTrust;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_baseinf.user_trust
     *
     * @param userTrust the value for user_baseinf.user_trust
     *
     * @mbggenerated
     */
    public void setUserTrust(Double userTrust) {
        this.userTrust = userTrust;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_baseinf.role
     *
     * @return the value of user_baseinf.role
     *
     * @mbggenerated
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_baseinf.role
     *
     * @param role the value for user_baseinf.role
     *
     * @mbggenerated
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_baseinf.lastPasswordResetDate
     *
     * @return the value of user_baseinf.lastPasswordResetDate
     *
     * @mbggenerated
     */
    public Date getLastpasswordresetdate() {
        return lastpasswordresetdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_baseinf.lastPasswordResetDate
     *
     * @param lastpasswordresetdate the value for user_baseinf.lastPasswordResetDate
     *
     * @mbggenerated
     */
    public void setLastpasswordresetdate(Date lastpasswordresetdate) {
        this.lastpasswordresetdate = lastpasswordresetdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_baseinf.user_password
     *
     * @return the value of user_baseinf.user_password
     *
     * @mbggenerated
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_baseinf.user_password
     *
     * @param userPassword the value for user_baseinf.user_password
     *
     * @mbggenerated
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }
}