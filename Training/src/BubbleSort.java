public class BubbleSort {
  public static void main(String[] args) {
    int[] target = {1,5,11,4,24,13,542,3123,5,123,2,5,1231,22,221,1};
    int[] result = new BubbleSort().sort(target);
    for(int i=0; i<result.length; i++) {
      System.out.println(result[i]);
    }
  }

  public int[] sort(int[] target) {
    int max = target.length - 1;
    for (int j = 0; j < max-1; j++) {
      for (int i = 0; i < max-j; i++) {
        if (target[i] < target[i+1]) {
          swap(target, i, i+1);
        }
      }
    }
    return target;
  }

  public void swap(int[] target, int i, int j) {
    int temp = target[i];
    target[i] = target[j];
    target[j] = temp;
  }
}
