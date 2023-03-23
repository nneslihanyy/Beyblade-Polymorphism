public class Beyblade
{
    private String baybladeci;
    private int donus_hizi;
    private int saldiri_gucu;

    public Beyblade(String baybladeci, int donus_hizi, int saldiri_gucu) {
        this.baybladeci = baybladeci;
        this.donus_hizi = donus_hizi;
        this.saldiri_gucu = saldiri_gucu;
    }

    public String getBaybladeci() {
        return baybladeci;
    }

    public void setBaybladeci(String baybladeci) {
        this.baybladeci = baybladeci;
    }

    public int getDonus_hizi() {
        return donus_hizi;
    }

    public void setDonus_hizi(int donus_hizi) {
        this.donus_hizi = donus_hizi;
    }

    public int getSaldiri_gucu() {
        return saldiri_gucu;
    }

    public void setSaldiri_gucu(int saldiri_gucu) {
        this.saldiri_gucu = saldiri_gucu;
    }
    public void saldir(){
        System.out.println(getBaybladeci()+" "+ saldiri_gucu+ "ve"+ donus_hizi+" ile saldırıyor");
    }
    public void kutsalCanavarOrtayaCikar(){
        System.out.println("Bu babylade'in kutsal canavarı yok");
    }
    public void bilgileriGoster(){
        System.out.println("Baybladeci ismi:"+baybladeci);
        System.out.println("Saldırı gücü:"+saldiri_gucu);
        System.out.println("Dönüş hızı:"+donus_hizi);
    }

}
