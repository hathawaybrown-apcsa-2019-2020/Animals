
/**
 * Implements a list of Animals as an ArrayList
 *
 * @author Michael Buescher for APCS-A
 * @version 2019
 */

import java.util.ArrayList;

public class AnimalList
{

    /**
     * Makes a list of Animals!
     */
    public static void main (String[] args)
    {
        ArrayList<Animal> myList = new ArrayList<Animal>();
        
        myList.add(new Raccoon());
        myList.add(new Buffalo());
        myList.add(new Isajelly());
        myList.add(new Pig());
        myList.add(new Blobfish());
        myList.add(new Dragon());
        
        for (Animal a : myList)
        {
            a.speak();
            a.eat();
            System.out.println();
        }
    }
}
