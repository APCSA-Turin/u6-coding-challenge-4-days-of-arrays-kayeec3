package com.example.project;



public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        for(int i = 0; i<size; i++){
          for (int j = 0; j < size; j++){
            grid[i][j] = " "; 
          }
        }
        //first diagonal 
        for(int i = 0; i < size; i++){
          for(int j = 0; j < size; j++){
            if (i==j){
              grid[i][j] = "*";
            }
          }
        }

 //second diagonal
        for(int i = 0; i < size; i++){
          for (int j = size-1; j >= 0; j--){
            if (i+j == size-1){
              grid[i][j] = "*"; 
          
            }
          }
        }

        //middle of snowflake 

        for (int i = 0; i < size; i++){
          for(int j = 0; j < size; j++){
            if (j==((size-1)/2)){
              grid[i][j] = "*"; 
            }
          }
        }

        for(int i = 0; i < size; i++){
          if (i == ((size-1)/2)){
            for (int j = 0; j < size; j++){
              grid[i][j] = "*"; 
            }
          }
        }

        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
  
      for(int i = 0; i < snowflake.length; i++){
        for (int j = 0; j < snowflake[i].length; j++){
          System.out.print(snowflake[i][j]+ " ");
        }
        System.out.println();
      }
    
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
      String[][] snowflake = generateSnowflake(7);
      printSnowflake(snowflake);
    }
}
