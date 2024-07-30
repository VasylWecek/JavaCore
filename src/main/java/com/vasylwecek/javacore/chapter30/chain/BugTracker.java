package chapter30.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new SimpleReportNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SimpleReportNotifier(Priority.ASAP);


        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is OK.", Priority.ROUTINE);
        reportNotifier.notifyManager("Smth went wrong!", Priority.IMPORTANT);
        reportNotifier.notifyManager("Houston, we've had a problem here!!!", Priority.ASAP);

    }
}
