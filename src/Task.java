public class Task {

    String title;
    String deadline;
    boolean done;

    Task(String title, String deadline){

        this.title = title;
        this.deadline = deadline;
        this.done = false; // 最初は必ずfalse done を外から受け取ると、「最初から完了済みのタスク」が作れてしまうから

    }

    void showInfo() {

        System.out.println("Title: " + title);
        System.out.println("Deadline: " + deadline);


        if(done){
            System.out.print("[x] Complete");
        }
        else{
            System.out.print("[] incomplete");
        }
        System.out.println();
        System.out.println();

    }

}
