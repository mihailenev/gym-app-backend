package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
@AllArgsConstructor
public class WorkoutSession{
    @Builder.Default
    private LocalDate date = LocalDate.now(); //later use time class no local date and we need to get date
    private SessionTemplate session;

    public WorkoutSession(){
        date = LocalDate.now();
        session = SessionTemplate.builder().build();
    }

    public WorkoutSession(SessionTemplate session){
        date = LocalDate.now();
        this.session = session;
    }


    @Override
    public String toString() {

        return "WorkoutSession{" +
                "date = " + date + "\nWorkoutSession = " + session +
                '}';
    }
}
