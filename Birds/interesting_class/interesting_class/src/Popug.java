import java.awt.*;

public class Popug extends Bird
{
    private String name = "Марк";
    public Popug()
    {
        System.out.println("Я пепуг.");
        this.color = new Color(178, 255, 97);
        this.size = 20;
        this.x = (int)(Math.random()*WorldOfTheBirds.width - 300);
        this.y = (int)(Math.random()*WorldOfTheBirds.height - 300);
        addPoints(this.x, this.y);
        checkPoints(this.x, this.y);
        points(true, false,false, this.x, this.y, this.size, this.color);
    }
    public Popug(String name)
    {
        this.name=name;
        System.out.println("Я попугай " + this.name + "!");
        this.color = new Color(178, 255, 97);
        this.size = 20;
        this.x = (int)(Math.random()*WorldOfTheBirds.width - 100);
        this.y = (int)(Math.random()*WorldOfTheBirds.height - 100);
        addPoints(this.x, this.y);
        checkPoints(this.x, this.y);
        points(true, false,false, this.x, this.y, this.size, this.color);
    }
    public void speak()
    {
        System.out.println("Меня зовут " + this.name + "!");
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void hello(Popug secondPopug)
    {
        System.out.println("Я " + this.name + "! Приветствую тебя, " + secondPopug.name +"!");
    }
    public void hello(Penguin penguin)
    {
        System.out.println("Я попугай и не понимаю тебя, пингвин " + penguin.name +"!");
    }
}
