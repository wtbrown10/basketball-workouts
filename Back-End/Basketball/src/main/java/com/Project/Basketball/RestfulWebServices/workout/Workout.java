package com.Project.Basketball.RestfulWebServices.workout;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class Workout extends Athlete {


    private String workoutActivity;
    private LocalDate targetDate;
    private LocalTime workoutTime;
    boolean done;


    public Workout(int userId, String athleteName, String position, int age,
                   String workoutActivity, LocalDate targetDate,
                   LocalTime workoutTime, boolean done) {
        super(userId, athleteName, position, age);
        this.workoutActivity = workoutActivity;
        this.targetDate = targetDate;
        this.workoutTime = workoutTime;
        this.done = done;
    }

    public Workout() {
        super();
    }

    public Workout(String athleteName, String position, int age,
                   String workoutActivity, LocalDate targetDate,
                   LocalTime workoutTime, boolean done) {
        super(UUID.randomUUID(),athleteName, position, age);
        this.workoutActivity = workoutActivity;
        this.targetDate = targetDate;
        this.workoutTime = workoutTime;
        this.done = done;
    }

    public String getWorkoutActivity() {
        return workoutActivity;
    }

    public void setWorkoutActivity(String workoutActivity) {
        this.workoutActivity = workoutActivity;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public LocalTime getWorkoutTime() {
        return workoutTime;
    }

    public void setWorkoutTime(LocalTime workoutTime) {
        this.workoutTime = workoutTime;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "workoutActivity='" + workoutActivity + '\'' +
                ", targetDate=" + targetDate +
                ", workoutTime=" + workoutTime +
                ", done=" + done +
                '}';
    }
}
