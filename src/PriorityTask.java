
public class PriorityTask extends Task{

    int priority;

    public PriorityTask(String title, String deadline, int priority){

        super(title, deadline);
        this.priority = priority;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Priority: " + priority);
    }

}

