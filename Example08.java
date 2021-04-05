

public class Example08{

    public static void main(String[] args)  {
    
        // Example 08 for loop pseudo-code

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

    }
}