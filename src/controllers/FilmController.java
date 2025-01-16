package controllers;

import entitys.FilmEntity;
import models.FilmModel;

import java.util.ArrayList;

public class FilmController {

    public FilmEntity getIdByFilm(String idFilm){
        return FilmModel.getFilmById(idFilm);
    }
    public int getIndexFilm(String idFilm){
        return FilmModel.getIndexFilm(idFilm);
    }
    public static boolean addFilm(FilmEntity film) {
        return FilmModel.addFilm(film);
    }
    public ArrayList<FilmEntity> getListFilm(){
        return FilmModel.getListFilm();
    }
    public int editNamaFilm(String idFilm, String namaFilm){
        int status = FilmModel.editNamaFilm(idFilm, namaFilm);
        return status;
    }
    public int editDurasiFilm(String idFilm, String durasi){
        int status = FilmModel.editDurasiFilm(idFilm, durasi);
        return status;
    }
    public int editWaktuTayangFilm(String idFilm, String waktuTayang){
        int status = FilmModel.editWaktuTayangFilm(idFilm, waktuTayang);
        return status;
    }
    public int editRatingUsiaFilm(String idFilm, String ratingUsia){
        int status = FilmModel.editRatingUsiaFilm(idFilm, ratingUsia);
        return status;
    }
    public int editGenreFilm(String idFilm, String genreFilm){
        int status = FilmModel.editGenreFilm(idFilm, genreFilm);
        return status;
    }
    public boolean removeFilm(String idFilm){
        return FilmModel.removeFilm(idFilm);
    }
}