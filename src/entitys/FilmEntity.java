package entitys;

public class FilmEntity {
    String idFilm;
    String namaFilm;
    String durasiFilm;
    String waktuTayang;
    String ratingUsia;
    String genreFilm;

    public FilmEntity(String idFilm, String namaFilm, String durasiFilm, String waktuTayang, String ratingUsia, String genreFilm) {
        this.idFilm = idFilm;
        this.namaFilm = namaFilm;
        this.durasiFilm = durasiFilm;
        this.waktuTayang = waktuTayang;
        this.ratingUsia = ratingUsia;
        this.genreFilm = genreFilm;
    }

    public String getIdFilm() {
        return idFilm;
    }


    public String getNamaFilm() {
        return namaFilm;
    }

    public void setNamaFilm(String namaFilm) {
        this.namaFilm = namaFilm;
    }

    public String getDurasiFilm() {
        return durasiFilm;
    }

    public void setDurasiFilm(String durasiFilm) {
        this.durasiFilm = durasiFilm;
    }

    public String getWaktuTayang() {
        return waktuTayang;
    }

    public void setWaktuTayang(String waktuTayang) {
        this.waktuTayang = waktuTayang;
    }

    public String getRatingUsia() {
        return ratingUsia;
    }

    public void setRatingUsia(String ratingUsia) {
        this.ratingUsia = ratingUsia;
    }

    public String getGenreFilm() {
        return genreFilm;
    }

    public void setGenreFilm(String genreFilm) {
        this.genreFilm = genreFilm;
    }
}