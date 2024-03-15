package encapsulation;

/**
 *
 */
public class Player {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Andy";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.heathRemaining());
//
//        player.health = 200;
//
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.heathRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + tim.heathRemaining());
    }

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health = health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int heathRemaining() {
        return health;
    }

    public void restoreHealth(int extraHealth) {
        health = health + extraHealth;
        if (health > 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }
}
