import static java.lang.Math.*;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;


// ALL THIS IS ALL THE PROGRAMING QUESTIONS 005

public class Example01{

    public static void main(String[] args){

        /**  // Example 04 For loop

        for(int x=0;x <= 20; x++){

            System.out.println(x);
        }
        */

///////////////////////////////////////////////////////////

        /**  // Example 05 while loop

        int x = 0;

        while(x <= 20) {

            System.out.println(x);
            x++;
        }

        */

///////////////////////////////////////////////////////////

        /**  // Example 06 do while loop

        int x = 0;

        do{

        System.out.println(x);
        
        x++;

        }while(x <= 20);

        */
            
///////////////////////////////////////////////////////////

     /** // Example 07 array tabel loop  

     System.out.println("N\t" + "10*N\t" + "100*N\t" + "1000*N\n");

     int a[]={1,2,3,4,5};     // singel array 1
     
     int b[]={1,10,100,1000};   // singel array 2
 


     int c[][] = new int [a.length][b.length];    // en calc for the arrays ([5] [4])



         for (int i= 0;i < 5; i++){        // make 1 singel array (5)
             for (int j= 0; j < 4; j++){       // make singl array to dubbel array (4)
 
                 for(int k = 0; k < c[i][j]; k++){     // calc all the calues that can be created (9)
 
                     c[i][j]=a[i]*b[j];
                 }
             }
             
             System.out.println(c[i][0] + "\t" + c[i][1] + "\t" + c[i][2] + "\t" + c[i][3] + "\t");  // print the numbers
         }
*/ 

///////////////////////////////////////////////////////////

/** // Example 08 for loop pseudo-code

    int z = 0;
    int q = 0;
    int x;

    for( x = 0; x < 20; ++x){

        if( x % 2 == 1){

            z++;
        } else if (x % 2 == 0){

            q++;
        }else{

            System.out.println("hehe samthing is wrong");
        }
    
    }

    System.out.println("Haw meny uneven numbers there are " + z);

    System.out.println("Haw meny even numbers there are " + q);

    System.out.println("Haw meny nummbers it is in the end " + x);

    */

///////////////////////////////////////////////////////////

    /** // Example 09 while loop pseudo-code
      
    int z = 0;
    int q = 0;
    int x = 0;

        while(x < 20){

            if( x % 2 == 1){

                z++;
            } else if (x % 2 == 0){

                q++;
            }else{

                System.out.println("hehe samthing is wrong");
            }
        
            ++x;

        }

        System.out.println("Haw meny uneven numbers there are " + z);

        System.out.println("Haw meny even numbers there are " + q);

        System.out.println("Haw meny nummbers it is in the end " + x);

        */

///////////////////////////////////////////////////////////

    /** // Example 10 do while loop pseudo-code

    int z = 0;
    int q = 0;
    int x = 0;

        do{

            if( x % 2 == 1){

                z++;
            } else if (x % 2 == 0){

                q++;
            }else{

                System.out.println("hehe samthing is wrong");
            }

            x++;
            
        }while(x < 20);


        System.out.println("Haw meny uneven numbers there are " + z);

        System.out.println("Haw meny even numbers there are " + q);

        System.out.println("Haw meny nummbers it is in the end " + x);

*/ 

///////////////////////////////////////////////////////////

        /**  // Example 11 for loop pseudo-code muteplyer



        for(int x = 0; x <= 10; ++x){

            if(x != 0){


                System.out.println( x + " what this number times 9");

                x = x * 9;

                System.out.println(x + "\n");

                x = x / 9;

        
            }else if (x == 0){

                System.out.println( x + " what this number times 9");

                x = x * 9;

                System.out.println(x + "\n");

            }

        }
    */

///////////////////////////////////////////////////////////

        /**  // Example 12 for loop pseudo-code muteplyer

        double sum = 0;
        int x = 0;

        while(x <= 20){

            sum = sum + x;

            System.out.println(x);
        
            x++;
        }
        
        x--;

        System.out.println("this is the sum of all numbers" + "\t" + sum);

        System.out.println("this is what x is " + "\t" + x );

        sum = sum/x;

        System.out.println("this is the sum of sum devided by x " + "\t" + sum);

    */

///////////////////////////////////////////////////////////

/**     // Example 13 for loop print all even num

        for(int x = 0; x <= 50; x++){

            if( 0 == x % 2){

                System.out.println(x);

            }
        }

*/

///////////////////////////////////////////////////////////

/**    // Example 14 for loop print all numbers that can be devided by 7

        for(int x = 0; x <= 50; x++){

            if( 0 == x%7){

                System.out.println("What X is " + x);

                System.out.println("What X / 7 is " + x/7);
            }
        }
        */


///////////////////////////////////////////////////////////


/**     // Example 15 do while loop all even times 2


        int x = 0;
        int sum = 0;

        do{

            System.out.println("\t" + x );

            if(1 == x % 2){

            sum = x * x;

            System.out.println(sum);

            }

            x++;
        }
        while(x <= 10);

*/


///////////////////////////////////////////////////////////


/**     // Example 16 print out array whit for loop

        String nameArray[] = {"Henrik", "Ricard", "Gustav", "Ida", "Lusy"};

        for(int x = 0; x <= 5; x++){

            System.out.println(nameArray[x]);

        }

    */

///////////////////////////////////////////////////////////


/**    // Example 17 gread handler

        double[] intArray= {5, 6, 10};

        System.out.println("What gread did you get :3");

        Scanner Obj = new Scanner(System.in);

        double grade = Obj.nextDouble();


        if(grade <= intArray[0]){

            System.out.println("You failed :,(");

        }else{

            System.out.println("Great work XD");
        }

*/ 



///////////////////////////////////////////////////////////

/**     // Example 18 while loop print max num from in array

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

    */


///////////////////////////////////////////////////////////

/**     // Example 19 do while loop print min num from in array

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

        */


///////////////////////////////////////////////////////////

/**     // Example 20 for loop print all nums that is 10 or more in array

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

        */

    }
}