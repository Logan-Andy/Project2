
import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Task> yourTasks = new ArrayList<>();
        int userResponse = 8;
        while (userResponse != 0) {
            System.out.println("""
                    Please select an option
                    [1] Add a task.
                    [2] Remove a task.
                    [3] Update a task.
                    [4] List all tasks.
                    (0) Exit.
                    """);
            System.out.println("What option do you choose?");
            userResponse = input.nextInt();
            input.nextLine();
            switch (userResponse) {
                case 1:
                    System.out.println("What task would you like to add?");
                    String task = input.nextLine();
                    String description = input.nextLine();
                    int priority = input.nextInt();
                    input.nextLine();
                    break;
                case 2:
                    System.out.println("What task would you like to remove?");
                    System.out.println(yourTasks);
                    int reset = input.nextInt();
                    input.nextLine();
                    reset = reset - 1;
                    yourTasks.remove(reset);
                    break;

                case 3:
                    System.out.println("What task would you like to update?");
                    System.out.println(yourTasks);
                    reset = input.nextInt();
                    input.nextLine();
                    System.out.println("What would you like to replace it with?");
                    task = input.nextLine();
                    description = input.nextLine();
                    priority = input.nextInt();
                    input.nextLine();
                    //reset - 1 so it is simple to choose what task ex: if you want the first task, you would input 1,
                    //this is subtracted by 1 so that the code will understand exactly what you mean, however
                    //if you input 0, this will not work.
                    reset = reset - 1;
                    yourTasks.set(reset, task);
                    System.out.println(yourTasks.get(reset));
                    break;

                case 4:
                    System.out.println("Here are your tasks");
                    System.out.println(yourTasks);
                    break;

                case 5:
                    System.out.println("What priority do you wish to view?");
                    if ((priority > 0) && (priority <= 5)){
                        for(Task a : yourTasks){
                            if(a.getPriority()==priority){
                                System.out.println(a);
                            }
                        }
                    }
                    break;

            }


        }
    }

}
