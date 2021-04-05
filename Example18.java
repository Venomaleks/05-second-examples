import static java.lang.Math.*;

import java.util.Random;
import java.util.Arrays;

public class Example18{

    public static void main(String[] args){

        
/** */
        // Random elements
        int limit = 100;
        
        Random rand = new Random();

        // array
        int xArray [] = new int[10];

        
        
        int x = 0;

        // random array generator with 10 elements
        while( x < xArray.length){

            xArray[x] = rand.nextInt(limit);
            
            x++;
        }


        // saying what is gona be the max number
        int max = xArray[0];


        int i = 0;

        while ( i < xArray.length){

            // if the higest num is higer then max make max higer num
            if(xArray[i] > max){
                
                max = xArray[i];

                i++;
            } else{

                i++;
            }

        }
        
        Arrays.sort(xArray);
        
        System.out.println(Arrays.toString(xArray));
        
        System.out.println(max);

    }
}

