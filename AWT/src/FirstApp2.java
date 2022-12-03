import java.awt.*;

class MyFrame extends Frame {
    Label l;
    TextField tf;
    Button b;

    public MyFrame() {
        super("My App");
        setLayout(new FlowLayout());
        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("OK");

        add(l);
        add(tf);
        add(b);
    }
}

public class FirstApp2 {
    public static void main(String[] args) {
        MyFrame frm = new MyFrame();
        frm.setSize(500, 500);
        frm.setVisible(true);
    }
}
