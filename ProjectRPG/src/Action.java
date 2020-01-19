public class Action {
    private boolean bossDead = false;


    Integer rounds = 0;
    Integer game = 1;
    Monster monster = new Monster();
    Boss boss = new Boss();
    Character character = new Character();
    public void startGame () {


        character.getName();
        monster.setName();
        while (rounds < 3) {
            character.equipCharacter();
            System.out.println(game + " round started");
            game++;
            monster.setHealthe(50);
            monster.setName();
            character.fight(monster);
            if (character.getHealth() > 0 && monster.getHealthe() <= 0) {
                System.out.println(character.getCharacterName() + " is a winner!!!");
                monster.setHealthe(50);
                character.setHealth(50);
                character.setHeals(0);
                rounds++;

            } else if (character.getHealth() <= 0 && monster.getHealthe() > 0) {
                System.out.println(monster.getName() + " is a winner");
                monster.setHealthe(50);
                character.setHealth(50);
            } else {
                System.out.println("Nobody won");
                monster.setHealthe(50);
                character.setHealth(50);
            }
        }
        if (rounds >= 3) {
            System.out.println("You won first level");
            //rounds = 0;
        }

     startGemaBoss();

    }

    public void startGemaBoss () {
        game = 1;
        character.setHealth(60);
        monster.setHealthe(60);
        while (bossDead == false) {
            character.equipCharacter();
            System.out.println(game + " fight with " + boss.getName() + " started");
            game++;
            boss.setHealthe(70);
            character.fightWithBoss(boss);
            if (character.getHealth() > 0 && boss.getHealth() <= 0) {
                System.out.println(character.getCharacterName() + " is a winner!!!");
                boss.setHealthe(50);
                character.setHealth(50);
                rounds++;
                bossDead=true;

            } else if (character.getHealth() <= 0 && boss.getHealthe() > 0) {
                System.out.println(boss.getName() + " is a winner");
                boss.setHealthe(50);
                character.setHealth(50);
            } else {
                System.out.println("Nobody won");
                boss.setHealthe(50);
                character.setHealth(50);
            }

        }
    }
}
