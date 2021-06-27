package com.test.finalapplication;

public class Clubitem {
    private int id ;
    private String name,creator,number,studentid,main;

    public Clubitem(){

    }
    public Clubitem(String name,String creator,String number ,String studentid,String main){
          this.main=main;
          this.name=name;
          this.creator=creator;
          this.number=number;
          this.studentid=studentid;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }



    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }
}
