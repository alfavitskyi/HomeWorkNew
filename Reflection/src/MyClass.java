public class MyClass {
    private int year = 5;
    private String name = "Bars";

    public MyClass () {
    }

    public MyClass (int year, String name) {
        this.year = year;
        this.name = name;
    }

    public int getYear () {
        return year;
    }

    public String getName () {
        return name;
    }
    private void testMethod (String s){
        System.out.println(s + " is barking!");

    }
}
