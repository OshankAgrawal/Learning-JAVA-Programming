import java.util.Scanner;
class Oshank{
    int APgenerator(int num){
        int var = -1;
        for(int i=0; i<=num; i++){
            var = var + 2;
        }
        return var;
    }
    void SeriesGenerator(int num){
        int term = 7;
        System.out.print(term+"\t");
        for(int i=0; i<num-1; i++){
            term = term + APgenerator(i);
            System.out.print(term+"\t");
        }
    }
}
class RandomSeries {
    public static void main(String args[]){
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the number of terms which you want to be print: ");
            int num=obj.nextInt();
            Oshank objOshank=new Oshank();
            objOshank.SeriesGenerator(num);
        }
    }    
}
