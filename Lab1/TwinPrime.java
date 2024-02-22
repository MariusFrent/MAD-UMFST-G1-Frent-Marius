public class TwinPrime {
    public static boolean isPrime(int nr) {
        for (int d=2;d*d<=nr;d++) {
            if (nr%d==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i=2;i<=100;i++) {
            if (isPrime(i)==true && isPrime(i+2)==true)
                System.out.println("(" + i + ", " + (i+2) + ")");
        }
    }
}
