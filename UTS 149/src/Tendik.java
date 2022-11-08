public class Tendik extends Karyawan{

    public int waktu;

    public Tendik(int nip, String namaBaru, String alamatBaru, String lahirBaru, String JKbaru, int tahunMasuk){
        this.nomorPegawai = nip;
        this.nama = namaBaru;
        this.alamat = alamatBaru;
        this.lahir = lahirBaru;
        this.jenisKelamin = JKbaru;
        this.tahunMasuk = tahunMasuk;
    }


    void display(){
        System.out.println("Nomor Pegawai : " + this.nomorPegawai);
        System.out.println("Nama Pegawai : "+ this.nama);
        System.out.println("Alamat Pegawai : "+ this.alamat);
        System.out.println("Tanggal Lahir : "+ this.lahir);
        System.out.println("Jenis Kelamin : "+ this.jenisKelamin);
        System.out.println("Tahun Masuk Pegawai : "+ this.tahunMasuk);
        System.out.println("Gaji Pokok : " + this.gaji);
    }

    void displaygaji(){
        System.out.println("Lama Lembur : "+ this.tampilinWaktuLembur() + " Jam");
        System.out.println("Total Gaji + Uang Lembur : "+ this.getLembur());
    }
}