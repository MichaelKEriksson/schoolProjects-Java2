public class Game {
    private Gui gui;
    private Room room1, room2, room3, room4;
    private Room[] map;

    public Game() {
        //Skapar ett rum
        room1 = new Room("Entrance", "Small and yellow with a coat hanger");
        room2 = new Room("Kitchen", "Stinky with black and white tiles with a big stove in the middle");
        room3 = new Room("Livingroom", "Dark and dusky with a brown leather sofa");
        room4 = new Room("Bedroom", "Red velvet drapes with a huge bed inside");
        map = new Room[4];
        map[0] = room1;
        map[1] = room2;
        map[2] = room3;
        map[3] = room4;


        //GameObjects
        GameObject lampa = new GameObject("Taklampa", false);
        GameObject kanin = new GameObject("Liten vit kanin", true);
        Container box = new Container("En blå låda", false, false);
        room1.addObject(kanin);
        room1.addObject(box);
        room2.addObject(lampa);
        room2.addObject(box);

        Person otto = new Person("Otto", 0);
        room1.addNpc(otto);
        otto.getInventory().addObject(lampa);

        Person nettan = new Person("Nettan",1);
        room2.addNpc(nettan);
        nettan.getInventory().addObject(kanin);

        Person kalle = new Person("Kalle",2);
        room3.addNpc(kalle);
        nettan.getInventory().addObject(kanin);

        Person majsan = new Person("Majsan",3);
        room4.addNpc(majsan);
        nettan.getInventory().addObject(kanin);




        System.out.println(otto);

        // System.out.println(lampa);
        // System.out.println(lampa.isMovable());
        // System.out.println(kanin);
        // System.out.println(kanin.isMovable());

        //Inventory
        Inventory inventory = new Inventory(5);
        System.out.println(inventory); // prints whats inside inventory
        inventory.addObject(kanin);
        inventory.addObject(lampa);
        inventory.addObject(lampa);
        inventory.addObject(lampa);
        inventory.addObject(lampa);
        System.out.println(inventory);

        //Startar Gui
        this.gui = new Gui();
        //System.out.println(map[1]);
        //gui.setShowRoom(map[1].toString());
        int position = 0;
        gui.setShowRoom(map[position].toString()); // skickar showroom till int position.

        while (true) {

            String command = gui.getCommand();
            if (!command.equals("-1")) {

                if (command.equals("1")) {
                    position = 0;
                }
                if (command.equals("2")) {
                    position = 1;
                }

                if (command.equals("3")) {
                    position = 2;
                }
                if (command.equals("4")) {
                    position = 3;
                }


            }
            gui.setShowRoom(map[position].toString());
            gui.setShowInventory(inventory);
            if (map[position].getPersons() == null) {
                gui.setPerson(map[position].getPersons());
            }
        }
    }
}