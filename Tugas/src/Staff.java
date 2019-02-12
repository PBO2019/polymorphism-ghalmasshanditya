public class Staff extends Pegawai{
    private int biaya;
    private int gaji;

    public void biayaGaji(int biaya){
        System.out.println("Gaji seorang Staff sebesar : ");
        this.biaya = biaya;
    }
    public Staff(){
        this.TarifGajiPegawai();
    }

    public int getGaji(){
        return biaya;
    }
}
