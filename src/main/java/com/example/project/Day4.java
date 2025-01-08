


package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int speed;
        private int distanceTraveled;
        private int runDuration;
        private int restDuration;
        private int runTime = 1;
        private int restTime;
        private boolean running = true;
        private static int winningDistance = 0;
        private static String winner = "";

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            restTime = restDuration;
            winningDistance = 0;
            winner = "";
        }

        public int getDistanceTraveled(){ // this method is required
            return distanceTraveled;
        }
        
        public static String getWinner(){
            return winner;
        }

        public String getName(){
            return name;
        }

        public void simulateSecond(){ //this method is required but not tested
            if(runTime <= runDuration){
                runTime++;
                distanceTraveled+=speed;
                restTime = 1;
            } else {
                if(restTime < restDuration){
                    restTime++;
                } else {
                    runTime = 1;
                }
            }
            if (distanceTraveled > winningDistance){
                winningDistance = distanceTraveled;
                winner = name;
            }
        }
    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        for(int i = 0; i < time; i++){
            for(int j = 0; j < reindeers.length; j++){
                reindeers[j].simulateSecond();
            }
        }
        return Reindeer.getWinner();
    }
}



