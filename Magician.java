package kadai7;

public class Magician extends Character {

	private int at;
	private int at2;
	private int df;
	private int mp;

	public Magician(String name, int hp, int at, int at2, int df, int mp) {
	    super(name, hp);
	    this.at = at;
	    this.at2 = at2;
	    this.df = df;
	    this.mp = mp;
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

	public void magic() {
	        System.out.println(this.name + "が魔法攻撃をした");
	        this.mp -= 5;
	        System.out.println("敵にダメージを" + this.at2 + "与えた");
	        System.out.println("MPが5減った");
	        
	   }

	   public void cure() {
	        System.out.println(this.name + "が回復魔法を使用した");
	        super.takeDamage(-10);
	        this.mp -= 10;
	        System.out.println("HPが10回復し" + super.getHp() + "になった");
	        System.out.println("MPが10減った");
	   }

	   public void heal() {
	        System.out.println(this.name + "が休憩した");
	        super.takeDamage(-10);
	        System.out.println("HPが10回復し" + super.getHp() + "になった");
	   }
}