import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class FV {

    private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private final int screenWidth = screenSize.width;
    private final int screenHeight = screenSize.height;
    private final Random random = new Random();

    public void BlockAll() throws AWTException{
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.mouseMove(random.nextInt(screenWidth),random.nextInt(screenHeight));
    }


    public void PopUp(){
        JWindow window = new JWindow();
        JLabel label = new JLabel("Virus detected",JLabel.CENTER);
        window.setBackground(Color.RED);
        window.add(label);
        window.setSize(150,50);
        window.setLocation(random.nextInt(screenWidth),random.nextInt(screenHeight));
        window.setVisible(true);
    }
    public static void main(String[] args) throws AWTException, InterruptedException {
        FV fv = new FV();
        //while (true)
        for (int i=0; i<200; i++)
        {
            fv.BlockAll();
            fv.PopUp();
        }
    }
}
