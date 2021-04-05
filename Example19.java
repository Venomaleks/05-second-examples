import static java.lang.Math.*;

import java.util.Random;
import java.util.Arrays;

public class Example19{

    public static void main(String[] args){

        // Random elements
        int limit = 100;
                
        Random rand = new Random();

        // array
        int xArray [] = new int[10];



        int x = 0;

        // random array generator with 10 elements
        do{

            xArray[x] = rand.nextInt(limit);
            
            x++;

        }while( x < xArray.length);


            // saying what is gona be the max number
        int min = xArray[0];


        int i = 0;
    
        do{
            // if the higest num is higer then max make max higer num
            if(xArray[i] < min){
                    
                min = xArray[i];
    
                i++;
            } else{

                i++;
            }

        }while ( i < xArray.length );
            
        Arrays.sort(xArray);
            
        System.out.println(Arrays.toString(xArray));
            
        System.out.println(min);
        
    }
}