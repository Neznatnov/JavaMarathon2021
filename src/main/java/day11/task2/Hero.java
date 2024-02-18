package day11.task2;

abstract class Hero {
    protected int health;
    protected double physDef;
    protected double magicDef;

    public Hero() {
        this.health = 100;
    }

    public abstract String toString();
}
