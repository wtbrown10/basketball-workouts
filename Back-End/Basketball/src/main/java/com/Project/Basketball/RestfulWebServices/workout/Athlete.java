package com.Project.Basketball.RestfulWebServices.workout;


import java.util.UUID;

public class Athlete {

    private UUID userId;
    private String athleteName;
    private String position;
    private int age;

    public Athlete(int userId, String athleteName, String position, int age) {
        this.userId = UUID.randomUUID();
        this.athleteName = athleteName;
        this.position = position;
        this.age = age;
    }

    public Athlete(UUID uuid, String athleteName, String position, int age) {
        this.userId = UUID.randomUUID();
        this.athleteName = athleteName;
        this.position = position;
        this.age = age;
    }

    public Athlete() {

    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "id=" + userId +
                ", athleteName='" + athleteName + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                '}';
    }
}
