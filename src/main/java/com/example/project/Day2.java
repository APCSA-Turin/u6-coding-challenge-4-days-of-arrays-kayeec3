package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String[][] naughtyOrNice = new String[2][names.length];
        int naughty = 0; 
        int nice = 0; 
        for(int i = 0; i < names.length; i ++){ //randomNumber to decide naughty or nice
            double randomNumber = Math.random();
            if(randomNumber < 0.5){
                naughtyOrNice[0][naughty] = names[i];
                naughty ++;
            }
            else{
                naughtyOrNice[1][nice] = names[i];
                nice ++;
            }
        }
        return naughtyOrNice;
    }

    public static void main(String[] args) {
    
    }
}
