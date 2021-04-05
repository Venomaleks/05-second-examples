import java.util.Scanner;

public class Example17{

    public static void main(String[] args){

        double[] intArray= {5, 6, 10};

        System.out.println("What gread did you get :3");

        Scanner Obj = new Scanner(System.in);

        double grade = Obj.nextDouble();


        if(grade <= intArray[0]){

            System.out.println("You failed :,(");

        }else{

            System.out.println("Great work XD");
        }

    }
}