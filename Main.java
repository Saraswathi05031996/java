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
            System.out.println("positive");
        }
        else if(number < 0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("zero");
        }
    }
}
