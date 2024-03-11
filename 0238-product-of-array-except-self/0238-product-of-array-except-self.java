class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
       int temp=1;
        for(int i=0;i<nums.length;i++){
            arr[i]=temp;
            temp*=nums[i];
        }
        
        temp=1;
        for(int j=nums.length-1;j>=0;j--){
            arr[j]*=temp;
            temp*=nums[j];
        }
    
        
        return arr;
        
        
        
        
        
        
        
        
        
        
        
    }
}