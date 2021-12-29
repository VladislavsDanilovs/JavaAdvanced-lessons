package Java_Advanced.Lesson3_Generics.Lesson7_Practice_Example;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Participants> participants = new ArrayList<>();

    public Team(String name){
        this.name = name;
        //TODO
    }

    public void addNewParticipants(Participants p1){
        participants.add(p1);
    }
    
}
