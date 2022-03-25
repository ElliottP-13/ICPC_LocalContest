import java.util.Scanner;

public class demo{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);  // Scanner object to get input from standard in

        String line = scan.nextLine();  // read the first line
        int n = Integer.parseInt(line);  // Turn it into an integer

        for (int i = 0; i < n; i ++){  // For the number of problems ...

            line = scan.nextLine();  // read the line
            String[] split = line.split(" ");  // split it so we can get a and b
            
            // parse a and b as ints
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);

            System.out.println(a + b);

        }

    }

}
