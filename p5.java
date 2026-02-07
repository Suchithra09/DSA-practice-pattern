//inverted right pyramid
//***** 
//**** 
//*** 
//** 
//* 
class Solution{
    public void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class p5{
    public static void main(String[] args) {
        int n=5;
        Solution sol=new Solution();
        sol.pattern1(n);
    }
}