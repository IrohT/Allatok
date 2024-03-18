public abstract class Allatok{
    private int labakSzama;


    public int getLabakSzama() {
        return labakSzama;
    }

    public void setLabakSzama(int labakSzama) {
        this.labakSzama = labakSzama;
    }

    public Allatok(int labakszama) {
        this.labakSzama = labakszama;
    }


    public abstract void hangotAd();
}

