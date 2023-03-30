package com.Project.Basketball.RestfulWebServices.athlete;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AthleteRepository extends JpaRepository<Athlete, Long> {

    @Query("SELECT s FROM Athlete s WHERE s.email = ?1")
    Optional<Athlete> findAllByEmail(String email);

}
