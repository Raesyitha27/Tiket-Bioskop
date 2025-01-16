package models;

import entitys.FilmEntity;

import java.util.ArrayList;

public class FilmModel {
    private final static String[] idFilm = {"0001", "0002", "0003", "0004", "0005"};
    private final static String[] namaFilm = {"The Avengers", "Agak Laen", "The Conjuring", "The Wicked", "Titanic"};
    private final static String[] durasiFilm = {"150 Menit", "180 Menit", "150 Menit", "150 Menit", "180 Menit"};
    private final static String[] waktuTayang = {"12.00 - 15.00 - 18.00 - 21.00", "12.00 - 15.00 - 18.00 - 21.00", "12.00 - 15.00 - 18.00 - 21.00", "12.00 - 15.00 - 18.00 - 21.00", "12.00 - 15.00 - 18.00 - 21.00"};
    private final static String[] ratingUsia = {"R 13+", "R 13+", "R 13+", "R 13+", "D 17+"};
    private final static String[] genreFilm = {"Action", "Comedy", "Horror", "Fantasy", "Romance" };

    public static void dataFilmTemplate() {
        for (int i = 0; i <idFilm.length; i++) {
            FilmEntity filmEntity = new FilmEntity(idFilm[i], namaFilm[i], durasiFilm[i], waktuTayang[i], ratingUsia[i], genreFilm[i]);
            filmEntityArrayList.add(filmEntity);
        }
    }
    static ArrayList<FilmEntity> filmEntityArrayList = new ArrayList<>();
    public static int getIndexFilm(String idFilm) {
        int index = -1;
        if (filmEntityArrayList.isEmpty()) {
            System.out.println(" Data Kosong ");
        } else {
            for (FilmEntity filmEntity : filmEntityArrayList) {
                if (filmEntity.getIdFilm().equals(idFilm)) {
                    index = filmEntityArrayList.indexOf(filmEntity);
                }
            }
        }
        return index;
    }
    public static FilmEntity getFilmById(String idFilm){
        FilmEntity film = null;
        for (FilmEntity filmEntity  : filmEntityArrayList) {
            if (filmEntity.getIdFilm().equals(idFilm)){
                film = filmEntity;
            }
        }
        return film;
    }

    public static boolean addFilm(FilmEntity filmEntity){
        boolean status = false;
        if (filmEntity != null){
            filmEntityArrayList.add(filmEntity);
            status = true;
        }
        return status;
    }

    public static ArrayList<FilmEntity> getListFilm()    {
        return filmEntityArrayList;
    }

    public static int editNamaFilm(String idFilm, String namaFilm){
        int index = getIndexFilm(idFilm);
        filmEntityArrayList.get(index).setNamaFilm(namaFilm);
        return index;
    }

    public static int editDurasiFilm(String idFilm, String durasi){
        int index = getIndexFilm(idFilm);
        filmEntityArrayList.get(index).setDurasiFilm(durasi);
        return index;
    }

    public static int editWaktuTayangFilm(String idFilm, String waktuTayang){
        int index = getIndexFilm(idFilm);
        filmEntityArrayList.get(index).setWaktuTayang(waktuTayang);
        return index;
    }

    public static int editRatingUsiaFilm(String idFilm, String ratingUsia){
        int index = getIndexFilm(idFilm);
        filmEntityArrayList.get(index).setRatingUsia(ratingUsia);
        return index;
    }
    public static int editGenreFilm(String idFilm, String genreFilm){
        int index = getIndexFilm(idFilm);
        filmEntityArrayList.get(index).setGenreFilm(genreFilm);
        return index;
    }
    public static boolean removeFilm(String idFilm){
        int index = getIndexFilm(idFilm);
        boolean status = false;
        if (index != -1){
            filmEntityArrayList.remove(index);
            status = true;
        }
        return status;
    }
}