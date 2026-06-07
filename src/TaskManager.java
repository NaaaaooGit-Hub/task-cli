import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
            try{ file.close(); } catch(IOException e){}

        }

    }

    void loadTasks(){

        try {
            Scanner sc = new Scanner(new File("tasks.txt"));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");

                Task task = new Task(parts[0], parts[1]);
                task.done = task.done = Boolean.parseBoolean(parts[2]);
                taskList.add(task);

            }
        }
        catch(FileNotFoundException e){
                System.out.println("Not Found File: " + e.getMessage());{

        }

        }
    }

}


