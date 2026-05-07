import java.util.*;
class Count{
    public static void main(String args[]){
        int count=0;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:237654");
        int a=sc.nextInt();
        if(a==0){
            count=1;
        }
        else{
            while(a!=0){
                a=a/10;
                count++;
            }
        }
        System.out.println("count digits:"+count);

    }
}