package me.ebrahimhossain;

public class LoopExamples {

    public static void main(String[] args) {
        //For Loop
        for(int i = 0; i<30; i++){
            System.out.println("Iteration: " + i);
        }

        //while loop
        int counter = 0;
        while (counter < 10) {
            System.out.println(counter);
            counter++;
        }

        //Do While
        int counter2 = 0;
        do{
            System.out.println(counter2);
            counter2++;
        }while(counter2 < 0);
    }
}
