public class Main {
    public static void main(String[] args) {
        Larer andrac = new Larer();
        Larer carsten = new Larer();
        Leder line = new Leder();
        //andrac
        andrac.setNavn("Andrac");
        andrac.setUnderviser(true);
        andrac.setLoen(100);
        //carsten
        carsten.setNavn("Carsten");
        carsten.setUnderviser(false);
        carsten.setLoen(500);
        carsten.setLokale(8);
        //line
        line.setLoen(777);
        line.setNavn("Line");
        line.setLokale(123);
        //historie
        System.out.println();
        System.out.println("Lærere på Zealand: "+andrac.getNavn()+"(Løn:"+andrac.getLoen()+") og "+carsten.getNavn()+"(Løn:"+carsten.getLoen()+")");
        System.out.println("Andrac underviser: "+andrac.getUnderviser()+". Underviser Carsten? "+carsten.getUnderviser()+".");
        System.out.println("Deres leder er: "+line.getNavn());
        System.out.println("Andrac har gjort er godt stykke arbejde og får en lønforhøjelse af "+line.getNavn());
        line.loenBonus(andrac);
        System.out.println("Hvad er "+andrac.getNavn()+"s løn nu: "+andrac.getLoen()+"kr");
    }
}
