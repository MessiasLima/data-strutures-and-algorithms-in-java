package examples.chapter1.exercises.creativity;

public class Fifteen {

    static class Result {
        private final Integer largest;
        private final Integer smallest;

        Result(Integer smallest, Integer largest) {
            this.smallest = smallest;
            this.largest = largest;
        }

        public int getLargest() {
            return largest;
        }

        public int getSmallest() {
            return smallest;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{12, 45, 23, -9, 57, 220};
        Result result = getSmallestAndLargest(array);
        System.out.println(result.getLargest() == 220);
        System.out.println(result.getSmallest() == -9);
    }

    private static Result getSmallestAndLargest(int[] array) {
        Integer smallest = null;
        Integer largest = null;

        for (int n : array) {
            if (smallest == null) {
                smallest = n;
            }

            if (largest == null) {
                largest = n;
            }

            if (smallest > n) {
                smallest = n;
            }

            if (largest < n) {
                largest = n;
            }
        }

        return new Result(smallest, largest);
    }
}
