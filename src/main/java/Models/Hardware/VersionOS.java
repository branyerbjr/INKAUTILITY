package Models.Hardware;

public class VersionOS {
    private int idVesionOS;
    private String NomVersion;
    private int Id_OS;

    public VersionOS() {
    }

    public VersionOS(String nomVersion, int id_OS) {
        NomVersion = nomVersion;
        Id_OS = id_OS;
    }

    public int getIdVesionOS() {
        return idVesionOS;
    }

    public void setIdVesionOS(int idVesionOS) {
        this.idVesionOS = idVesionOS;
    }

    public String getNomVersion() {
        return NomVersion;
    }

    public void setNomVersion(String nomVersion) {
        NomVersion = nomVersion;
    }

    public int getId_OS() {
        return Id_OS;
    }

    public void setId_OS(int id_OS) {
        Id_OS = id_OS;
    }
}
