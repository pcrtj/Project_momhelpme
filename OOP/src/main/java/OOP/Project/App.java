package OOP.Project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class App extends JFrame implements ActionListener {

    Game g = new Game();
    Firstpage fp = new Firstpage(g);
    public static final int width = 1200;
    public static final int hight = 750;

    App() {
        add(fp);
        fp.Bez.addActionListener(this);
        fp.Bmed.addActionListener(this);
        fp.Bhard.addActionListener(this);
        g.back_to_menu.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fp.Bez) {
            remove(fp);
            g.resetgame(2);
            add(g);
            g.requestFocusInWindow();
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == fp.Bmed) {
            remove(fp);
            g.resetgame(6);
            add(g);
            g.requestFocusInWindow();
            this.revalidate();
            this.repaint();

        }
        if (e.getSource() == fp.Bhard) {
            remove(fp);
            g.resetgame(8);
            add(g);
            g.requestFocusInWindow();
            this.revalidate();
            this.repaint();

        }
        if(e.getSource() == g.back_to_menu){
            remove(g);
            g.remove(g.back_to_menu);
            add(fp);
            fp.requestFocusInWindow();
            this.revalidate();
            this.repaint();
        }
    }

    public static void main(String[] args) {

        App window = new App();
        window.setTitle("Mom help me!!!");
        window.setSize(width, hight);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }

}
