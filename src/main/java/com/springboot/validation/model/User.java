package com.springboot.validation.model;

import javax.validation.constraints.NotBlank;


/**
 * @author Mohammed Amr
 * @created 02/01/2021 - 15:35
 * @project spring-boot-validation
 */
public class User {

    @NotBlank(message = "username cannot be empty!")
    private String name;

    @NotBlank(message = "password cannot be empty!")
    private String password;

    private Double grade;

    public User(@NotBlank(message = "username cannot be empty!") String name, @NotBlank(message = "password cannot be empty!") String password, Double grade) {
        this.name = name;
        this.password = password;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
