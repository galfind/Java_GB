package homework.firstHW;
public class ex2 {
        public static void main(String[] args) {
           System.out.println(counter(5)); 
        }
        static int counter(int n){
            int res = 1;
            for (int i = 1; i <=n; i++) {
                res*=i;
            }
        return res;
    }
}