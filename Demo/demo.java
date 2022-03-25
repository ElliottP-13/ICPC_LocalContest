import java.util.Scanner;

public class demo{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        int n = Integer.parseInt(line);

        for (int i = 0; i < n; i ++){

            line = scan.nextLine();
            String[] split = line.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);

            System.out.println(a + b);

        }

    }

}
