package org.example.model;


import lombok.*;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class SetRecord {
    //@NonNull Reps CAN be null when you want to do as much as possible
    private Integer reps;
    @Builder.Default
    private Double weight = 0.0d;
    private Integer rpe;
    @Builder.Default
    private TypeOfSets type = TypeOfSets.REGULAR_SET;


    @Override
    public String toString() {
        return "\nSetRecord{" +
                "reps=" + reps +
                ", weight=" + weight +
                ", rpe=" + rpe +
                ", type=" + type +
                '}';
    }
}
