import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("removal")
public class MyApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, Applet!", 20, 20);
    }
}
