public class Varebiler extends Motorkjøretøy{
    int makslastevekt;
    Varebiler(String registreringsnummer, String fabrikkmerke, String eierensnavn, int makslastevekt){
        super(registreringsnummer, fabrikkmerke, eierensnavn);
        this.makslastevekt = makslastevekt;
    }
    @Override
    void skriveutdata(){
        System.out.println("Eier: " + eierensnavn + "eier varebilen med registeringsnummer: " + registreringsnummer +
        "og fabrikkmerke" + fabrikkmerke + ". Varebilen har " + makslastevekt + "maksimalt lastevekt.");

    }
    int årsavgift(){
        return makslastevekt *4;
    }
    
}
