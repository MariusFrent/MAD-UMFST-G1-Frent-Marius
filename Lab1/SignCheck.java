import java.util.Scanner;
public class SignCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numar=sc.nextInt();

        if (numar>0)
            System.out.println("Numar pozitiv");
        if (numar<0)
            System.out.println("Numar negativ");
        if (numar==0)
            System.out.println("Numarul e zero");
        sc.close();
    }
}
