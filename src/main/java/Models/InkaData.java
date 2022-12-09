package Models;

public class InkaData {
    private int idInka;
    private int idUser;
    private int idArea;
    private int idDispositivo;
    private int idVSoftware;

    public InkaData() {
    }

    public InkaData(int idUser, int idArea, int idDispositivo, int idVSoftware) {
        this.idUser = idUser;
        this.idArea = idArea;
        this.idDispositivo = idDispositivo;
        this.idVSoftware = idVSoftware;
    }

    public int getIdInka() {
        return idInka;
    }

    public void setIdInka(int idInka) {
        this.idInka = idInka;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public int getIdVSoftware() {
        return idVSoftware;
    }

    public void setIdVSoftware(int idVSoftware) {
        this.idVSoftware = idVSoftware;
    }
}
