public class Main {

    public static void main(String[] args){

        TaskManager manager = new TaskManager();

        manager.addTask(new Task("Memorize", "2026-07-01"));
        manager.addTask(new Task("To-Do", "2026-07-05"));




        //Task task1 = new Task("Memorize", "2026-07-01");
        //manager.addTask(task1); It's the same as the code above.

        //Task task2 = new Task("To-Do", "2026-07-05");
        //manager.addTask(task2);


        manager.listTasks();

        manager.completeTask(0);
        manager.listTasks();

        manager.deleteTask(1);
        manager.listTasks();


    }
}
