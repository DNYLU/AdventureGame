public class Food extends Item{

    public Food(String name, int healthPoints) {
        super(name);
        this.setHealthPoints(healthPoints);
    }

    @Override
    public int getHealthPoints() {
        return super.getHealthPoints();
    }

    public String toString() {
        return this.getName();
    }
}
