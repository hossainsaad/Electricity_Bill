import java.util.Scanner;

 class Electricitybill01 {
    public static void main(String[] args) {
        int charges=0,units;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the bill units: ");
        units = input.nextInt();
        if (units<=100)
        {
            charges = units*10;
        } else if (units<=200) {
            charges = (100*10)+(units-100)*15;

        } else if (units<=300) {
            charges = (100*10)+(100*15)+(units-200)*20;

        }
        else if (units>300){
            charges = (100*10)+(100*15)+(100*20)+(units-300)*25;
        }
        System.out.println("Bill amount is :" + charges);
    }
}
