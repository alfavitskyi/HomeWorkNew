import java.util.Random;

public class Boss extends Monster {
    private Integer mana;
    private String name = "Dragon";
    private Integer health =70;
    private Integer power = 5;

    public Boss (Integer mana, Integer health, Integer power) {
        this.mana = mana;
        this.name = "Dragon";
        this.health = health;
        this.power = power;
    }


    public Integer getMana () {
        return mana;
    }

    public void setMana (Integer mana) {
        this.mana = mana;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Integer getHealth () {
        return health;
    }

    public void setHealth (Integer health) {
        this.health = health;
    }

    @Override
    public Integer getPower () {
        return power;
    }

    @Override
    public void setPower (Integer power) {
        this.power = power;
    }

    @Override
    public String getName () {
        return name;
    }

    public Boss () {

    }

@Override
    public Integer useMana (){
        Random random = new Random();
        int index = random.nextInt(4);
        if (index==1){
            mana = 40;
        }
        else {
            mana = 0;
        }
        return mana;
    }
}
