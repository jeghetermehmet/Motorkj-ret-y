public class Personbiler extends Motorkjøretøy{
    int antsitteplasser;
    Personbiler(String registreringsnummer, String fabrikkmerke, String eierensnavn, int antsitteplasser){
        super(registreringsnummer, fabrikkmerke, eierensnavn);
        this.antsitteplasser = antsitteplasser;
    }
    @Override
    void skriveutdata(){
        System.out.println("Eier: " + eierensnavn + "eier bilen med registeringsnummer: " + registreringsnummer +
        "og fabrikkmerke" + fabrikkmerke + ". Bilen har " + antsitteplasser + "sitteplasser.");

    }
    int årsavgift(){
        return 3000;
    }
    
}
