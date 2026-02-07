//right angled number pyramid 2
//1
//22
//333
//4444
//55555
class Solution{
    public void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
public class p4{
    public static void main(String[] args) {
        int n=5;
        Solution sol=new Solution();
        sol.pattern1(n);
    }
}