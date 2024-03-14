public class Busser extends Motorkjøretøy {
    int antsitteplasser;
    Busser(String registreringsnummer, String fabrikkmerke, String eierensnavn, int antsitteplasser){
        super(registreringsnummer, fabrikkmerke, eierensnavn);
        this.antsitteplasser = antsitteplasser;
    }
    @Override
    void skriveutdata(){
        System.out.println("Eier: " + eierensnavn + "eier bussen med registeringsnummer: " + registreringsnummer +
        "og fabrikkmerke" + fabrikkmerke + ". Bussen har " + antsitteplasser + "sitteplasser.");

    }
    
}
