package com.Project.Basketball.RestfulWebServices.workout;

import com.Project.Basketball.RestfulWebServices.athlete.Athlete;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
//
//@Entity
//public class Workout extends Athlete {
//    @SequenceGenerator(
//            name = "workout_sequence",
//            sequenceName = "workout_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    private Long id;
//    @Column(name = "activity")
//    private String workoutActivity;
//    @Column(name = "targetDate")
//    private LocalDate targetDate;
//    @Column(name = "workoutTime")
//    private LocalTime workoutTime;
//    @Column(name = "done")
//    boolean done;
//
//
//    public Workout() {
//        super();
//    }
//
//    public Workout(String athleteName, String email, String password, String position,
//                   LocalDate dob, Integer age, Long id, String workoutActivity,
//                   LocalDate targetDate, LocalTime workoutTime, boolean done) {
//        super(athleteName, email, password, position, dob, age);
//        this.id = id;
//        this.workoutActivity = workoutActivity;
//        this.targetDate = targetDate;
//        this.workoutTime = workoutTime;
//        this.done = done;
//    }
//
//    public Workout(String athleteName, String email, String password, String position,
//                   LocalDate dob, Integer age, String workoutActivity, LocalDate targetDate,
//                   LocalTime workoutTime, boolean done) {
//        super(athleteName, email, password, position, dob, age);
//        this.workoutActivity = workoutActivity;
//        this.targetDate = targetDate;
//        this.workoutTime = workoutTime;
//        this.done = done;
//    }
//
//    public String getWorkoutActivity() {
//        return workoutActivity;
//    }
//
//    public void setWorkoutActivity(String workoutActivity) {
//        this.workoutActivity = workoutActivity;
//    }
//
//    public LocalDate getTargetDate() {
//        return targetDate;
//    }
//
//    public void setTargetDate(LocalDate targetDate) {
//        this.targetDate = targetDate;
//    }
//
//    public LocalTime getWorkoutTime() {
//        return workoutTime;
//    }
//
//    public void setWorkoutTime(LocalTime workoutTime) {
//        this.workoutTime = workoutTime;
//    }
//
//    public boolean isDone() {
//        return done;
//    }
//
//    public void setDone(boolean done) {
//        this.done = done;
//    }
//
//    @Override
//    public String toString() {
//        return "Workout{" +
//                "workoutActivity='" + workoutActivity + '\'' +
//                ", targetDate=" + targetDate +
//                ", workoutTime=" + workoutTime +
//                ", done=" + done +
//                '}';
//    }
//}
