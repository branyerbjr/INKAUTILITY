package Models.Software;

import java.sql.Blob;

public class Categoria {
    private int idCategoria;
    private String NomCategoria;
    private Blob imgC;

    public Categoria() {
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomCategoria() {
        return NomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        NomCategoria = nomCategoria;
    }

    public Blob getImgC() {
        return imgC;
    }

    public void setImgC(Blob imgC) {
        this.imgC = imgC;
    }
}
