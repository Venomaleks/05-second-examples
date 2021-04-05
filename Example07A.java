

public class Example07A{

    public static void main(String[] args){


//////////////////////////////////////////////////////

// exempel 7 array code

/** */ //internet help calc

    System.out.println("N\t" + "10*N\t" + "100*N\t" + "1000*N\n");

    int a[]={1,2,3,4,5};     // singel array 1

    int b[]={1,10,100,1000};   // singel array 2

    int c[][] = new int [5][4];    // en calc for the arrays


        for (int i= 0;i<5; i++){        // make 1 singel array
            for (int j= 0; j<4; j++){       // make singl array to dubbel array

                for(int k = 0; k < 9; k++){     // calc all the calues that can be created 

                    c[i][j]=a[i]*b[j];
                }

            }
            
            System.out.println(c[i][0] + "\t" + c[i][1] + "\t" + c[i][2] + "\t" + c[i][3] + "\t");  // print the numbers
        }

        System.out.println("\n");

/**  */// annas forloop tabel

    System.out.println("N\t" + "10*N\t" + "100*N\t" + "1000*N\n");

        for(int i = 1; i<=5; i++){

            System.out.println(i + "\t" + 10*i + "\t" + 100*i + "\t" + 1000*i );
        }

    }
}