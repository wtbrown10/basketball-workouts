package com.Project.Basketball.RestfulWebServices.workout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/")
public class BasketballController {

    @Autowired
    private WorkoutService workoutService;

    @GetMapping(path = "/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping(path = "/athletes")
    public List<Workout> retrieveAllAthletes(){
        return workoutService.getWorkouts();
    }

    @GetMapping(path = "/athlete/{athleteName}")
    public List<Workout> retrieveAthlete(@PathVariable String athleteName){

        return workoutService.findByAthleteName(athleteName);
    }

    @PostMapping(path= "/athlete/{athleteName}")
    public Workout PostAthlete(@PathVariable String athleteName, @RequestBody Workout workout){
        Workout createdAthleteWorkout =
                workoutService.createAthleteWorkout(athleteName,
                workout.getPosition(), workout.getAge(), workout.getWorkoutActivity(),
                workout.getTargetDate(), workout.getWorkoutTime(), workout.isDone());

        return  createdAthleteWorkout;
    }
}
