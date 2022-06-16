import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(700);
        boss.setTypeOfDefence("Magic");
        System.out.println("Boss's damage: " + boss.getDamage() + " \nBoss's health: " + boss.getHealth() +
                " \nBoss's type of defence: " + boss.getTypeOfDefence() + "\n");

        createHeroes();

    }

    public static Hero[] createHeroes() {
        Hero magic = new Hero(250, 15, "Magic");
        Hero golem = new Hero(600, 5);
        Hero medic = new Hero(250, 0, "Heal");
        Hero [] heroes = {magic, golem, medic};

        for (int i = 0; i < heroes.length; i++) {
            System.out.println("health: " + heroes[i].getHealth() + " damage: " + heroes[i].getDamage() + " ability: " + heroes[i].getAbility() + "\n");
        }

        return heroes;
    }
}