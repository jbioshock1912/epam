package epam.hw2;

public abstract class AbstractSuperPower {

    public abstract String getPowerName();

    AbstractCreature creature;

    AbstractSuperPower(AbstractCreature creature) {
        this.creature = creature;
    }

    public abstract void apply();
}