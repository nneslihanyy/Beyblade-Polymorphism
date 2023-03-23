public class Drayga extends Beyblade{
    private String kutsalCanavar;

    public Drayga(String baybladeci, int donus_hizi, int saldiri_gucu, String kutsalCanavar) {
        super(baybladeci, donus_hizi, saldiri_gucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı:"+kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBaybladeci()+" "+kutsalCanavar+"ı ortaya çıkarıyor");
        System.out.println(getBaybladeci()+"ın saldırısı: Kaplan Pençesi");
    }
}
