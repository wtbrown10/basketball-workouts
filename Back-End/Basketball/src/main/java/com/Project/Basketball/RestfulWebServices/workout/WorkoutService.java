package com.Project.Basketball.RestfulWebServices.workout;

import com.Project.Basketball.RestfulWebServices.workout.Workout;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class WorkoutService {

    private static List<Workout> workouts = new ArrayList<>();

    private static int athleteCount = 0;

    static {
        workouts.add(new Workout(++athleteCount, "Jordan",
                "Point Guard", 15, "Between the leg Dribbles",
                LocalDate.now().plusDays(3), LocalTime.of(0,15), false));
        workouts.add(new Workout(++athleteCount, "Kobe",
                "Shooting Guard", 13, "Three point shooting drills",
                LocalDate.now().plusDays(2), LocalTime.of(1,25), false));
        workouts.add(new Workout(++athleteCount, "Shaq",
                "Center", 11, "Layup Drills",
                LocalDate.now().plusDays(5), LocalTime.of(10,0), false));
        workouts.add(new Workout(++athleteCount, "Kobe",
                "Shooting Guard", 13, "Free Throw drills",
                LocalDate.now().plusDays(3), LocalTime.of(0,25), false));

    }

//    public List<Workout> findAllAthletes(String athleteName) {
//        workouts.getClass();
//        return ;
//
//    }

    public List<Workout> findByAthleteName(String athleteName) {
        Predicate<? super Workout> predicate =
                workout -> workout.getAthleteName().equalsIgnoreCase(athleteName);
        return workouts.stream().filter(predicate).toList();

    }

    public Workout createAthleteWorkout(String athleteName, String position, int age, String workoutActivity,
                                        LocalDate targetDate, LocalTime workoutTime, boolean done){

        Workout workout = new Workout( athleteName, position, age,
                                    workoutActivity, targetDate, workoutTime, done);

        workouts.add(workout);
        return workout;
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }
}
