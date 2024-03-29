package com.login.RegisterLogin.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @Column(name ="employee_id",length = 25)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="employee_name")
    private String employeename;

    @Column(name="email")
    private String email;

    @Column(name ="password")
    private String password;

    public Employee(){

    }

    public Employee(int id, String employeename, String email, String password) {
        this.id = id;
        this.employeename = employeename;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeename='" + employeename + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
