package chapter30.chain;

import java.lang.reflect.Modifier;

public class SimpleReportNotifier extends Notifier {
public SimpleReportNotifier( int priority) {
    super (priority);
}

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report notifier: " + message);
    }
}
