

public class Example10{

    public static void main(String[] args){

    // Example 10 do while loop pseudo-code

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

    }
}