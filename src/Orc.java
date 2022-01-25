public class Orc extends Entity implements Movable {
    private int speed;
    private int passed = 0;

    public Orc(int hp, int speed) {
        this.hp = hp;
        this.speed = speed;
    }

    public boolean move() {
        passed += speed;
        System.out.println("The orc passed " + passed + " meters!");

        if(passed >= distance)
            return true;
        else
            return false;

    }
    public String toString(){
        return "orc";
    }

}
