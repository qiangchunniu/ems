package com.baizhi.entity;

public class User {
    private Integer id;
    private String name;
    private String password;
    private Double salary;
    private String age;
    private String sex;
    private String statr;

    public User() {
        super();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", salary=" + salary +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", statr='" + statr + '\'' +
                '}';
    }

    public User(Integer id, String name, String password, Double salary, String age, String sex, String statr) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.salary = salary;
        this.age = age;
        this.sex = sex;
        this.statr = statr;
    }

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Double getSalary() {
        return salary;
    }

    public User setSalary(Double salary) {
        this.salary = salary;
        return this;
    }

    public String getAge() {
        return age;
    }

    public User setAge(String age) {
        this.age = age;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public User setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public String getStatr() {
        return statr;
    }

    public User setStatr(String statr) {
        this.statr = statr;
        return this;
    }
}
