import atributes.ChangeHaircut;
import atributes.Haircut;
import shorties.BabyBoy;
import shorties.BabyGirl;
import talking.Communicate;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
public class MagicCity {
    ArrayList<BabyBoy> arrayBoy = new ArrayList<>();

    ArrayList<BabyGirl> arrayGirl = new ArrayList<>();

    public void addBoy(BabyBoy boy){
        arrayBoy.add(boy);
    }

    public void addGirl(BabyGirl girl){
        arrayGirl.add(girl);
    }

    public void start(String[] badWords){

        Random random = new Random();
        for (BabyBoy babyBoy : arrayBoy) {
            System.out.println("В годоре появился " + babyBoy.getName() + ", ему " + babyBoy.age + " лет.");

            System.out.println(babyBoy.getClothes());

            System.out.println(babyBoy.getHaircut());
            System.out.println();
        }
        for (BabyGirl babyGirl : arrayGirl) {
            System.out.println("В годоре появилась " + babyGirl.getName() + ", ей " + babyGirl.age + " лет.");

            System.out.println(babyGirl.getClothes());

            System.out.println(babyGirl.getHaircut());

            System.out.println();
        }

        ChangeHaircut changeHaircut = new ChangeHaircut();
        changeHaircut.change(Haircut.TAIL, arrayGirl.get(random.nextInt(arrayGirl.size())));
        changeHaircut.change(Haircut.RIBBON, arrayGirl.get(random.nextInt(arrayGirl.size())));
        changeHaircut.change(Haircut.BOW, arrayGirl.get(random.nextInt(arrayGirl.size())));
        changeHaircut.change(Haircut.SHORT, arrayGirl.get(random.nextInt(arrayGirl.size())));
        System.out.println();

        Communicate com = new Communicate();
        BabyBoy randBoy = arrayBoy.get(random.nextInt(arrayBoy.size()));
        BabyGirl randGirl = arrayGirl.get(random.nextInt(arrayGirl.size()));
        com.communicate(randBoy, randGirl, badWords);
    }

    @Override
    public String toString() {
        return "Вольшебный город{" +
                "малыши=" + arrayBoy +
                ", малышки=" + arrayGirl +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MagicCity magicCity)) return false;
        return arrayBoy.equals(magicCity.arrayBoy) && arrayGirl.equals(magicCity.arrayGirl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrayBoy, arrayGirl);
    }
}
