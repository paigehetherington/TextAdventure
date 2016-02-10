/**
 * Created by vajrayogini on 2/9/16.
 */
public class character {
    String name;
    int health;
    int damage;

    public void battle(character enemy) { //write method here so can be used in enermy and player classes
        System.out.printf("%s appears!\n", enemy.name);



        while (health > 0 && enemy.health >0) { //if both are alive
            health -= enemy.damage; //health  = health - enemy.damage
            enemy.health -= damage;
            System.out.printf("%s's health: %d\n", name, health);
            System.out.printf("%s's health; %d\n", enemy.name, enemy.health);
        }

        String message = "%s has died.\n";
        if (health <= 0) {
            System.out.printf(message, name);
        }
        if (enemy.health <= 0) {
            System.out.printf(message, enemy.name);
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
