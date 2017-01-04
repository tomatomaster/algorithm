/**
 * FizzBuzz
 * 
 *
 */
public class FizzBuzz {
  public static void main(String[] args) {
    int value = Integer.valueOf(args[0]);
    new FizzBuzz().fizzbuzz(value);
  }

  public void fizzbuzz(int value) {
    for (int i = 1; i <= value; i++) {
      if (i % 15 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else {
        System.out.println(i);
      }
    }
  }


}
