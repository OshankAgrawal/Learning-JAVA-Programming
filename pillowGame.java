import java.util.Scanner;

class pillowGame{
    public static void main(String args[]){
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the number of People.....");
            int p=obj.nextInt();
            System.out.print("Enter the time...");
            int time=obj.nextInt();
            int t=time;
            double count=0.0;
            while (p<=t){
                t=t-(p-1);
                count++;
            }
            if (p==t){
                if (count%2.0 == 0){
                    System.out.println("After "+ time + " seconds, the pillow is given to 2nd person.");
                }else{
                    System.out.println("After "+ time + " seconds, the pillow is given to "+(p-1)+" person.");
                }
            }else{
                if(count%2.0 == 0){
                    System.out.println("After "+ time + " seconds, the pillow is given to "+(t+1)+" person.");
                }
                else{
                    System.out.println("After "+ time + " seconds, the pillow is given to "+(p-t)+" person.");
                }
            }   
        }
    }
}