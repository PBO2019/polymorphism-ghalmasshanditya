public class Lingkaran {
    public final double pi = 3.14;
    public int radius = 10;
    public double Keliling;

    public static void main (String[] ghalmas) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.hitungkeliling();
    }

    public void hitungkeliling(){
        Keliling = 2 * pi * radius;

        System.out.println("Radius Lingkaran = "+radius+" Cm");
        System.out.println ("Keliling Lingkarang dengan radius "+radius+" Cm Adalah = "+Keliling+" Cm");

    }
}
