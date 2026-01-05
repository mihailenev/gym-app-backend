package org.example.model;

import java.util.UUID;

public class Exercise {
    private UUID id;
    private String name;
    private String description;

    public Exercise(String name, String description){
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
