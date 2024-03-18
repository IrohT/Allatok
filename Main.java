//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Macska macs = new Macska();

        Allatok csirke = new Csirke();
        ViziAllat redneck = new Tengeri_Robbano();

        Allatok[] allatok = new Allatok[]{macs, csirke, redneck};
        for (Allatok allat : allatok) {
            allat.hangotAd();
            if(allat instanceof RagadozoAllat){
                System.out.println(allat.getClass());
            }
            
        }
    }
}


