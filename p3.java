//Right anagle number pyramid
//1
//12
//123
//1234
//12345
class Solution{
    public void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
public class p3{
    public static void main(String[] args) {
        int n=5;
        Solution sol=new Solution();
        sol.pattern1(n);
    }
}