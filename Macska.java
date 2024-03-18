public class Macska extends SzarazfoldiAllat implements RagadozoAllat{
    public Macska(int labakszama) {
        super(labakszama);
    }

    @Override
    public void hangotAd() {
        System.out.println("NyauNYau Niga");
    }

    public Macska(){
        super(4);
    }

    @Override
    public void eszik(Allatok allat) {
        if(allat != this){
            System.out.println("NyamNYam" + allat );
        }
        else{
            System.out.println("No NYAm Nyam");
        }

    }
}

