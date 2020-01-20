import java.util.ArrayList;
import java.util.Iterator;


public class Collection  {
       static ArrayList <Integer> cities = new ArrayList<>();

    public Collection () {
        //this.cities = cities;


        cities.add(1);
        cities.add(2);
        cities.add(3);
        cities.add(4);
        cities.add(5);
        cities.add(6);
        cities.add(7);
        cities.add(8);
        cities.add(9);
        cities.add(10);
        cities.add(11);

    }

    public static class FirstClass implements  collectionIterator  {

        @Override
        public boolean hasNext () {
            Iterator<Integer> iter = cities.iterator();
            while (iter.hasNext()){
              System.out.print(iter.next()+" ");
            }
            System.out.println();
            for (int i = 0; i < cities.size(); i++) {
                if (cities.get(i)%2!=0){
                    cities.set(i, 0);
                    System.out.print(cities.get(i)+"/");
                }else {
                    System.out.print(cities.get(i)+"/");
                }

            }
            return false;

        }

        @Override
        public Object next () {
            return null;
        }

        @Override
        public boolean next1 () {
            return false;
        }
    }
    public static class SecondClass implements collectionIterator {
        @Override
        public boolean next1 () {

//            ListIterator <Integer> iter1 = cities.listIterator();
//            while (iter1.hasNext()){
//                System.out.print(iter1.next()+" ");
//            }
//            System.out.println();
//            for (Integer num: cities) {
//                System.out.print(num.toString() + "/");
//            }
//            System.out.println();
            for (int i = cities.size(); i > 0; i-=2){
                System.out.print(cities.get(i-1)+" ");
            }
            return false;
        }

        @Override
        public boolean hasNext () {
            return false;
        }

        @Override
        public Object next () {
            return null;
        }


    }


}
interface collectionIterator extends java.util.Iterator {
    boolean hasNext();

    boolean next1 ();

}
