import java.util.Random;

public class Monster  {
     private String name;
     private Integer healthe=50;
     private Integer power=5;
     private Integer mana;

    public Monster () {

    }

    public String getName () {
//       name = setName();
        return name;
    }

    public String setName () {
       String [] monstersName = {"Spider", "Snake", "Fox"};
        Random random = new Random();
        int index = random.nextInt(3);
        name = monstersName[index];

        return name;
    }


    public Integer getHealthe () {
        return healthe;
    }

    public void setHealthe (Integer healthe) {
        this.healthe = healthe;
    }

    public Integer getPower () {
        return power;
    }

    public void setPower (Integer power) {
        this.power = power;
    }
    public Integer useMana (){
        mana=0;
        return mana;
    }


}
