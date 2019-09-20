public class Lærer extends MoodleUser {
    String tilhørendeKlasse;
    boolean underviser = false;

    void undervisKlasse(){
        setUnderviser(true);
    }

    public boolean getUnderviser() {
        return underviser;
    }

    public void setUnderviser(boolean underviser) {
        this.underviser = underviser;
    }

    public String getTilhørendeKlasse() {
        return tilhørendeKlasse;
    }
    public void setTilhørendeKlasse(String tilhørendeKlasse) {
        this.tilhørendeKlasse = tilhørendeKlasse;
    }
}
