import java.util.ArrayList;

public class Tournament {
public Tournament() {

}

//polymorphisim
public void processMembers(ArrayList<Member> members) {
    double max = -1;
    Coach maxCoach = null;
    int yellowCount = 0;
    int redCount = 0;

    // Loop through each member
    for (Member m : members) {
        System.out.println(m.getInfo()); // Print each member's info

        // Check if the member is a Coach
        if (m instanceof Coach) {
            Coach c = (Coach) m;
            if (c.getSalary() > max) {
                max = c.getSalary();
                maxCoach = c;
            }
        }
        // Check if the member is a Player
        else if (m instanceof Player) {
            Player p = (Player) m;
            yellowCount += p.getCards()[1]; // Add yellow cards count
            redCount += p.getCards()[2]; // Add red cards count
        }
    }

    // Display totals after processing all members
    System.out.printf("Total number of yellow cards is %d\n", yellowCount);
    System.out.printf("Total number of red cards is %d\n", redCount);
    if (maxCoach != null) {
        System.out.printf("Coach %s has the max salary of %.2f\n", maxCoach.getName(), maxCoach.getSalary());
    }

}}
