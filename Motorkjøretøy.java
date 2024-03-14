abstract class Motorkjøretøy{
    String registreringsnummer;
    String fabrikkmerke;
    String eierensnavn;
    
    Motorkjøretøy(String registreringsnummer, String fabrikkmerke, String eierensnavn){
        this.registreringsnummer = registreringsnummer;
        this.fabrikkmerke = fabrikkmerke;
        this.eierensnavn = eierensnavn;
    }
     void skriveutdata(){
        System.out.println("Eier: " + eierensnavn + "eier bussen med registeringsnummer: " + registreringsnummer +
        "og fabrikkmerke" + fabrikkmerke);

     }
     String hentregnummer(){
        return registreringsnummer;
     }
     String hentfabrikkmerke(){
        return fabrikkmerke;
     }
     String henteierensnavn(){
        return eierensnavn;
     }
    
}