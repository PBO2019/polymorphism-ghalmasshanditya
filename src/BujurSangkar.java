public class BujurSangkar {
    public int sisi = 4;
    public int keliling;

    public static void main (String[] ghalmas){
        BujurSangkar bujursangkar = new BujurSangkar();
        bujursangkar.hitungkeliling();
    }

    public void hitungkeliling(){
        keliling = 4*sisi;

        System.out.println("Sisi BujurSangkar = "+sisi+" Cm");
        System.out.println ("Keliling Bujur Sangkar dengan sisi "+sisi+"Cm Adalah = "+keliling);
    }
}
