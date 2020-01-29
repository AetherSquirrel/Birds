import java.awt.*;

public class Penguin extends Bird
{
    protected String name = "Саня";
    private static int num = 0;
    public Penguin()
    {
        this.num++;
        System.out.println("Я пингвин.");
        this.color = new Color(255, 158, 252);
        this.size = 30;
        this.size2 = 5;
        this.x = (int)(Math.random()*WorldOfTheBirds.width - 300);
        this.y = (int)(Math.random()*WorldOfTheBirds.height - 300);
        addPoints(this.x, this.y);
        checkPoints(this.x, this.y);
        points(false, true, false, this.x, this.y, this.size, this.color);
    }
    @Override
    public void fly ()
    {
        System.out.println("Я не умею летать!");
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void hello(Penguin secondPenguin)
    {
        System.out.println("Я пингвин " + this.name + " приветствую тебя пингвин " + secondPenguin.name);
    }
    public static int getCount()
    {
        return num;
    }
    @Override
    public void draw(Graphics g)
    {
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.size, this.size);
        g.setColor(new Color(0, 0, 0));
        g.fillOval(this.x + size/2, this.y + size/2, this.size2, this.size2);
    }
}
