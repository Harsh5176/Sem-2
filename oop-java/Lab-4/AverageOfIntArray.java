public class AverageOfIntArray{
    public static void main(String [] args){

      int [] a = new int[5];

      a[0] = 2;
      a[1] = 7;
      a[2] = 9;
      a[3] = 4;

      int sum = a[0]+a[1]+a[2]+a[3];

      double ave = sum/4.0;

      System.out.println(ave);

    }
}