class Ternary{
    public static void main (String args[]){
        int a=10,b=4,c=3,max;
        max=(a>b) ? (a>c ? a : c) : (b>c ? b : c);
        System.out.print(max); 
    }
}