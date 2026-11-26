class Solution {
    public boolean canAliceWin(int n) {
        if(n >= 10 && n <= 18){
            return true;
        }
        if(n >= 27 && n <= 33){
            return true;
        }
        if(n >= 40 && n <= 44){
            return true;
        }
        if(n >= 49 && n <= 50){
            return true;
        }
        return false;
    }
}