package com.Project.Basketball.RestfulWebServices.athlete;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Athlete {
    @Id
    @SequenceGenerator(
            name = "athlete_sequence",
            sequenceName = "athlete_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "athlete_sequence"
    )
    private Long userId;
    @Column(name = "name")
    private String athleteName;
    @Column(name = "email")
    private String email;
    @Column(name = "password", length = 6)
    private String password;
    @Column(name = "position")
    private String position;
    @Column(name = "dob")
    private LocalDate dob;
    @Transient
    private Integer age;

    public Athlete() {
    }

    public Athlete(Long userId, String athleteName, String email, String password,
                   String position, LocalDate dob) {
        this.userId = userId;
        this.athleteName = athleteName;
        this.email = email;
        this.password = password;
        this.position = position;
        this.dob = dob;

    }

    //no id constructor because database will create id for use
    public Athlete(String athleteName, String email, String password,
                   String position, LocalDate dob) {
        this.athleteName = athleteName;
        this.email = email;
        this.password = password;
        this.position = position;
        this.dob = dob;

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long id) {
        this.userId = id;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "userId=" + userId +
                ", athleteName='" + athleteName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", position='" + position + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
