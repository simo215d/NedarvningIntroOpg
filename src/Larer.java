public class Larer extends MoodleUser {
    String tilhørendeKlasse;
    boolean underviser = false;

    public boolean getUnderviser() {
        return underviser;
    }

    public void setUnderviser(boolean underviser) {
        this.underviser = underviser;
    }
}
