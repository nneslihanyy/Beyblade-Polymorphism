public class Dragon extends Beyblade{
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String baybladeci, int donus_hizi, int saldiri_gucu, String kutsalCanavar, String gizliYetenek) {
        super(baybladeci, donus_hizi, saldiri_gucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı:"+kutsalCanavar);
        System.out.println("Gizli yetenek :"+gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {

        System.out.println(getBaybladeci()+" "+kutsalCanavar+"ı ortaya çıkarıyor");
        System.out.println(getBaybladeci()+"ın Saldırısı: Hayalet Kasırgası");
    }
}
