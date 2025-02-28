package com.springmvc.pmvc.beans;

public class Faculty {
    private int id;
    private String name;
    private String email;
    private String pass;
    private String mob;

    public Faculty() {}

    public Faculty(int id, String name, String email, String pass, String mob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.mob = mob;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPass() { return pass; }
    public void setPass(String pass) { this.pass = pass; }

    public String getMob() { return mob; }
    public void setMob(String mob) { this.mob = mob; }
}
