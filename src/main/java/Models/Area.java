package Models;

import java.sql.Blob;

public class Area {
    private int idArea;
    private String NomArea;
    private Blob imgA;

    public Area() {
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getNomArea() {
        return NomArea;
    }

    public void setNomArea(String nomArea) {
        NomArea = nomArea;
    }

    public Blob getImgA() {
        return imgA;
    }

    public void setImgA(Blob imgA) {
        this.imgA = imgA;
    }
}
