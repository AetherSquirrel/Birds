import java.awt.*;

public class Vorobey extends Bird
{
    Vorobey()
    {
        this.color = new Color(0, 39, 255);
        this.size = 10;
        this.x = (int)(Math.random()*WorldOfTheBirds.width - 300);
        this.y = (int)(Math.random()*WorldOfTheBirds.height - 300);
        addPoints(this.x, this.y);
        checkPoints(this.x, this.y);
        fly();
        points(false, false, true, this.x, this.y, this.size, this.color);
    }
}
