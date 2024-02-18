package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    private int physAtt;

    public Warrior() {
        super();
        this.physAtt = 30;
        this.physDef = 0.8;
        this.magicDef = 0.0;
    }

    @Override
    public void physicalAttack(Hero hero) {
        int damage = (int) (physAtt - physAtt * hero.physDef);
        hero.health -= damage;
    }
    @Override
    public String toString() {
        return "Warrior{health=" + health + "}";
    }
}
