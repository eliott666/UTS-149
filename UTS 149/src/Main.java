public class Main {
    public static void main(String[] args) throws Exception {

        Tendik karyawan1 = new Tendik(111,"Kay", "Yogyakarta", "26 Juni 2000", "Laki-Laki", 2000);
        karyawan1.display();
        karyawan1.waktuLembur(20);
        karyawan1.setUangLembur(0);
        karyawan1.displaygaji();

        System.out.println();
        System.out.println();
        System.out.println();

        Dosen dosen1 = new Dosen(222, "Tama", "Klaten", "10 April 2001", "Laki-Laki", 2000);
        dosen1.setNoInduk(987123);
        dosen1.setJurusan("Teknik Industri");
        dosen1.display();
        dosen1.displayDosen_Jurusan();
        dosen1.waktuLembur(6);
        dosen1.displaygaji();

    }
}