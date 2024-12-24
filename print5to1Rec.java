public class print5to1Rec {
    // Recursion Question
    public static void main(String[] args) {
        int num=5;
        printnum(num);
    }
    static void printnum(int num){
        System.out.println(num);
        if(num==1){
            return;
        }else{
            printnum(num-1);
        }
    }
}
