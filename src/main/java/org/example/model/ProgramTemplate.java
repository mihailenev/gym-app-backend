package org.example.model;

import java.util.ArrayList;
import java.util.UUID;

public class ProgramTemplate {
    private UUID id;
    private String name;
    private ArrayList<SessionTemplate> program;

    public ProgramTemplate(String name){
        this.id = UUID.randomUUID();
        this.name = name;
        program = new ArrayList<SessionTemplate>();
    }

    @Override
    public String toString() {
        return "ProgramTemplate{" +
                "\nid=" + id +
                ", \nname='" + name + '\'' +
                ", \nprogram=" + program +
                '}';
    }

    public void addWorkOutProgramSession(SessionTemplate e){
        program.add(e);
    }


    public SessionTemplate getSession(String sessionName){
        for(SessionTemplate i : program){
            if(i.getName().equals(sessionName)){
                return i;
            }
        }
        return SessionTemplate.builder().build();
    }

}
