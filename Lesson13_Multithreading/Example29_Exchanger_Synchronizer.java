package Lesson13_Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Example29_Exchanger_Synchronizer {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> playerAction = new ArrayList<>();
        playerAction.add(Action.SCISSORS);
        playerAction.add(Action.PAPER);
        playerAction.add(Action.SCISSORS);

        List<Action> player2Action = new ArrayList<>();
        player2Action.add(Action.PAPER);
        player2Action.add(Action.ROCK);
        player2Action.add(Action.ROCK);

        new Player("Daivid", playerAction, exchanger);
        new Player("Lucian", player2Action, exchanger);

    }
}

enum Action {
    ROCK, PAPER, SCISSORS;
}

class Player extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public Player(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();

    }

    private void Winner(Action myAction, Action playerAction) {
        if ((myAction == Action.ROCK && playerAction == Action.SCISSORS)
                || (myAction == Action.SCISSORS && playerAction == Action.PAPER)
                || (myAction == Action.PAPER && playerAction == Action.ROCK)) {
            System.out.println(name + " WINS!");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                Winner(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}