import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
       // polymorphism with java
        Scanner scanner=new Scanner(System.in);
        System.out.println("Beyblade programına hoşgeldiniz");
        System.out.println("Çıkış için q'ya basınız");
        while (true){
            System.out.println("Hangi beyblade üretilsin?");
            String islem= scanner.nextLine();
            if(islem.equals("Q")){
                System.out.println("Programdan çıkılıyor");
                break;
            }
            else {
                BeybladeFabrikasi fabrika=new BeybladeFabrikasi();
                Beyblade beyblade=fabrika.beybladeUret(islem);
                if(beyblade==null){
                    System.out.println("Lütfen geçerli bir beyblade ismi girin");
                }
                else{
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }
    }
}