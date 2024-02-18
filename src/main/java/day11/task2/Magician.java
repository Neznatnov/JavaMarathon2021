package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack {
    private int magicAtt;
    private int physAtt;


    public Magician() {
        super();
        this.magicAtt = 20;
        this.physAtt = 5;
        this.magicDef = 0.8;
        this.physDef = 0.0;

    }

    @Override
    public void magicalAttack(Hero hero) {
        int damage = (int) (magicAtt - magicAtt * hero.magicDef);
        hero.health -= damage;
    }

    @Override
    public void physicalAttack(Hero hero) {
        int damage = (int) (physAtt - physAtt * hero.physDef);
        hero.health -= damage;
    }
    @Override
    public String toString() {
        return "Magician{health=" + health + "}";
    }
}
