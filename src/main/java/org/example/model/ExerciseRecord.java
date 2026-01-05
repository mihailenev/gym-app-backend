package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.UUID;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class ExerciseRecord {
    @NonNull
    private UUID exerciseId;
    @NonNull
    private Integer numberOfSets;
    @Builder.Default
    private TypeOfExercise executionType = TypeOfExercise.REGULAR;
    private ArrayList<SetRecord> sets;

    public void deleteSetRecord(SetRecord s){
        // Try catch? if something goes wrong
        sets.remove(s);
    }

    @Override
    public String toString() {
        return "\nExerciseRecord{\n" +
                "exerciseId=" + exerciseId +
                ", numberOfSets=" + numberOfSets +
                ", executionType=" + executionType +
                ", sets=" + sets +
                '}';
    }
}
