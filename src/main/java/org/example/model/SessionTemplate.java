package org.example.model;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;

@Getter
@Builder
public class SessionTemplate {
    @Builder.Default
    private String name = "";
    @Builder.Default
    private ArrayList<ExerciseRecord> sessionTemplate = new ArrayList<>();


    public void addExercise(ExerciseRecord exR){
        sessionTemplate.add(exR);
    }

    public void deleteExercise(ExerciseRecord exR){
        // Try catch? if something goes wrong
        sessionTemplate.remove(exR);
    }

    @Override
    public String toString() {
        return "\nEmptyWorkOutSession{" +
                "\nName=" + name +
                "\nsessionTemplate=" + sessionTemplate +
                '}';
    }
}