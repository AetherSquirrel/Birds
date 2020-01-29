import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Group
{
    private ArrayList<Bird> f;
    private String[] names = {"Bobby", "Holo", "Alex", "Messy", "Sally", "Klaus"};
    private int random_number;
    public Group() {
        f = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; ; i++)
        {
            System.out.println("Кого надо? 0 - попуг, 1 - пенгвин, 2 - воробейка, 3 - выход с программы");
            random_number = (int)(Math.random()*names.length);
            int index = in.nextInt();
            if (index == 0) {
                f.add(new Popug(names[random_number]));
                System.out.println("Добавлен попуг!");
            }
            if (index == 1) {
                f.add(new Penguin());
                System.out.println("Добавлен пенгвин!");
            }
            if (index == 2) {
                f.add(new Vorobey());
                System.out.println("Добавлен воробейка!");
            }
            if (index == 3) {
                System.out.println("До свидания!");
                break;
            }
        }
        in.close();
    }
    public void fly()
    {
        for(int i=0; i<f.size(); i++)
        {
            f.get(i).fly();
        }
    }
    public int get_count()
    {
        int count = f.size();
        return count;
    }
    public void draw(Graphics g)
    {
        for(int i=0; i<f.size(); i++)
        {
            f.get(i).draw(g);
        }
        Bird.drawBox(g);
    }
}
