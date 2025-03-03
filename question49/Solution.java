class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n= nums.length;
        ArrayList<Integer> smaller = new ArrayList<>();
       ArrayList<Integer> equals = new ArrayList<>();
       ArrayList<Integer> larger = new ArrayList<>();
        for(int i=0; i<n;i++){
            if(nums[i]<pivot){
                smaller.add(nums[i]);
            }
            else if(nums[i]==pivot){
                equals.add(nums[i]);
            }
            else{
                larger.add(nums[i]);
            }
        }

        int index=0;

        for(int num : smaller)
{
    nums[index++]=num;
}
for(int num : equals)
{
    nums[index++]=num;
}
for(int num : larger)
{
    nums[index++]=num;
}


return nums;

            }
}