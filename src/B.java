import java.util.Scanner;

/**
 * Created by zvonovdd.18 on 13.03.2017.
 */
public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        for (int i=2;i<n;i++){
            for (int j=2;j<i-1;j++){
                if(i%j==0){
                    flag=false;
                break;
                }
            }
            if (flag)
                System.out.print(i+" ");
            flag=true;
        }
    }
}