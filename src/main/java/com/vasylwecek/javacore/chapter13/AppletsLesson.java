package chapter13;
import javax.swing.*;
public class AppletsLesson extends JApplet {
    @Override
    public void init(){
        add(new JButton(getParameter("buttonName")));
    }
}
