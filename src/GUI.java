import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI extends JFrame {
    private JButton[][] btns;
    private Control c;

    public GUI(Control c){
        this.c = c;
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        for(int y=0; y < c.getCave().getHeight(); y++){
            for(int x=0; x < c.getCave().getWidth(); x++)
                this.add(new LocationBtn());
        }
        this.setVisible(true);
    }

    public void handleButtonClick(int x, int y){
        c.getLocation(x,y);
    }
}
