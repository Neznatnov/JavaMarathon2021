package day11.task2;

class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {
    private int healHimself;
    private int healTeammate;
    private int physAtt;
    private int magicAtt;
    public Shaman() {
        super();
        this.physAtt = 10;
        this.magicAtt = 15;
        this.healHimself = 50;
        this.healTeammate = 30;
        this.physDef = 0.2;
        this.magicDef = 0.2;
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
    public void physicalAttack(Hero hero) {
        int damage = (int) (physAtt - physAtt * hero.physDef);
        hero.health -= damage;
    }

    @Override
    public void magicalAttack(Hero hero) {
        int damage = (int) (magicAtt - magicAtt * hero.magicDef);
        hero.health -= damage;
    }
    @Override
    public String toString() {
        return "Shaman{health=" + health + "}";
    }
}

