package abhi.application;

public class IsPrime {

    public static void main(String[] args) {

        System.out.println(isPrime(1103));
    }

    private static boolean isPrime(int number) {
        if(number == 1 || number == 2){
            return true;
        } else {
            int div = 2;
            while(div < number){
                if(number % div == 0){
                    return false;
                }
                div++;
            }
        }
        return true;
    }
}
