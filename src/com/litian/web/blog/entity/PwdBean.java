package com.litian.web.blog.entity;

/**
 * Created by litian on 2016/6/13.
 */
public class PwdBean {

    private Long id;

    private String name;

    private String website;

    private Long wid;

    private String username;

    private String mail;

    private Long phone;

    private String enPwd;

    private String enPayPwd;

    private String pwd;

    private String payPwd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Long getWid() {
        return wid;
    }

    public void setWid(Long wid) {
        this.wid = wid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEnPwd() {
        return enPwd;
    }

    public void setEnPwd(String enPwd) {
        this.enPwd = enPwd;
    }

    public String getEnPayPwd() {
        return enPayPwd;
    }

    public void setEnPayPwd(String enPayPwd) {
        this.enPayPwd = enPayPwd;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPayPwd() {
        return payPwd;
    }

    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PwdBean{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", wid=").append(wid);
        sb.append(", username='").append(username).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append(", phone=").append(phone);
        sb.append(", enPwd='").append(enPwd).append('\'');
        sb.append(", enPayPwd='").append(enPayPwd).append('\'');
        sb.append(", pwd='").append(pwd).append('\'');
        sb.append(", payPwd='").append(payPwd).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
