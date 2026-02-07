//inverted number right pyramid
//12345
//1234
//123
//12
//1
class Solution{
    public void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print((n-j+1)+" ");
            }
            System.out.println();
        }
    }
}
public class p6{
    public static void main(String[] args) {
        int n=5;
        Solution sol=new Solution();
        sol.pattern1(n);
    }
}