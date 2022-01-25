public class Play {
    private boolean finish = false;
    private boolean end = false;

    public Play(Entity[] towers, Entity[] orcs) {
        while (!end) {
            for (Entity a : towers) {
                if (a == null || a.isDestroyed()) {
                    break;
                }

                for (Entity b : orcs) {
                    if (b == null) {
                        end = true;
                        break;
                    }
                    if (!b.isDestroyed()) {
                        ((Attacking) a).attack(b);
                        break;
                    }
                }
            }

            for (Entity a : orcs) {
                if(a == null)
                    break;
                if (!a.isDestroyed()) {
                    finish = ((Movable) a).move();
                    if(finish) {
                        end = true;
                        break;
                    }
                }
                if(a instanceof Attacking && !a.isDestroyed()){
                    for(Entity b : towers){
                        if(b == null)
                            break;
                        if(!b.isDestroyed()){
                            ((Attacking)a).attack(b);
                        }
                    }

                }

            }



        }

        if(finish == true)
            System.out.println("Orcs win!");
        else
            System.out.println("Towers win!");


    }
}
