package detailPelajar;
public class Mahasiswa{
    private String nim;
    private String nama;
    private String kelamin;
    private String jurusan;
    private int umur;

    public Mahasiswa(String nim, String nama, String kelamin, String jurusan, int umur){
        this.nim = nim;
        this.nama = nama;
        this.kelamin = kelamin;
        this.jurusan = jurusan;
        this.umur = umur;
    }

    public String getNim(){
        return nim;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getKelamin(){
        return kelamin;
    }

    public void setKelamin(String kelamin){
        this.kelamin = kelamin;
    }

    public String getJurusan(){
        return jurusan;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public int getUmur(){
        return umur;
    }

    public void setUmur(int umur){
        this.umur = umur;
    }

    public void printData(){
        System.out.println(nim + " " + nama + " " + " " + kelamin + " " + jurusan + " " + umur);
    }
}