// Right angled triangle pattern
//* 
//** 
//*** 
class Solution{
    public void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class p2{
    public static void main(String[] args) {
        int n=3;
        Solution sol=new Solution();
        sol.pattern1(n);
    }
}