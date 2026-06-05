import java.util.ArrayList;

public class TaskManager {

    ArrayList<Task> taskList = new ArrayList<>();



    void addTask(Task task){
        taskList.add(task);

    }
    void listTasks(){
        for(Task task: taskList){
            task.showInfo();
        }

    }
    void completeTask(int index) {
        taskList.get(index).done = true;
    }

    void deleteTask(int index) {
        taskList.remove(index);
    }

}


