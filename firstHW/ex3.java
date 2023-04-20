package homework.firstHW;

public class ex3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if(simple(i)){
                System.out.println(i); 
            }
        }
    }
    static boolean simple(int n){
        if (n<2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
