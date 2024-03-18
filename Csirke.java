public class Csirke extends SzarazfoldiAllat implements NovenyevoAllat{


    public Csirke() {
        super(2);
    }

    @Override
    public void hangotAd() {
        System.out.println("Kot kot");
    }

    @Override
    public void eszik() {
        System.out.println(("ham nyam"));
    }
}
