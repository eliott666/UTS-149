public class Dosen extends Karyawan{
    private String jurusan;
    private int nidn;
    private int uangLembur = 100000;
    public Dosen(int nip, String namaBaru, String alamatBaru, String lahirBaru, String JKbaru, int tahunMasuk){
        this.nomorPegawai = nip;
        this.nama = namaBaru;
        this.alamat = alamatBaru;
        this.lahir = lahirBaru;
        this.jenisKelamin = JKbaru;
        this.tahunMasuk = tahunMasuk;
    }

    public void setJurusan(String jurusanBaru){
        this.jurusan = jurusanBaru;
    }
    public String getJurusan(){
        return this.jurusan;
    }

    public void setNoInduk(int noInduk){
        this.nidn = noInduk;
    }

    public int getNoInduk(){
        return this.nidn;
    }
    void displayDosen_Jurusan(){
        System.out.println("No. Induk Dosen : " + this.nidn );
        System.out.println("Jurusan Dosen : " + this.jurusan );
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
    @Override
    public  int getUangLembur(){
        return this.uangLembur;
    }
    @Override
    public int getLembur(){
        return (this.uangLembur * this.waktu) + this.gaji;
    }

    void displaygaji(){
        System.out.println("Total Gaji : " + this.getLembur());
    }

}