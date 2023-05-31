package kadai7;

public class Monster extends Character {

	private int at;
	private int df;

	public Monster(String name, int hp, int at, int df) {
	    super(name, hp);
	    this.at = at;
	    this.df = df;
	}

	@Override
	public int attack() {
		System.out.println(this.name + "の攻撃");
		System.out.println(this.at + "のダメージ");
		return this.at;
	}

	public void defense() {
		System.out.println(this.name + "は守りを固めた");
		this.df += 10;
		System.out.println("防御力が10上昇し、" + this.df + "になった");
	}
}