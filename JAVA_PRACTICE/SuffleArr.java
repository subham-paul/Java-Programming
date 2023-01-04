    class SuffleArr {
        public static int[] shuffle(int[] nums, int n) {
            
            int len = nums.length;
            
            // to store the pair of numbers in right half of the original array
            for(int i = n; i < len; i++) {
                nums[i] = (nums[i] * 1024) + nums[i - n];
                System.out.println(nums[i]);
            }
            
            int index = 0;
            // to retrive values from the pair of numbers and placing those retrieved value at their desired position
            for(int i = n; i < len; i++, index += 2) {
                nums[index] = nums[i] % 1024;
                nums[index + 1] = nums[i] / 1024;
            }
            
            return nums;
        }
        public static void main(String args[]) {
            int nums[] = {2,5,1,3,4,7};
            int n = 3;
            shuffle(nums, n);
            // for (int i = 0; i < nums.length; i++) {
            //     System.out.print(nums[i]);
            // }
        }
    }
