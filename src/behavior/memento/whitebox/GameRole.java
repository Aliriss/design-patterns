package behavior.memento.whitebox;

/**
 * @author all
 * @since 2023/8/6 18:56
 */

public class GameRole {
    /**
     * 生命力
     */
    private int vit;
    /**
     * 攻击力
     */
    private int atk;
    /**
     * 防御力
     */
    private int def;
    public void initState() {
        vit = 100;
        atk = 100;
        def = 100;
    }
    public void fight() {
        System.out.println("\nFighting...");
        System.out.println("Reduce vitality(or HP) by 100.");
        System.out.println("Vitality is zero.");
        vit = 0;
        System.out.println("Now, can't attack. Attack is zero.");
        atk = 0;
        System.out.println("Now, can't defense. Defense is zero. ");
        def = 0;
    }
    public void recoverState(RoleStateMemento roleStateMemento) {
        this.atk = roleStateMemento.getAtk();
        this.vit = roleStateMemento.getVit();
        this.def = roleStateMemento.getDef();
    }

    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    public void display() {
        System.out.println("\nDisplay role info: ");
        System.out.println("Vitality: " + vit);
        System.out.println("Attack: " + atk);
        System.out.println("Defense: " + def);
    }
    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
