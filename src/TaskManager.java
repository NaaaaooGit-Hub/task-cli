import java.util.ArrayList;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

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

    void saveTask() {
        FileWriter file = null;

        try {
            file = new FileWriter("tasks.txt");
            for(Task task: taskList) {
                file.write(task.title + "," + task.deadline + "," + task.done + "\n");
            }
        }
        catch(IOException e) {
            System.out.println("Save Failed: " + e.getMessage());

        }
        finally {
            if(file != null){
                try { file.close(); } catch(IOException e) {}
            }
        }

    }

}


