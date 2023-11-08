//Daniel DeBonis
//Computer Science Java
//creates 5 warriors and then has them fight then prints out the results
public class Main {

    public static void main(String[] args) {
        WarriorFred[] warriors = new WarriorFred[5];

        // Creating and initializing warrior objects
        for (int i = 0; i < warriors.length; i++) {
            WarriorFred warrior = new WarriorFred();
            warrior.setNickName(); // Assign a random nickname
            warrior.setDamage(); // Assign random damage amount
            warriors[i] = warrior;
        }
        // Print all information with the printInfo method
        for (WarriorFred w : warriors) {
            w.printInfo();
        }

        // Simulating rounds and updating warrior status
        for (WarriorFred w : warriors) {

            for (int round = 1; round <= 10; round++) {
                System.out.println("Round " + round + "\n");

                // Simulating damage and reaction for the current warrior in the loop
                int damageTaken = (round % 5) + 1;
                w.takeDamage(damageTaken);
                w.reaction();
                w.printStatus();

                System.out.println();
            }
        }

        System.out.println("How did the Warriors fare?\n");

        // Print status for each warrior after all rounds
        for (WarriorFred warrior : warriors) {
            warrior.printStatus();
        }
    }
}
