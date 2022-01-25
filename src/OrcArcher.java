public class OrcArcher extends Entity implements Movable, Attacking {
    private int speed;
    private int passed = 0;
    private int damage;

    public OrcArcher(int hp, int speed, int damage) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
    }

    public boolean move() {
        passed += speed;
        System.out.println("The orc archer passed " + passed + " meters!");

        if(passed >= distance)
            return true;
        else
            return false;

    }

    public void attack(Entity entity) {
        System.out.println("The orc archer attack " + entity +" and deal " + this.damage + " damage.");
        entity.damage(damage);

    }

    public String toString(){
        return "orc archer";
    }
}
