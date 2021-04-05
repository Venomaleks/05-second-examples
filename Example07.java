

public class Example07{

    public static void main(String[] args){

/** */ // Example 07 tabel loop 

        String [] myStings = { "N", "10*N", "100*N", "1000*N" };

        int [][][][][] myNumbers = {{},{},{},{},{} };        

        for (String i : myStings){

            System.out.println(i);
        }

    //    System.out.println("N \n" ); 
        for(int a = 1; a <= 1000; a = a*10){

            
            for(int b = 2; b <= 2000; b = b *10){

                   
                for(int c = 3; c <= 3000; c = c *10){
                   
                        
                    for(int d = 4; d <= 4000; d = d *10){
                        
            
                        for(int e = 5; e <= 5000; e = e *10){

                
                        }
                   
                    }
                
                }
          
            }

        }

        

////////////////////////////////////////////

        /**  //


        String [] myStings = { "N", "10*N", "100*N", "1000*N" };

        for (String i : myStings){

            System.out.println(i);
        }

        System.out.println("N \t"+"10*N \t"+"100*n \t"+"1000*N");

    //    System.out.println("N \n" );
        for(int a = 1; a <= 1000; a = a*10){
        
            System.out.println(a);

        }


    //    System.out.println("10*N \n" );
        for(int b = 2; b <= 2000; b = b *10){

            System.out.println(b);

        }

        
    //    System.out.println("10*N \n" );
        for(int c = 3; c <= 3000; c = c *10){

            System.out.println(c);

        }


    //    System.out.println("100*N \n" );
        for(int d = 4; d <= 4000; d = d *10){

            System.out.println(d);

        }
        

    //    System.out.println("1000*N \n" );
        for(int e = 5; e <= 5000; e = e *10){

            System.out.println(e);

        }
        */
        
//////////////////////////
        /** 
        
        System.out.println("N \n" ); 

        for(int x = 1; x <= 5; x++){

            System.out.println(x);

        }

        System.out.println("10*N \n" );
        for(int y = 10; y <= 50; y = y + 10){

            System.out.println(y);

        }

        System.out.println("100*N \n" );
        for(int z = 100; z <= 500; z = z + 100){

            System.out.println(z);

        }
        
        System.out.println("1000*N \n" );
        for(int q = 1000; q <= 5000; q = q + 1000){

            System.out.println(q);

        } 
        

        String [] myNumbers = { "N", "N*10", "N*100", "N*1000" };


        for(String x : myNumbers ){

            System.out.println(x + "\t");


            for(int y = 10; y <= 50; y = y + 10){

                System.out.println(y);
    
            }

       
       
        }
*/

////////////////////////////
    /** 

        int [][][][] myNumbers = { {}, {}, {}, {} };

        for(int x = 1; x <= 5; x++){

            System.out.println(x +"\n");
           
            for(int y = 10; y <= 50; y = y + 10){

                System.out.println( y +"\t");
      
                for(int z = 100; z <= 500; z = z + 100){

                    System.out.println( z +"\t");

                
                    for(int q = 1000; q <= 5000; q = q + 1000){

                    //    System.out.println( myNumbers[x][y][z][q]);

                    //    System.out.println( q +"\n");
                    
                    } 
                
                    //    System.out.println( z +"\t");
                    
                }
           
                //    System.out.println( y +"\t");
                                
            }

            //    System.out.println(x +"\t");
        }
*/
        

////////////////////////////////////


    //    System.out.println(x +"\t" + y+"\t" + z +"\t" + q); 

    /**   // System.out.println(x +"\t" + y+"\t" + z +"\t" + q +"\n");


        int [][][][] myNumbers = { {1,2,3,4,5}, {10, 20, 30, 40, 50}, {100, 200, 300, 400, 500}, {1000, 2000, 3000, 4000, 5000} };
        
        for(int x = 1; x <= myNumbers.length; ++x){

        //    System.out.println(myNumbers[x] +"\n");
           
            for(int y = 10; y <= myNumbers.length; ++y){

            //    System.out.println( myNumbers[][y] +"\t");
      
                for(int z = 100; z <= myNumbers.length; ++z){

                //    System.out.println( myNumbers[][][z] +"\t");

                
                    for(int q = 1000; q <= myNumbers.length; ++q){

                        System.out.println( myNumbers[x][y][z][q]);
                    } 
                
                    
                }
           
                                
            }

            
        }

       */
    }
}