import java.util.*;
class Prime{
    public static void main(String args[]){
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number a:");
        int a=sc.nextInt();
        if(a<=1){
            System.out.println("not prime");
            return;
        }
        for(i=2;i<a;i++){
            if(a%i==0){
                 System.out.println("not prime");
                 return;
            }

        }
        System.out.println("prime");
    

        }

        
    }

