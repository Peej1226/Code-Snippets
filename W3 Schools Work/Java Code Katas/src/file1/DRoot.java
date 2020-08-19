package file1;


public class DRoot {
    public static int digital_root(int n) {
      int sum = 0;
      System.out.println("n " + n);
      do {
        while (n > 0) {
          sum += n % 10;
          n = n / 10;
          System.out.println("sum " + sum + "  n " + n);
        }
        n = sum;
        if (sum / 10 > 0) {
            sum = 0;
        }
        
        System.out.println(sum);
      } while (n / 10 > 0);
      
      return sum;
    }
  }