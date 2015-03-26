import javax.swing.JFrame;

public class LogFrame
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        int x = frame.getWidth();
        int y = frame.getHeight();
        frame.setSize(300,300);
        frame.setTitle("Fibonacci");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogSpiralPanel component = new LogSpiralPanel();
        frame.add(component);
        frame.setVisible(true);
    }
}