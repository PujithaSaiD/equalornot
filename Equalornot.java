import java.util.*;
public class Equalornot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        int s=0;
        for(int k=0;k<n;k++){
            s=s+l.get(k);
        }
        System.out.println(s);
        if(s%2==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
    
}
