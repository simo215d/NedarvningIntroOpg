public class Leder extends MoodleUser {

    void loenBonus(Larer lære){
        int current = lære.getLoen();
        lære.setLoen(current+=1000);
    }
}
