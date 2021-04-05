

public class Example15{

    public static void main(String[] args){

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
 
    }
}