package epam.hw2;


public abstract class AbstractCreature {
    private int attackDistance; //дальность атаки
    private int defense; //защита
    private int damage; //урон
    private int hitPoints; //очки здоровья
    private int speed; //скорость
    private int xCoordinate; //координата
    private AbstractCreature currentEnemy; //текущий враг
    private AbstractSuperPower superPower; //суперсила

    protected abstract String getName(); //название существа

    int getAttackDistance() {
        return attackDistance;
    }

    public void setAttackDistance(int attackDistance) {
        this.attackDistance = attackDistance;
    }

    int getDefense() {
        return defense;
    }

    void setDefense(int defense) {
        this.defense = defense;
    }

    int getDamage() {
        return damage;
    }

    void setDamage(int damage) {
        this.damage = damage;
    }

    int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    int getxCoordinate() {
        return xCoordinate;
    }

    void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public AbstractCreature getCurrentEnemy() {
        return currentEnemy;
    }

    public void setCurrentEnemy(AbstractCreature currentEnemy) {
        this.currentEnemy = currentEnemy;
    }

    public AbstractSuperPower getSuperPower() {
        return superPower;
    }

    void setSuperPower(AbstractSuperPower superPower) {
        this.superPower = superPower;
    }

    AbstractCreature(int attackDistance, int defense, int damage, int hitPoints, int speed) {
        this.attackDistance = attackDistance;
        this.defense = defense;
        this.damage = damage;
        this.hitPoints = hitPoints;
        this.speed = speed;
    }

    int dealDamage() {//наносить урон
        System.out.println(getName() + " наносит урон: " + damage);
        return damage;
    }

    void applyDefense(int damage) { //применить защиту
        if (defense > 0) {
            defense = defense - damage;
            if (defense <= 0) {
                damage = Math.abs(defense);
                defense = 0;
            }
        }
        if (defense <= 0) {
            hitPoints = hitPoints - damage;
        }
        if (hitPoints < 0) {
            hitPoints = 0;
        }
        System.out.println(getName() + " Применяет защиту! Осталось очков здоровья: " + hitPoints);
    }

    void move(int stepAmount) {
        System.out.println(getName() + " делает шагов: " + stepAmount);
        xCoordinate = xCoordinate + stepAmount;
    }

    void useSuperPower() {
        System.out.println(getName() + " применяет суперсилу: " + superPower.getPowerName());
        superPower.apply();
    }

    boolean isAlive() {
        return this.hitPoints > 0;
    }

}
