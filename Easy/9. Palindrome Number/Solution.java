class Solution {
    public boolean isPalindrome(int x) {
        int revX = 0, y=x;
        while(y > 0){
            revX = revX * 10 + y % 10;
            y = y / 10;
        }
        if(revX == x) 
            return true;
        return false;
    }
}