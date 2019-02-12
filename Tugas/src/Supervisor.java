public class Supervisor extends Pegawai{
    private int biaya;
    private int gaji;

    public Supervisor(){
        this.TarifGajiPegawai();
    }
    public void biayaGaji(int biaya){
        //biaya = tarif * 30;
        System.out.println("Gaji seorang supervisor sebesar : ");
        this.biaya = biaya;
    }
    public int getGaji(){
        return biaya;
    }
}
