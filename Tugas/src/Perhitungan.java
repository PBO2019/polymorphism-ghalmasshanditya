public class Perhitungan {
    public static void main (String ghalmas[]){
        int Gaji = 30;
        Staff staff = new Staff();
        staff.biayaGaji(5000000);
        System.out.println("Rp. "+staff.getGaji()*Gaji);

        Supervisor supervisor = new Supervisor();
        supervisor.biayaGaji(10000000);
        System.out.println("Rp. "+supervisor.getGaji()*Gaji);
    }
}
