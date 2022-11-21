package atributes;

import shorties.Baby;
import shorties.BabyBoy;

public class ChangeClothes {
    public void changeClothes(Clothes clothes, Baby b) {

        if (b instanceof BabyBoy) {
            switch (clothes) {
                case DRESS -> System.out.println(b.getName() + " носит только штаны или брюки");
                case PANTS -> {
                    b.setClothes(clothes);
                    System.out.println(b.getName() + " надел коротенькие штанишки на помочах");
                }
                case TROUSERS -> {
                    b.setClothes(clothes);
                    System.out.println(b.getName() + " надел брюки навыпуск");
                }
            }
        }else{
            switch (clothes) {
                case DRESS -> {
                    System.out.println(b.getName() + " надела пестрое платьице");
                    b.setClothes(clothes);
                }
                case PANTS, TROUSERS -> System.out.println(b.getName() + " носит только пестрые платьица");
            }
        }
    }
}

