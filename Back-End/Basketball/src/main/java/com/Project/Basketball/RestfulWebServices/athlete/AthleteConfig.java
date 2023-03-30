//package com.Project.Basketball.RestfulWebServices.athlete;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//@Configuration
//public class AthleteConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(
//            AthleteRepository repository) {
//        return args -> {
//            Athlete kobe =
//                    new Athlete("kobe",
//                            "wtbrown10@gmail.com", "password",
//                            "point guard", LocalDate.of(1991, Month.FEBRUARY,
//                            10)
//                    );
//            repository.save(kobe);
//        };
//    }
//}
