package kadai7;

public abstract class Character {

    protected String name;
    private int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public abstract int attack();

    public void takeDamage(int damage) {
        this.hp -= damage;
        System.out.println(this.name + "の残り体力: " + this.hp);
    }

    public int getHp() {
        return this.hp;
    }
}
