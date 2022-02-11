import java.awt.*;

public class Lab13v2{
    public static void main(String[] args) {
        Frame frame = new Frame("My App");
        frame.setSize(1000,900);
        frame.setLayout(null);
        Button button = new Button("Start");
        button.setSize(100, 100);
        button.setLocation(100,100);
        Label label = new Label("Label");
        label.setSize(100,25);
        label.setLocation(300,150);
        frame.add(label);
        frame.add(button);
        frame.setLayout((new FlowLayout()));
        frame.setVisible(true);
    }
}
