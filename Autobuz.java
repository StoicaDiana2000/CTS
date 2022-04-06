package seminar6;

public class Autobuz {
    private String numeSofer;
    private String model
            ;
    private String nrInmatriculare;
    private Boolean stop;
    private Boolean openDoors;
    private String text;
    private int nrlinii;
    private Boolean isNew;

    public Autobuz(String numeSofer, String model, String nrInmatriculare, Boolean stop, Boolean openDoors, String text, int nrlinii, Boolean isNew) {
        this.numeSofer = numeSofer;
        this.model = model;
        this.nrInmatriculare = nrInmatriculare;
        this.stop = stop;
        this.openDoors = openDoors;
        this.text = text;
        this.nrlinii = nrlinii;
        this.isNew = isNew;
    }

    Autobuz() {
        model="Mercedes";
        numeSofer="Dorel";
        nrInmatriculare="B55STb";
        openDoors=true;
        stop=true;
        text="Stb";
        nrlinii=555;
        isNew=false;

    }



     void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

     void setModel(String model) {
        this.model = model;
    }

     void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

     void setStop(Boolean stop) {
        this.stop = stop;
    }

     void setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
    }

     void setText(String text) {
        this.text = text;
    }

     void setNrlinii(int nrlinii) {
        this.nrlinii = nrlinii;
    }

     void setNew(Boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", model='" + model + '\'' +
                ", nrInmatriculare='" + nrInmatriculare + '\'' +
                ", stop=" + stop +
                ", openDoors=" + openDoors +
                ", text='" + text + '\'' +
                ", nrlinii=" + nrlinii +
                ", isNew=" + isNew +
                '}';
    }
}
