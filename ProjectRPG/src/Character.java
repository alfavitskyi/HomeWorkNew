import java.util.Scanner;

public class Character {
    private int health = 50;
    private int power = 5;
    private int heals = 0;
    Scanner sc = new Scanner(System.in);
    private String characterName;
    int button = 0;

    public void setHeals (int heals) {
        this.heals = heals;
    }

    public void setHealth (int health) {
        this.health = health;
    }

    public int getHealth () {
        return health;
    }

//    public Character () {
//        this.characterName = characterName;
//    }

    public String getCharacterName () {
        return characterName;
    }

//    public void setCharacterName (String characterName) {
//         }

    public String getName (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of your character");
        characterName = sc.nextLine();
        return characterName;
    }
    public int scanning (){

        Scanner scan = new Scanner(System.in);
        button = scan.nextInt();
        return button;
    }
    public void equipCharacter(){
        System.out.println("Choose equipment for "+characterName +". 1 - hauberk; 2 - helmet; 3 - shield; 4 - hauberk and helmet; 5 - hauberk, helmet and shield");
        scanning();
        if (button==1){
            System.out.println(CharacterEquipment.HAUBERK.getTitle() +" added");
            health +=10;
        }
        else if (button==2) {
            System.out.println(CharacterEquipment.HELMET.getTitle() + " added");
            health +=20;
        }
        else if (button==3){
            System.out.println(CharacterEquipment.SHIELD.getTitle()+" added");
            health +=30;
        }else if (button==4){
            System.out.println(CharacterEquipment.HAUBERK.getTitle()+" and "+CharacterEquipment.HELMET.getTitle() + " added");
            health +=40;
        }
        else if (button==5){
            System.out.println(CharacterEquipment.HAUBERK.getTitle()+", "+CharacterEquipment.HELMET.getTitle() +" and "+ CharacterEquipment.SHIELD.getTitle()+" added");
            health +=50;
        }
        else {
            System.out.println("No equipment has been chosed");
        }
    }
    public void fight (Monster monster){

        Scanner sc = new Scanner(System.in);
        while (monster.getHealthe()>0 && this.health>0) {
            this.health -= monster.getPower();
            Integer monsterHealth = monster.getHealthe();
            monsterHealth -= this.power;
            monster.setHealthe(monsterHealth);

            System.out.print(characterName+" - "+this.health);
            System.out.print("  ");
            System.out.println(monster.getName()+" - " + monster.getHealthe());
            System.out.println("Choose your move: 1 - continue fight; 2 - to heal and continue");
            switch (sc.nextInt()){
                case 1: break;
                case 2: if (heals<2){this.health +=20;
                    heals++;}
                else {
                    System.out.println("You can't heal anymore");
                }
            }
        }


    }
    public void fightWithBoss (Boss boss){
        Scanner sc = new Scanner(System.in);
            while (boss.getHealth()>0 && this.health>0) {
                this.health -= (boss.getPower()+boss.useMana());
                Integer bossHealth = boss.getHealthe();
                bossHealth -= this.power;
                boss.setHealthe(bossHealth);

                System.out.print(characterName+" - "+this.health);
                System.out.print("  ");
                System.out.println(boss.getName()+" - " + boss.getHealthe());
                System.out.println("Choose your move: 1 - continue fight; 2 - to heal and continue");
                switch (sc.nextInt()){
                    case 1: break;
                    case 2: if (heals<3){this.health +=20;
                                heals++;}
                            else {
                        System.out.println("You can't heal anymore");
                    }

            }


        }


    }
}
