package epam.hw2;

public class CriticalDamage extends AbstractSuperPower {

    private static final int INCREASED_DAMAGE = 2;

    CriticalDamage(AbstractCreature creature) {
        super(creature);
    }

    @Override
    public String getPowerName() {
        return "Критический урон";
    }

    @Override
    public void apply() {
        int probability = (int) (Math.random() * 100 + 1);
        if (probability <= 10){
            creature.setDamage(creature.getDamage() * INCREASED_DAMAGE); //крит урон в случае успеха применения увеличивается в два раза
        }
    }
}
