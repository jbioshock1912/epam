package epam.hw2;

import java.util.Random;

public class OneOnOneBattle implements Battle {

    private AbstractCreature firstCreature;
    private AbstractCreature secondCreature;

    public OneOnOneBattle(AbstractCreature firstCreature, AbstractCreature secondCreature) {
        this.firstCreature = firstCreature;
        this.secondCreature = secondCreature;
    }

    @Override
    public void action(AbstractCreature attacker, AbstractCreature defending) {
        var usePower = new Random().nextInt(51) > 40;
        if (usePower) {
            attacker.useSuperPower();
        } else {
            defending.applyDefense(attacker.dealDamage());
        }
    }

    @Override
    public void startBattle() {
        while (!isBattleEnded()) {
            var attacker = new Random().nextInt(51) > 25 ? firstCreature : secondCreature;
            var defencer = firstCreature == attacker ? secondCreature : firstCreature;
            if (checkDistance(attacker, defencer)) {
                action(attacker, defencer);
            } else {
                int stepAmount = countStepAmount(attacker, defencer);
                attacker.move(stepAmount);
                attacker.setxCoordinate(attacker.getxCoordinate() + stepAmount);
            }
        }
        var winner = firstCreature.getHitPoints() > 0 ? firstCreature : secondCreature;
        System.out.println("Битва окончена! Победитель: " + winner.getName() + "(" + winner.getHitPoints() + ")");
    }

    @Override
    public boolean isBattleEnded() {
        return !firstCreature.isAlive() || !secondCreature.isAlive();
    }

    private int countStepAmount(AbstractCreature attacker, AbstractCreature defending) {
        var direction = attacker.getxCoordinate() < defending.getxCoordinate() ? 1 : -1;
        int distanceBetweenCreature = Math.abs(attacker.getxCoordinate() - defending.getxCoordinate());
        if ((attacker.getAttackDistance() + attacker.getSpeed() < distanceBetweenCreature)) {
            return attacker.getSpeed() * direction;
        }
        return distanceBetweenCreature * direction;
    }

    private boolean checkDistance(AbstractCreature attacker, AbstractCreature defending) {
        int distance = Math.abs(attacker.getxCoordinate() - defending.getxCoordinate());
        return distance <= attacker.getAttackDistance();
    }

    public static void main(String[] args) {
        ObsidianGargoyle obsidianGargoyle = new ObsidianGargoyle();
        CriticalDamage criticalDamage = new CriticalDamage(obsidianGargoyle);
        obsidianGargoyle.setxCoordinate(0);
        obsidianGargoyle.setSuperPower(criticalDamage);

        StoneGolem stoneGolem = new StoneGolem();
        StoneSkin stoneSkin = new StoneSkin(stoneGolem);
        stoneGolem.setxCoordinate(25);
        stoneGolem.setSuperPower(stoneSkin);

        OneOnOneBattle oneOnOneBattle = new OneOnOneBattle(stoneGolem, obsidianGargoyle);
        oneOnOneBattle.startBattle();
    }
}
