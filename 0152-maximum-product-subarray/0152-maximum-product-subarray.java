class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct=0;
        int leftProduct=1;
        int rightProduct=1;
        int length=nums.length;
        if(length ==1){
            return nums[0];
        }else{
            for(int i=0;i<length;i++){
            leftProduct=leftProduct*nums[i];
            rightProduct=rightProduct*nums[length-1-i];

            maxProduct=Math.max(maxProduct,Math.max(leftProduct,rightProduct));

            if(leftProduct == 0 ){
                leftProduct=1;
            }
            else if(rightProduct ==0){
                rightProduct=1;
            }

            


        }

        }
        
        return maxProduct;

        
    }
}