package entitiy;

public class Studio {
    String id_Studio;
    String no_studio;
    String kapasitasKursi;

    public Studio(String id_Studio, String no_studio, String kapasitasKursi) {
        this.id_Studio = id_Studio;
        this.no_studio = no_studio;
        this.kapasitasKursi = kapasitasKursi;
    }
    public String getId_Studio() {
        return id_Studio;
    }

    public void setId_Studio(String id_Studio) {
        this.id_Studio = id_Studio;
    }

    public String getNo_studio() {
        return no_studio;
    }

    public void setNo_studio(String no_studio) {
        this.no_studio = no_studio;
    }

    public String getKapasitasKursi() {
        return kapasitasKursi;
    }

    public void setKapasitasKursi(String kapasitasKursi) {
        this.kapasitasKursi = kapasitasKursi;

    }
}
