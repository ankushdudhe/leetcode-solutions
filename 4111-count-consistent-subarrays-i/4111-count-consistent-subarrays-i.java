class Solution {
    public int countConsistent(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            for(int j = i;j < nums.length;j++){
                List<Integer> arr1 = new ArrayList<>();
                for(int k = i;k <= j;k++){
                    arr1.add(nums[k]);  
                }
                arr.add(arr1);
            }
        }
        int count = 0;
        for(int i = 0;i < arr.size();i++){
            int Bit_min = arr.get(i).get(0);
            int min = arr.get(i).get(0);
            for(int j = 1;j < arr.get(i).size();j++){
                if(min > arr.get(i).get(j)){
                    min = arr.get(i).get(j);
                }
                Bit_min &= arr.get(i).get(j);
            }
            if(Bit_min == min){
                count++;
            }
        }
        return count;
    }
}