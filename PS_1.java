//Check if a Number is Prime:
import java.util.*;
public class PS_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        Boolean prime= true;
        if (n<=1){
            prime = false;
        }
        for( int i=2; i<=n/2; i++){
            if(n%i==0){
                prime=false;
            }
            else{
                prime=true;
            }
        }System.out.println(prime);
    }
}
