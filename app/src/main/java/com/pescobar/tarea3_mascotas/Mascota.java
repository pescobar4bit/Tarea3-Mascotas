package com.pescobar.tarea3_mascotas;

/**
 * Created by PabloCesar on 08/02/2017.
 */

public class Mascota {

    private String nombreMascota;
    private int fotoMascota;
    private int LikesMascota;

    public Mascota(String nombreMascota, int fotoMascota, int likesMascota) {
        this.nombreMascota = nombreMascota;
        this.fotoMascota = fotoMascota;
        this.LikesMascota = likesMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public int getFotoMascota() {
        return fotoMascota;
    }

    public int getLikesMascota() {
        return LikesMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public void setFotoMascota(int fotoMascota) {
        this.fotoMascota = fotoMascota;
    }

    public void setLikesMascota(int likesMascota) {
        LikesMascota = likesMascota;
    }
}
