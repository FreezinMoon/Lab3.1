package shorties;

import atributes.Clothes;
import atributes.Haircut;
import shorties.Baby;

import java.util.Objects;

public class BabyBoy extends Baby {
    final Haircut haircut = Haircut.SHORT;

    public BabyBoy(String name, int age, Clothes clothes, double friendliness) {
        super(name, age);
        this.setClothes(clothes);
        this.setFriendliness(friendliness);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BabyBoy babyBoy)) return false;
        return Objects.equals(getName(), babyBoy.getName());
    }

    @Override
    public String toString() {
        return "Малыш '" + this.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }
}
