package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.model.*;
import org.example.service.DataLoader;
import org.example.service.UpdateData;


import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        // what i want is to Load all exercises in array of Exes, load all tPrograms in array of programs

        String filePath = "D:/Projects/java/GymApp/src/main/resources";



        ArrayList<Exercise> EXERCISES = DataLoader.exercises(filePath + "/Exercise.json");

        ArrayList<ProgramTemplate> programs = DataLoader.programTemplates(filePath + "/ProgramTemplate.json");
        System.out.println(programs);

        ArrayList<WorkoutSession> mySessions = new ArrayList<>();
        mySessions.add(new WorkoutSession(programs.get(0).getSession("Legs")));

        //System.out.println(mySessions);
        //TODO Fix Exercise data to be with UUID
        //TODO ADD SETS AND SAVE IN DATA FILE

        UpdateData.WorkSessions(mySessions,filePath + "/WSdata.json");

        ArrayList<WorkoutSession> sessionsFromData = DataLoader.WorkSessionRecords(filePath + "/WSdata.json");
        System.out.println(sessionsFromData);


        /*
        // UNCOMMENT ONLY IF YOU WANT TO SAVE THE PROGRAMS IN FILE

        ArrayList<ProgramTemplate> programs = new ArrayList<>();
        programs.add(programTemplate);

        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter("D:/Projects/java/GymApp/src/main/resources/ProgramTemplate.json")) {
            gson.toJson(programs, writer);
        } // FileWriter will be automatically closed here
        */

    }
}