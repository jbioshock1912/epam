package epam.hw2;

public class ObsidianGargoyle extends AbstractCreature implements Flyable {

    ObsidianGargoyle() {
        super(1, 7, (int) (Math.random() * 2 + 2), 16, 9);
    }

    @Override
    protected String getName() {
        return "Обсидиановая гаргулья";
    }
}
