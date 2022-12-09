package Models.Software;

public class VersionSoftware {
    private int idVersionSoft;
    private String Version;
    private String W,L,M;
    private String year;
    private int ID_Software;

    public VersionSoftware() {
    }

    public int getIdVersionSoft() {
        return idVersionSoft;
    }

    public void setIdVersionSoft(int idVersionSoft) {
        this.idVersionSoft = idVersionSoft;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getW() {
        return W;
    }

    public void setW(String w) {
        W = w;
    }

    public String getL() {
        return L;
    }

    public void setL(String l) {
        L = l;
    }

    public String getM() {
        return M;
    }

    public void setM(String m) {
        M = m;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getID_Software() {
        return ID_Software;
    }

    public void setID_Software(int ID_Software) {
        this.ID_Software = ID_Software;
    }
}
