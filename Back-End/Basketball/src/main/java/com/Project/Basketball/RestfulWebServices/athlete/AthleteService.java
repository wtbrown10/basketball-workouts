package com.Project.Basketball.RestfulWebServices.athlete;

//import com.Project.Basketball.RestfulWebServices.workout.Workout;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AthleteService {

    @Autowired
    private final AthleteRepository athleteRepository;

    public AthleteService(AthleteRepository athleteRepository) {
        this.athleteRepository = athleteRepository;
    }

    public List<Athlete> getAthletes(){
        return athleteRepository.findAll();
    }

    public void addNewAthlete(Athlete athlete) {
        Optional<Athlete> athleteByEmail = athleteRepository
                .findAllByEmail(athlete.getEmail());
        if(athleteByEmail.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        athleteRepository.save(athlete);
        System.out.println(athlete);
    }


    public void deleteAthlete(Long athleteId) {
        boolean exist = athleteRepository.existsById(athleteId);
        if (!exist){
            throw new IllegalStateException("student with id: " + athleteId + "does not exist");
        }
        athleteRepository.deleteById(athleteId);
    }

    public void updateAthlete(Athlete athlete, Long id) {
        boolean exist = athleteRepository.existsById(id);
        if (!exist){
            throw new IllegalStateException("student with id: " + id + "does not exist");
        }
        athleteRepository.deleteById(id);
        athleteRepository.save(athlete);
        System.out.println(athlete);
    }
    @Transactional
    public void updateAthlete1(Long athleteId, String name, String email) {
        Athlete athlete = athleteRepository.findById(athleteId)
                .orElseThrow(()-> new IllegalStateException(
                        "student with id:" + athleteId + " does not exist!"));

        if (name != null && name.length() > 0 && !Objects.equals(athlete.getAthleteName(), name)){
            athlete.setAthleteName(name);
        }

        if (email != null && email.length() > 0 && !Objects.equals(athlete.getEmail(), email)){
            Optional<Athlete> athleteByEmail = athleteRepository.findAllByEmail(email);
            if (athleteByEmail.isPresent()){
                throw new IllegalStateException("email taken");
            }
            athlete.setEmail(email);

        }

    }
}
