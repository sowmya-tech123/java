import java.util.*;
class DSA1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,40,50,60};
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        int flag=0;
        int i;
        for(i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            else if(min<arr[i]){
                min=arr[i];
            }
        }
        for ( i = 0; i < arr.length; i++) {
              System.out.println("array:\n"+arr[i]);  
        }
        for(i=arr.length-1;i>=0;i--){
            System.out.println("array:"+arr[i]);
        }for(i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("enter key:");
        int key=sc.nextInt();
        for(i=0;i<arr.length;i++){
            if(key==arr[i]){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("key found");
        }else{
            System.out.println("key not found");
        }
        System.out.println("max:"+max);
        System.out.println("min:"+min);
        System.out.println("sum:"+sum);
        
        

    }
}