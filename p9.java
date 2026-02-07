// Diamond star
//   *
//  ***
// *****
// *****
//  ***
//   * 
class Solution{
    public void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern12(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
public class p9{
    public static void main(String[] args) {
        int n=3;
        Solution sol=new Solution();
        sol.pattern1(n);
        sol.pattern12(n);
    }
}