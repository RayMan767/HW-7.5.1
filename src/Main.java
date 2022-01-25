public class Main {
    public static void main(String[] args) {
        Entity[] towers;
        towers = new Entity[5];
        towers[0] = new Tower(100,10);
        towers[1] = new Tower(100,10);

        Entity[] orcs;
        orcs = new Entity[3];
        orcs[0] = new Orc(30,1);
        orcs[1] = new OrcArcher(50,50,50);

        Play play = new Play(towers, orcs);






    }
}
