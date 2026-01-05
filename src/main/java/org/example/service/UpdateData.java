package org.example.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.model.Exercise;
import org.example.model.WorkoutSession;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class UpdateData {

    public static void Exercises(ArrayList<Exercise> exercises, String filePath) {
        //to save The array Exercises in a file
        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(exercises, writer);
        } catch (IOException e) {
            System.err.println("Failed to update Exercise Data: " + e.getMessage());
        }
    }

    public static void WorkSessions(ArrayList<WorkoutSession> wSessions, String filePath) {
        //to save The array WA in a file
        Gson gson = new GsonBuilder()
                // register custom JsonSerializer for LocalDate
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                .create();

        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(wSessions, writer);
        } catch (IOException e) {
            System.err.println("Failed to update Work Session Data: " + e.getMessage());
        }
    }
}
