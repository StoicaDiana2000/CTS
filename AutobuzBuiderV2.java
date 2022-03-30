package seminar6;

public class AutobuzBuiderV2 implements Builder{

    private String numeSofer;
    private String model;
    private String nrInmatriculare;
    private Boolean stop;
    private Boolean openDoors;
    private String text;
    private int nrlinii;
    private Boolean isNew;


    public AutobuzBuiderV2(){
        model="Mercedes";
        numeSofer="Dorel";
        nrInmatriculare="B55STb";
        openDoors=true;
        stop=true;
        text="Stb";
        nrlinii=555;
        isNew=false;
    }
    @Override
    public Autobuz build() {
        return new Autobuz(numeSofer,model,nrInmatriculare,stop,openDoors,text,nrlinii,isNew);

    }

    public AutobuzBuiderV2 setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;

    }

    public AutobuzBuiderV2 setModel(String model) {
        this.model = model;
        return this;

    }

    public AutobuzBuiderV2 setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
        return this;

    }

    public AutobuzBuiderV2 setStop(Boolean stop) {
        this.stop = stop;
        return this;

    }

    public AutobuzBuiderV2 setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
        return this;

    }

    public AutobuzBuiderV2 setText(String text) {
        this.text = text;
        return this;

    }

    public AutobuzBuiderV2 setNrlinii(int nrlinii) {
        this.nrlinii = nrlinii;
        return this;

    }

    public AutobuzBuiderV2 setNew(Boolean aNew) {
        isNew = aNew;
        return this;
    }
}
