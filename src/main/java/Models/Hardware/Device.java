package Models.Hardware;

public class Device {
    private int idDevice;
    private int ID_Hardware;
    private int ID_VersionOS;

    public Device() {
    }

    public Device(int ID_Hardware, int ID_VersionOS) {
        this.ID_Hardware = ID_Hardware;
        this.ID_VersionOS = ID_VersionOS;
    }

    public int getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(int idDevice) {
        this.idDevice = idDevice;
    }

    public int getID_Hardware() {
        return ID_Hardware;
    }

    public void setID_Hardware(int ID_Hardware) {
        this.ID_Hardware = ID_Hardware;
    }

    public int getID_VersionOS() {
        return ID_VersionOS;
    }

    public void setID_VersionOS(int ID_VersionOS) {
        this.ID_VersionOS = ID_VersionOS;
    }
}
