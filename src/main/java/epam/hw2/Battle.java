package epam.hw2;

public interface Battle {

    void action(AbstractCreature attacker, AbstractCreature defending);

    void startBattle();

    boolean isBattleEnded();
}

