public class print1to5Rec {
    // Recursion Question
    public static void main(String[] args) {
        int num=1;
        printnum(num);
    }
    public static void printnum(int num){
        System.out.println(num);
        if(num==5){
            return;
        }else{
            printnum(num+1);
        }
    }
}
