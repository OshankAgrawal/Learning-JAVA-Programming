import java.util.Scanner;
import java.lang.Math;
public class bitManipulation {
    public static int getBit(int orgNum,int pos){
        int num=orgNum,result;
        int bitMask=1<<pos;
        if((bitMask & num)==0){
            result=0;
            return result;
        } else{
            result=1;
            return result;
        }
    }
    public static int setBit(int orgNum,int pos){
        int num=orgNum;
        int bitMask=1<<pos;
        int newNumber=num | bitMask;
        return newNumber;
    }
    public static int clearBit(int orgNum,int pos){
        int num=orgNum;
        int bitMask=1<<pos;
        int notBitMask=~(bitMask);
        int newNumber=notBitMask & num;
        return newNumber;
    }
    public static int updateBit(int orgNum,int pos,int bit){
        if(bit==1){
            return setBit(orgNum, pos);
        } else{
            return clearBit(orgNum, pos);
        }
    }
    public static int decimaltoBinary(int orgNum){
        int rem,i=1,num=orgNum,binaryNumber=0;
        int array[]={0,0,0,0,0,0,0,0,0,0};
        while(num!=0){
            rem=num%2;
            num=num/2;
            array[10-i]=rem;
            i++;
        }
        for(int j=10;j>0;j--){
            binaryNumber=binaryNumber+(int)Math.pow(10, 10-j)*array[j-1];
        }
        return binaryNumber;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter any one number without decimal point...");
        int orgNum=obj.nextInt();
        System.out.print("Binary conversion of "+orgNum+" is.. "+decimaltoBinary(orgNum));
        int choice,choice1,newNumber,choice2,bit;
        do{
            System.out.print("\nEnter the choice number according to which operation do you want to perform...\n1. For Get bit operation.\n2. For Set bit operation.\n3. For Clear bit operation.\n4. For Update bit Operation.\n5. For quit.\nYour choice is...");
            choice=obj.nextInt();
            switch(choice){
                case 1:{
                    System.out.print("Enter the position of the bit which you want to get.. ");
                    int pos=obj.nextInt();
                    if(pos<0){
                        System.out.println("Invalid position..");
                        break;
                    }
                    if(getBit(orgNum,pos)==0){
                        System.out.println("Bit is Zero.");
                    } else{
                        System.out.println("Bit is one.");
                    }
                    break;
                }
                case 2:{
                    System.out.print("Enter the position of the bit which you want to set to 1.. ");
                    int pos=obj.nextInt();
                    if(pos<0){
                        System.out.println("Invalid position..");
                        break;
                    }
                    newNumber=setBit(orgNum,pos);
                    System.out.println("Check your bit is successfully set to 1.");
                    System.out.println(decimaltoBinary(newNumber));
                    System.out.print("Do you want to update the the Original number with the answer...\nEnter 0 for NO.\nEnter 1 for YES.  ");
                    choice2=obj.nextInt();
                    if(choice2==1){
                        orgNum=newNumber;
                        System.out.println("Your original number is successfully changed with the answer.");
                    } else{
                        System.out.println("Your original number is not changed.");
                    }
                    break;
                }
                case 3:{
                    System.out.print("Enter the position of the bit which you want to clear or make 0 ... ");
                    int pos=obj.nextInt();
                    if(pos<0){
                        System.out.println("Invalid position..");
                        break;
                    }
                    newNumber=clearBit(orgNum,pos);
                    System.out.println("Check your bit is successfully clear or set to 0.");
                    System.out.println(decimaltoBinary(newNumber));
                    System.out.print("Do you want to update the the Original number with the answer...\nEnter 0 for NO.\nEnter 1 for YES.  ");
                    choice2=obj.nextInt();
                    if(choice2==1){
                        orgNum=newNumber;
                        System.out.println("Your original number is successfully changed with the answer.");
                    } else{
                        System.out.println("Your original number is not changed.");
                    }
                    break;
                }
                case 4:{
                    System.out.print("Enter the position of the bit which you want to update... ");
                    int pos=obj.nextInt();
                    if(pos<0){
                        System.out.println("Invalid position..");
                        break;
                    }
                    System.out.print("Now enter the 1 for update the bit to 1\nEnter the 0 for update the bit to 0   ");
                    bit=obj.nextInt();
                    newNumber=updateBit(orgNum,pos,bit);
                    System.out.println("Check your bit is successfully update.");
                    System.out.println(decimaltoBinary(newNumber));
                    System.out.print("Do you want to update the the Original number with the answer...\nEnter 0 for NO.\nEnter 1 for YES.  ");
                    choice2=obj.nextInt();
                    if(choice2==1){
                        orgNum=newNumber;
                        System.out.println("Your original number is successfully changed with the answer.");
                    } else{
                        System.out.println("Your original number is not changed.");
                    }
                    break;
                }
                case 5:{
                    System.out.println("ThankYou :)");
                    System.exit(0);
                }
                default:{
                    System.out.println("Invalid choice..");
                }
            }
            System.out.print("Do you want to continue or quit the program...\nChoose 0 For quit.\nChoose 1 For Continue.");
            choice1=obj.nextInt();
        }while(choice1==1);
        System.out.println("ThankYou :)");
        obj.close();
    }
}
