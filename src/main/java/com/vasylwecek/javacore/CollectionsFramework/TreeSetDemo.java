package CollectionsFramework;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet<>();
        System.out.println("Adding elements into treeSet...");

        treeSet.add("9");
        treeSet.add("8");
        treeSet.add("4");
        treeSet.add("2");
        treeSet.add("1");
        treeSet.add("5");
        treeSet.add("6");
        treeSet.add("3");
        treeSet.add("7");
        treeSet.add("10");

        System.out.println("treeSet content: ");
        System.out.println(treeSet);

    }
}
