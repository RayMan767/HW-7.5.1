public class Tower extends Entity implements Attacking {
    private int damage;

    public Tower(int hp, int damage) {
        this.damage = damage;
        this.hp = hp;
    }

    @Override
    public void attack(Entity entity) {
        System.out.println("The tower attack " + entity +" and deal " + this.damage + " damage.");
        entity.damage(damage);

    }

    public String toString(){
        return "tower";
    }
}
