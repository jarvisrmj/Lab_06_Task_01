import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        double degC = 0;


        System.out.print("\nEnter the degrees in C: ");
        if(in.hasNextDouble())
        {
            degC = in.nextDouble();
            in.nextLine();
            System.out.print("\nYou said your salary is " + degC);
        }
        else
        {
            trash = in.nextLine ();
            System.out.println(trash + " is bad input!");
        }
        double degF = (degC * 9 / 5 + 32 ) ;
        System.out.print("\nThe degrees in F is " + degF);



    }
}