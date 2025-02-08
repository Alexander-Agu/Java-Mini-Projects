package task;

import java.util.HashMap;
import java.util.Scanner;

public class Task {
    int taskNumber = 0;
    Scanner input = new Scanner(System.in);

    public Task (){
        taskNumber++;
    }


    public HashMap<String, String> createTask(HashMap<String, String> taskData){
        // Gets user input for the task
        System.out.println("Please insertTask");
        String task = input.nextLine();

        taskData.put("taskId", "" + taskNumber);
        taskData.put("task", task);
        return taskData;
    }
}
