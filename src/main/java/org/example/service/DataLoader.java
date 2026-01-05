package org.example.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.model.Exercise;
import org.example.model.ProgramTemplate;
import org.example.model.WorkoutSession;


import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class DataLoader {

    public static ArrayList<Exercise> exercises(String filePath) {
        ArrayList<Exercise> exercises = new ArrayList<>();
        Gson gson = new Gson();

        try (FileReader reader = new FileReader(filePath)) {
            Type listType = new TypeToken<ArrayList<Exercise>>() {}.getType();
            exercises = gson.fromJson(reader, listType);
        } catch (IOException e) {
            System.err.println("Failed to load exercises: " + e.getMessage());
        }

        return exercises;
    }

    public static ArrayList<ProgramTemplate> programTemplates(String filePath) {
        ArrayList<ProgramTemplate> programTemplates = new ArrayList<>();
        Gson gson = new Gson();

        try (FileReader reader = new FileReader(filePath)) {
            Type listType = new TypeToken<ArrayList<ProgramTemplate>>() {}.getType();
            programTemplates = gson.fromJson(reader, listType);
        } catch (IOException e) {
            System.err.println("Failed to load programTemplates: " + e.getMessage());
        }

        return programTemplates;
    }

    public static ArrayList<WorkoutSession> WorkSessionRecords(String filePath) {
        ArrayList<WorkoutSession> workSessionRecords = new ArrayList<>();
        Gson gson = new Gson();

        try (FileReader reader = new FileReader(filePath)) {
            Type listType = new TypeToken<ArrayList<ProgramTemplate>>() {}.getType();
            workSessionRecords = gson.fromJson(reader, listType);
        } catch (IOException e) {
            System.err.println("Failed to load workSessionRecords: " + e.getMessage());
        }

        return workSessionRecords;
    }
}
