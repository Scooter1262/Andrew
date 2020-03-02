package class1;

public class AnimalFactory {
    static Animal СreateAnimal(AnimalType type) {
        switch (type) {
            case DOG:
                return new DOG();
            case CAT:
                return new CAT();
            case BIRD:
                return new BIRD();
            default:
                throw new IllegalArgumentException();// дефолт
        }
    }
}
