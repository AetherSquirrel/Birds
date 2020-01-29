import javax.swing.*;
import java.awt.*;

public class WorldOfTheBirds extends JFrame
{
    public static final int width = 1300;
    public static final int height = 700;

    private Group group;
    public WorldOfTheBirds(Group group) {
        this.group = group;
        this.setSize(1300, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Окно");
        this.setLocationRelativeTo(null);
    }
    @Override
    public void paint(Graphics g)
    {
        /*
        g.setColor(new Color(255,0,0));
        g.drawLine(20, 20, 100, 100);
        g.drawOval(40,40,50,50);
        g.fillOval(60,60,50,50);
        */
        //g.translate(getWidth()/2,getWidth()/2);
        //g.drawLine(0,-450, 0, 450);
        //g.drawLine(-450,0, 450, 0);
        g.translate(50, 50);
        group.draw(g);
    }
}
