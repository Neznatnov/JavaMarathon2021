package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    private int physAtt;
    private int healHimself;
    private int healTeammate;

    public Paladin() {
        super();
        this.physAtt = 15;
        this.healHimself = 25;
        this.healTeammate = 10;
        this.physDef = 0.5;
        this.magicDef = 0.2;
    }

    @Override
    public void physicalAttack(Hero hero) {
        int damage = (int) (physAtt - physAtt * hero.physDef);
        hero.health -= damage;
    }

    @Override
    public void healHimself() {
        health += healHimself;
        if (health > 100)
            health = 100;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += healTeammate;
        if (hero.health > 100)
            hero.health = 100;
    }
    @Override
    public String toString() {
        return "Paladin{health=" + health + "}";
    }
}
