package seminar6;

public class AutobuzBilder implements Builder{

    private Autobuz autobuz;

    public AutobuzBilder() {
        autobuz=new Autobuz();

    }

    @Override
    public Autobuz build() {
        return autobuz;
    }



    public AutobuzBilder setNumeSofer(String numeSofer) {
        autobuz.setNumeSofer(numeSofer);
        return this;

    }

    public AutobuzBilder setModel(String model) {
        autobuz.setModel(model);
        return this;
    }

    public AutobuzBilder setNrInmatriculare(String nrInmatriculare) {
        autobuz.setNrInmatriculare(nrInmatriculare);
        return this;

    }

    public AutobuzBilder setStop(Boolean stop) {
autobuz.setStop(stop);        return this;

    }

    public AutobuzBilder setOpenDoors(Boolean openDoors) {
autobuz.setOpenDoors(openDoors);        return this;

    }

    public AutobuzBilder setText(String text) {
autobuz.setText(text);
        return this;

    }

    public AutobuzBilder setNrlinii(int nrlinii) {
autobuz.setNrlinii(nrlinii);        return this;

    }

    public AutobuzBilder setNew(Boolean aNew) {
        autobuz.setNew(aNew);
        return this;

    }

}
