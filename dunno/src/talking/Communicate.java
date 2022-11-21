package talking;

import shorties.BabyBoy;
import shorties.BabyGirl;
import talking.AbuseBoy;
import talking.AbuseGirl;

import java.util.Random;
public class Communicate{

    public void communicate(BabyBoy boy, BabyGirl girl, String[] badWords) {
        Random random = new Random();
        AbuseBoy abuseBoy = new AbuseBoy();
        AbuseGirl abuseGirl = new AbuseGirl();

        if (Math.random() > 0.5) {
            System.out.println(girl.getName() + " перешла дорогу, чтобы не встретиться с мальчиком");
        }else{
            abuseGirl.abuse(boy, girl, badWords[random.nextInt(badWords.length)]);
            if (boy.getFriendliness() < 0.5){
                System.out.println(boy.getName() + " толкнул " + girl.getName());
                System.out.println(boy.getName() + " дернул " + girl.getName() + " за " + girl.getHaircut());
            }
            abuseBoy.abuse(girl, boy, badWords[random.nextInt(badWords.length)]);
        }
    }
}
