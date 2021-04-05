import static java.lang.Math.*;

import java.util.Random;
import java.util.Arrays;

public class Example20{

    public static void main(String[] args){

            // Random elements
            int limit = 100;
                
            Random rand = new Random();
    
            // array
            int xArray [] = new int[10];
    
            // random array generator with 10 elements
            for(int x = 0; x < xArray.length; x++){
    
                xArray[x] = rand.nextInt(limit);
                
            }
    

            int min = 10;
    
        for(int i = 0; i < xArray.length; i++){
            // if the higest num is higer then max make max higer num
            if(xArray[i] > min){
                    
            System.out.println(xArray[i]);

            } 

        }
            
        Arrays.sort(xArray);
            
        System.out.println(Arrays.toString(xArray));
        
    }
}