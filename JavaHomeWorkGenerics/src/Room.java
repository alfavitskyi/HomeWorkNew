public class Room <S> {
   S s;

    public Room (S s) {
        this.s = s;
    }

    public Room () {

    }

    public S getS () {
        return s;
    }

    public void setS (S s) {
        this.s = s;
    }
}
