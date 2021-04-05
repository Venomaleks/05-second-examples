

public class Example12{

    public static void main(String[] args){

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
    }
}