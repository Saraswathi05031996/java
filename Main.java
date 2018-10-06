import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print(" ");
        number = scan.nextInt();
        scan.close();
        if(number > 0)
        {
            System.out.println("The given number"+n" is positive number");
        }
        else if(number < 0)
        {
            System.out.println("The given number"+n" is negative number");
        }
        else
        {
            System.out.println("The given number"+n" is neither positive nor negative");
        }
    }
}
