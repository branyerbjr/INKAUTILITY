package Models.Software;

import java.sql.Blob;

public class Software {
    private int idSotfware;
    private String NomSoft;
    private String Descrip;
    private Blob imgS;
    private String ID_Empresa;
    private int ID_categoria;

    public Software() {
    }

    public int getIdSotfware() {
        return idSotfware;
    }

    public void setIdSotfware(int idSotfware) {
        this.idSotfware = idSotfware;
    }

    public String getNomSoft() {
        return NomSoft;
    }

    public void setNomSoft(String nomSoft) {
        NomSoft = nomSoft;
    }

    public String getDescrip() {
        return Descrip;
    }

    public void setDescrip(String descrip) {
        Descrip = descrip;
    }

    public Blob getImgS() {
        return imgS;
    }

    public void setImgS(Blob imgS) {
        this.imgS = imgS;
    }

    public String getID_Empresa() {
        return ID_Empresa;
    }

    public void setID_Empresa(String ID_Empresa) {
        this.ID_Empresa = ID_Empresa;
    }

    public int getID_categoria() {
        return ID_categoria;
    }

    public void setID_categoria(int ID_categoria) {
        this.ID_categoria = ID_categoria;
    }
}
