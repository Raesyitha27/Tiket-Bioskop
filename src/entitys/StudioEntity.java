package entitys;

public class StudioEntity {

    private String idPelanggan;
    private int jumlahTiket;
    private String nomorStudio;
    private String nomorKursi;
    private String nomorBaris;


    public StudioEntity(String idPelanggan, int jumlahTiket, String nomorStudio, String nomorKursi, String nomorBaris) {
        this.idPelanggan = idPelanggan;
        this.jumlahTiket = jumlahTiket;
        this.nomorStudio = nomorStudio;
        this.nomorKursi = nomorKursi;
        this.nomorBaris = nomorBaris;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }

    public String getNomorStudio() {
        return nomorStudio;
    }

    public void setNomorStudio(String nomorStudio) {
        this.nomorStudio = nomorStudio;
    }

    public String getNomorKursi() {
        return nomorKursi;
    }

    public void setNomorKursi(String nomorKursi) {
        this.nomorKursi = nomorKursi;
    }

    public String getNomorBaris() {
        return nomorBaris;
    }

    public void setNomorBaris(String nomorBaris) {
        this.nomorBaris = nomorBaris;
    }
}