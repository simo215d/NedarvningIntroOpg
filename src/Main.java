public class Main {
    public static void main(String[] args) {
        Lærer andrac = new Lærer();
        Lærer carsten = new Lærer();
        Leder line = new Leder();
        andrac.setNavn("Andrac");
        andrac.setUnderviser(true);
        andrac.setTilhørendeKlasse("Datamatiker");
        andrac.setLoen(100000.0);
        andrac.setLokale(8);
        carsten.setNavn("Carsten");
        carsten.setUnderviser(false);
        carsten.setTilhørendeKlasse("Datamatiker");
        carsten.setLoen(100.0);
        carsten.setLokale(8);
        line.setLoen(420.0);
        line.setNavn("Line");
        line.setLokale(123);
        System.out.println();
        System.out.println("Lærere på Zealand: "+andrac.getNavn()+"(Løn:"+andrac.getLoen()+") og "+carsten.getNavn()+"(Løn:"+carsten.getLoen()+")");
        System.out.println("Andrac underviser: "+andrac.getUnderviser()+". Underviser Carsten? "+carsten.getUnderviser()+".");
        System.out.println("Deres leder er: "+line.getNavn());
        System.out.println("Andrac kom for sent");
        line.fyrLærer(andrac);
        System.out.println("Underviser Andrac stadig? "+andrac.getUnderviser());
    }
}
