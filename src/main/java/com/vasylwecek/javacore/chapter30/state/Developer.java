package chapter30.state;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sleeping){
            setActivity(new Trainig());
        }else if (activity instanceof Trainig){
            setActivity((new Coding()));
        }else if (activity instanceof Coding){
            setActivity(new Reading());
        }else if (activity instanceof Reading){
            setActivity(new Sleeping());
        }
    }

    public void justDoIt(){
        activity.justDoIt();
    }
}
