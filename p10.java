//half diamond star
// *
// **
// ***
// ****
// ***
// **
// *
class p10{
    static void pattern(int n){
        for(int i=1;i<=2*n-1;i++){
            int star=i;
            if(i>n) 
                star=2*n-i;
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    int n=4;
   pattern(n);
}
}
