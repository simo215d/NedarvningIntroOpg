public class Leder extends MoodleUser {


    void fyrLærer(Larer larer){
        larer.setUnderviser(false);
    }

    void loenBonus(Larer lære){
        int current = lære.getLoen();
        lære.setLoen(current+=1000);
    }
}
