import java.util.*;
public class ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int b = sc.nextInt();
        if(x==b){
            System.out.println("equal");
        }
        else{
            if(x>b){
                System.out.println("greater"); 
            }
        else{
            if(x<b){
                System.out.println("less");
            }
        }    
          
        }
    }
}