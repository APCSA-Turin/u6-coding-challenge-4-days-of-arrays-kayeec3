package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};
    public static String generateElfName(String name){
        if (name.equals("")|| name.equals(null)) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        else {
                    int stringnum = elf_names.length + 1;
         int elfNum = (int) (Math.random() * (stringnum - 1)) + 1;
             String elffirst = elf_names[elfNum-1];
             return elffirst + " " + name; 
        }
         }
}