package epam.hw2;

public class StoneSkin extends AbstractSuperPower {
    private static final int INCREASED_DEFENSE = 2;

    StoneSkin(AbstractCreature creature) {
        super(creature);
    }

    @Override
    public String getPowerName() {
        return "Каменная кожа";
    }

    @Override
    public void apply() {
        int probability = (int) (Math.random() * 100 + 1);
        if (probability <= 20) {
            creature.setDefense(creature.getDefense() + INCREASED_DEFENSE); //каменная кожа в случае успеха применения увеличивает защиту на 2
        }
    }
}
