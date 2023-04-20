package homework.firstHW;
public class ex1 {
        public static void main(String[] args) {
           System.out.println(counter(5)); 
        }
        static int counter(int n){
            int res = 0;
            for (int i = 0; i <=n; i++) {
                res+=i;
            }
        return res;
    }
}