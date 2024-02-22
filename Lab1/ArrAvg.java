import java.util.Random;
public class ArrAvg 
{
    public static void main(String[] args) 
    {
        Random r = new Random();
        int[] arr = new int[5];
        double avg = 0;
        System.out.println("Elementele sunt:");
        for (int i=0; i<arr.length;i++)
        {
            arr[i]=r.nextInt(1,10);
            avg+=arr[i];
            System.out.println("arr["+i+"]="+arr[i]);
        }
        avg/=arr.length;
        System.out.println("Media este: "+avg);
    }
}