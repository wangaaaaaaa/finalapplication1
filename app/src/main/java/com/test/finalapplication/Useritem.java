package com.test.finalapplication;

public class Useritem {
    private int id ;
    private String password,name,sex,major,studentid;


    public Useritem(){

    }
    public Useritem(String studentid,String password,String name,String sex,String major){
        this.major=major;
        this.password=password;
        this.name=name;
        this.sex=sex;
        this.studentid=studentid;
    }

    public String getStudentid() { return studentid;}

    public void setStudentid(String studentid) { this.studentid = studentid;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setName(String name) {
        this.name = name;
    }
}
