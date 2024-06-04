package chapter13;

import java.awt.*; //- импортирует классы библиотеки Abstract Window Toolkit (АWТ).
import java.applet.*;// - импортирует пакет applet, в котором находится класс Applet. Каждый создаваемый аплет должен быть подклассом, прямо или косвенно производным от класса Applet.

/*
<applet code="SimpleApplet" width=200 height=60>
</applet>
 */
public class SimpleApplet extends Applet{
    public void paint(Graphics g) {
        g.drawString("Пpocтeйwий аплет", 20, 20);
    }
}