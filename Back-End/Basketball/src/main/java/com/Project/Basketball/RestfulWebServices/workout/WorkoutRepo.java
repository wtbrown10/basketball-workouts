package com.Project.Basketball.RestfulWebServices.workout;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutRepo extends JpaRepository<Workout, Long> {


}
