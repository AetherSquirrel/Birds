import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
public class Interesting_class
{
    public static void main (String[] args)
    {
        /*Popug popug_1 = new Popug();
        popug_1.fly();
        Popug popug_2= new Popug("Kaiser");
        popug_1.speak();
        popug_2.speak();
        popug_2.setName("Adolph");
        popug_2.speak();
        popug_2.setName("Maxim");
        System.out.println("Меня зовут " +popug_2.getName());
        Penguin penguin_1 = new Penguin();
        penguin_1.fly();
        popug_2.hello(popug_1);
        Penguin penguin_2 = new Penguin();
        penguin_1.setName("Vasya");
        penguin_1.hello(penguin_2);
        popug_1.hello(penguin_1);
        System.out.println("Всего пингвинов: " + Penguin.getCount());
        System.out.println("Всего птиц: " + Bird.getCount());
        popug_1=popug_2;
        popug_2.setName("Oleg");
        popug_1.speak();

       ArrayList<Bird> f = new ArrayList<>();
       f.add( new Popug("Pupa"));
       f.add( new Popug("Loopa"));
       f.add( new Penguin());
        for(int i=0; i<f.size(); i++)
        {
            f.get(i).fly();
        }

        Group group = new Group();
        group.fly();
        System.out.println("Всего птиц: "+group.get_count());

        JFrame f = new JFrame("Поляна");
        f.setSize(200,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        */
        Group g1 = new Group();
        WorldOfTheBirds w1 = new WorldOfTheBirds(g1);
    }
}