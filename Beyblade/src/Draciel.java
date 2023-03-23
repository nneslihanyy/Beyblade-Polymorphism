public class Draciel extends Beyblade{
    private String kutsalCanavar;

    public Draciel(String baybladeci, int donus_hizi, int saldiri_gucu, String kutsalCanavar) {
        super(baybladeci, donus_hizi, saldiri_gucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBaybladeci()+" "+kutsalCanavar+"ı ortaya çıkarıyor");
        System.out.println(getBaybladeci()+"ın savunması: Kale Savunması");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı:"+kutsalCanavar);
    }
}
