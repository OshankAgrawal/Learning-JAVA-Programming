public class OperationsOnFractions {
    public static class Fraction{
        int num;
        int den;
        Fraction(){
            // default Constructor
        }
        Fraction(int num,int den){
            this.num=num;
            this.den=den;
            simplify();
        }
        void simplify(){
            int hcf=GCD(num,den);
            num=num/hcf;
            den=den/hcf;
        }
        int GCD(int num1,int num2){
            int divisor;
            int dividend;
            if(num1>num2){
                dividend=num1;
                divisor=num2;
            }else{
                dividend=num2;
                divisor=num1;
            }int rem=dividend%divisor;
            while(rem!=0){
                dividend=divisor;
                divisor=rem;
                rem=dividend%divisor;
            }
            return divisor;
        }
        
    }
    public static Fraction add(Fraction f1,Fraction f2){
        // Method 1
        // int numerator=(f1.num*f2.den)+(f2.num*f1.den);
        // int denominator=f1.den*f2.den;
        // Fraction f3=new Fraction(numerator,denominator);
        // Method 2
        Fraction f3=new Fraction();
        f3.num=(f1.num*f2.den)+(f2.num*f1.den);
        f3.den=f1.den*f2.den;
        f3.simplify();
        return f3;
    }
    public static Fraction subtract(Fraction f1,Fraction f2){
        // Method 1
        // int numerator=(f1.num*f2.den)-(f2.num*f1.den);
        // int denominator=f1.den*f2.den;
        // Fraction f3=new Fraction(numerator,denominator);
        // Method 2
        Fraction f3=new Fraction();
        f3.num=(f1.num*f2.den)-(f2.num*f1.den);
        f3.den=f1.den*f2.den;
        f3.simplify();
        return f3;
    }
    public static Fraction multiplication(Fraction f1,Fraction f2){
        // Method 1
        // int numerator=f1.num*f2.num;
        // int denominator=f1.den*f2.den;
        // Fraction f3=new Fraction(numerator,denominator);
        // Method 2
        Fraction f3=new Fraction();
        f3.num=f1.num*f2.num;
        f3.den=f1.den*f2.den;
        f3.simplify();
        return f3;
    }
    public static Fraction division(Fraction f1,Fraction f2){
        // Method 1
        // int numerator=(f1.num*f2.den)+(f2.num*f1.den);
        // int denominator=f1.den*f2.den;
        // Fraction f3=new Fraction(numerator,denominator);
        // Method 2
        Fraction f3=new Fraction();
        f3.num=f1.num*f2.den;
        f3.den=f1.den*f2.num;
        f3.simplify();
        return f3;
    }
    public static void add2(Fraction f1,Fraction f2){
        f1.num=(f1.num*f2.den)+(f2.num*f1.den);
        f1.den=f1.den*f2.den;
        f1.simplify();
        System.out.println(f1.num+"/"+f1.den);
    }
    public static void main(String[] args) {
        Fraction f1=new Fraction(35,21);
        System.out.println(f1.num+"/"+f1.den);
        Fraction f2=new Fraction(7,3);
        System.out.println(f2.num+"/"+f2.den);
        Fraction f3=add(f1, f2);
        System.out.println(f3.num+"/"+f3.den);
        Fraction f4=subtract(f1, f2);
        System.out.println(f4.num+"/"+f4.den);
        Fraction f5=multiplication(f1, f2);
        System.out.println(f5.num+"/"+f5.den);
        Fraction f6=division(f1, f2);
        System.out.println(f6.num+"/"+f6.den);
        add2(f1, f2);
    }
}
