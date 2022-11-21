package shorties;

import atributes.Clothes;
import atributes.Haircut;
import java.util.Objects;

public class BabyGirl extends Baby {
    final Clothes clothes = Clothes.DRESS;
    public BabyGirl(String name, int age, Haircut haircut) {
        super(name, age);
        this.setHaircut(haircut);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BabyGirl babyGirl)) return false;
        return Objects.equals(getName(), babyGirl.getName());
    }

    @Override
    public String toString() {
        return "Малышка '" + this.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }
}
