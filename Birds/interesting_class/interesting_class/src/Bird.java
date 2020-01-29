import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;

public abstract class Bird {
    private static int count;
    private int radius;
    protected int x;
    protected int y;
    protected int size;
    protected int size2;
    protected Color color;
    protected ArrayList<Integer> arrayX = new ArrayList<Integer>();
    protected ArrayList<Integer> arrayY = new ArrayList<Integer>();
    protected static int xmaxPopug = 100;
    protected static int xminPopug = 2000;
    protected static int ymaxPopug = 100;
    protected static int yminPopug = 2000;
    protected static int xmaxPenguin = 100;
    protected static int xminPenguin = 2000;
    protected static int ymaxPenguin = 100;
    protected static int yminPenguin = 2000;
    protected static int xmaxVorobey = 100;
    protected static int xminVorobey = 2000;
    protected static int ymaxVorobey = 100;
    protected static int yminVorobey = 2000;
    private static Color newColorPopug;
    private static Color newColorPenguin;
    private static Color newColorVorobey;
    private static int time;
    public Bird() {
        this.count++;
        System.out.println("Я птишка!");
        Calendar calendar = Calendar.getInstance();
        time = calendar.get(Calendar.HOUR_OF_DAY);
        if (time >= 6 && time < 12) {
            System.out.println("Утро");
        } else {
            if (time >= 12 && time < 18) {
                System.out.println("День");
            } else {
                if (time >= 18 && time < 24) {
                    System.out.println("Вечер");
                } else {
                    System.out.println("Ночь");
                }
            }
        }
    }

    public void fly() {
        System.out.println("Я полетело!");
    }

    public static int getCount() {
        return count;
    }

    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.size, this.size);
    }

    public void addPoints(int x, int y) {
        arrayX.add(x);
        arrayY.add(y);
    }

    public void reRandomPoints() {
        this.x = (int)(Math.random()*WorldOfTheBirds.width - 100);
        this.y = (int)(Math.random()*WorldOfTheBirds.height - 100);
        checkPoints(this.x, this.y);
    }

    public void checkPoints(int x, int y) {
        for (int i = 0; i < arrayX.size(); i++) {
            if (x == arrayX.get(i)) {
                if (y == arrayY.get(i)) {
                    reRandomPoints();
                    break;
                }
            }
        }
    }

    public void checkForRadius(int x1, int y1, int x2, int y2) {
        radius = (int) Math.sqrt(Math.pow((Math.abs(x1 - x2)), 2) + Math.pow((Math.abs(y1 - y2)), 2));
        if (radius < 60) {
            reRandomPoints();
        }
    }
    public void points(boolean Popugs, boolean Penguins, boolean Vorobeys, int x, int y, int size, Color newColor) {
        if (Popugs == true) {
            if (xmaxPopug < x) {
                xmaxPopug = x + size;
            }
            if (xminPopug > x) {
                xminPopug = x;
            }
            if (ymaxPopug < y) {
                ymaxPopug = y + size;
            }
            if (yminPopug > y) {
                yminPopug = y;
            }
            newColorPopug = newColor;
        }
        if (Penguins == true) {
            if (xmaxPenguin < x) {
                xmaxPenguin = x + size;
            }
            if (xminPenguin > x) {
                xminPenguin = x;
            }
            if (ymaxPenguin < y) {
                ymaxPenguin = y + size;
            }
            if (yminPenguin > y) {
                yminPenguin = y;
            }
            newColorPenguin  = newColor;
        }
        if (Vorobeys == true) {
            if (xmaxVorobey < x) {
                xmaxVorobey = x + size;
            }
            if (xminVorobey > x) {
                xminVorobey = x;
            }
            if (ymaxVorobey < y) {
                ymaxVorobey = y + size;
            }
            if (yminVorobey > y) {
                yminVorobey = y;
            }
            newColorVorobey = newColor;
        }
    }
    public static void drawing(int x1, int y1, int x2, int y2, Color newColor, Graphics g)
    {
        if(x1!=2000 && y1!=2000) {
            g.setColor(newColor);
            g.drawLine(x1, y1, x2, y1);
            g.drawLine(x2, y1, x2, y2);
            g.drawLine(x2, y2, x1, y2);
            g.drawLine(x1, y2, x1, y1);
        }
    }
    public static void drawBox(Graphics g)
    {
        drawing(xminPopug, yminPopug, xmaxPopug, ymaxPopug, newColorPopug, g);
        drawing(xminPenguin, yminPenguin, xmaxPenguin, ymaxPenguin, newColorPenguin, g);
        drawing(xminVorobey, yminVorobey, xmaxVorobey, ymaxVorobey, newColorVorobey, g);
    }
}
