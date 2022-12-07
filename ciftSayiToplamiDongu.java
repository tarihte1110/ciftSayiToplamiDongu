import java.util.Scanner;
public class ciftSayiToplamiDongu {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int x;
        int total=0;
        do{
        System.out.print("Bir sayı giriniz:");
        x= input.nextInt();
        if(x%4==0){
            total+=x;
          }
        }
        while(x%2==0);

        System.out.print("Toplam:"+total);

    }
}
