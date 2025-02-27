public class sumOfUniqueElements{

    public static int sumUniqueElements(int[] nums) {
        int[] counts = new int[100];

        for (int count = 0; count < nums.length; count++) {
            counts[nums[count]]++;
        }

        int total = 0;
        for (int counter = 0; counter < counts.length; counter++) {
            if (counts[counter] == 1) {
                sum += counter;
            }
        }

        return total;
    }
}

