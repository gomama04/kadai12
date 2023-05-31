package kadai7;

public class Story {

	public static void main(String[] args) {

	    Character[] c = new Character[3];
	    c[0] = new Hero("勇者", 100, 100, 100);
	    c[1] = new Magician("魔法使い", 100, 50, 100, 100, 100);
	    c[2] = new Monster("モンスター", 250, 50, 50);

	    // バトル開始
	    battle(c);

	}
	
	public static void battle(Character[] c) {
	    boolean heroAlive = true;
	    boolean monsterAlive = true;
	    while (heroAlive && monsterAlive) {
	        for (int i = 0; i < c.length; i++) {
	            if (c[i] instanceof Hero || c[i] instanceof Magician) {
	                int damage = c[i].attack();
	                for (int j = 0; j < c.length; j++) {
	                    if (c[j] instanceof Monster) {
	                        c[j].takeDamage(damage);
	                        if (c[j].getHp() <= 0) {
	                            monsterAlive = false;
	                            break;
	                        }
	                    }
	                }
	            } else if (c[i] instanceof Monster) {
	                int damage = c[i].attack();
	                for (int j = 0; j < c.length; j++) {
	                    if (c[j] instanceof Hero || c[j] instanceof Magician) {
	                        c[j].takeDamage(damage);
	                        if (c[j].getHp() <= 0) {
	                            heroAlive = false;
	                            break;
	                        }
	                    }
	                }
	            }
	            if (!heroAlive || !monsterAlive) {
	                break;
	            }
	        }
	    }
	    
	    if (heroAlive) {
	        System.out.println("勇者と魔法使いの勝利！");
	    } else {
	        System.out.println("モンスターの勝利！");
	    }
	}
}






