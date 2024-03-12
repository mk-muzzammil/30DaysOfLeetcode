class Solution {
    public boolean isPalindrome(int x) {
        int remainder=0;
        int reverseNum=0;
        int temp=x;
        if(x<0){
            return false;            
        }
        else{
            while(temp!=0){
            remainder=temp%10;
            reverseNum=reverseNum*10 + remainder;
            temp=temp/10;
        }
        
        if(reverseNum == x){
            return true;
        }
        else{
            return false;
        }
            
        }
        
        
        
        
        
        
        
        
        
    }
}