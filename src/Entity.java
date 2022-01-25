abstract class Entity {
    protected int hp;
    private boolean destroyed = false;

    //poluchenie urona
    protected boolean damage(int dmg){
        hp -= dmg;

        if(hp < 1) {
            destroyed = true;
            System.out.println("The " + this + " was destroyed!");
        }

        return destroyed;
    }
    protected boolean isDestroyed() {
        return destroyed;
    }

}
