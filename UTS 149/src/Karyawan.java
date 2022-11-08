public class Karyawan {
    protected String nama;
    protected String alamat;
    protected String lahir;
    protected String jenisKelamin;
    protected int nomorPegawai;
    protected int tahunMasuk;
    protected int gaji = 2000000;
    protected int waktu;
    private int uangLembur;

    public void waktuLembur(int waktulem){
        this.waktu = waktulem;
    }

    public int tampilinWaktuLembur(){
        return this.waktu;
    }
    protected void setUangLembur(int uanglem){
        this.uangLembur = uanglem;
    }
    public  int getUangLembur(){
        return this.uangLembur;
    }
    public int getLembur(){
        return (this.uangLembur * this.waktu) + this.gaji;
    }

}