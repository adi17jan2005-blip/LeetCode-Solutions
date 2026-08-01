import java.util.Random;

class Solution {

    Random rand = new Random();

    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quicksort(int nums[], int low, int high) {

        if (low < high) {

            int ptindex = Partition(nums, low, high);

            quicksort(nums, low, ptindex - 1);
            quicksort(nums, ptindex + 1, high);
        }
    }

    public int Partition(int nums[], int low, int high) {

        // Randomly choose a pivot index
        int randomIndex = low + rand.nextInt(high - low + 1);

        // Swap random pivot with first element
        int temp = nums[low];
        nums[low] = nums[randomIndex];
        nums[randomIndex] = temp;

        // Use the first element as pivot
        int pivot = nums[low];

        int i = low;
        int j = high;

        while (i < j) {

            while (i <= high - 1 && nums[i] <= pivot) {
                i++;
            }

            while (j >= low + 1 && nums[j] > pivot) {
                j--;
            }

            if (i < j) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;
    }
}