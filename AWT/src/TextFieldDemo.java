import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class MyFrame4 extends Frame implements ActionListener, TextListener {
    Label l1, l2;
    TextField tf;

    MyFrame4() {
        super("TextFieldDemo");
        l1 = new Label("No text is entered yet");
        l2 = new Label("Enter key is not yet hit");
        tf = new TextField(30);

        setLayout(new FlowLayout());
        add(l1);
        add(l2);
        add(tf);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void textValueChanged(TextEvent e) {

    }
}

public class TextFieldDemo {
    public static void main(String[] args) {
        MyFrame4 f = new MyFrame4();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
