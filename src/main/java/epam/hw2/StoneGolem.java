package epam.hw2;

public class StoneGolem extends AbstractCreature {

    StoneGolem() {
        super(1, 10, (int) (Math.random() * 2 + 4), 30, 3);
    }

    @Override
    protected String getName() {
        return "Каменный Голем";
    }

}
