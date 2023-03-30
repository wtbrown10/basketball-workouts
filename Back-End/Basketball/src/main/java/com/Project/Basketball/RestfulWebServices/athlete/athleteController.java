package com.Project.Basketball.RestfulWebServices.athlete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/athlete")
public class athleteController {

    @Autowired
    private AthleteService athleteService;

    @GetMapping(path = "/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping
    public List<Athlete> getAthletes(){
        return athleteService.getAthletes();
    }

    @PostMapping(path = "/save")
    public void createAthlete(@RequestBody Athlete athlete){
        athleteService.addNewAthlete(athlete);

    }

    @DeleteMapping(path = "/delete/{athleteId}")
    public void deleteAthlete(@PathVariable("athleteId") Long id){
        athleteService.deleteAthlete(id);
    }

    @PutMapping(path = "/update/{athleteId}")
    public void updateAthlete(@PathVariable("athleteId") Long id, @RequestBody Athlete athlete){
        athleteService.updateAthlete(athlete, id);
    }

    @PutMapping(path = "{athleteId}")
    public void updateAthlete1(
            @PathVariable("athleteId") Long athleteId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {
        athleteService.updateAthlete1(athleteId, name, email);
    }




}
