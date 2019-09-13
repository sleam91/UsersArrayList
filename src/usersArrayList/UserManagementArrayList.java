package usersArrayList;

import java.util.ArrayList;

public class UserManagementArrayList {

    static ArrayList<User> users = new ArrayList<>();

    static void createUser() {

        System.out.println("Enter new username: ");
        String name = MainArrayList.sc.nextLine();

        System.out.println("Enter new user ID: ");
        int id = MainArrayList.sc.nextInt();
        MainArrayList.sc.nextLine();

        System.out.println("Birthdate (yyyyMMdd): ");
        String birthdate = MainArrayList.sc.nextLine();

        users.add(new User(id, name, birthdate));

        System.out.println("User registered");
    }

    static void readUserByID(int id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                System.out.println();
                System.out.println(users.get(i));
                return;
            }
        }
        System.out.println("\nNo such user ID");
    }

    static void updateUser(int id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                System.out.println();
                System.out.println(users.get(i));
                System.out.println("What is the new username?");
                String name = MainArrayList.sc.nextLine();
                users.get(i).setUsername(name);
                System.out.println("Username is updated");
                System.out.println(users.get(i));
                return;
            }
        }
        System.out.println("\nNo such user ID");
    }

    public static void deleteUserById(int id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                System.out.println("\nUser " + users.get(i).getUsername() + " deleted");
                users.remove(i);
                return;
            }
        }
        System.out.println("\nNo such user ID");
    }

    public static void deleteUserByUsername(String username) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equalsIgnoreCase(username)) {
                System.out.println("\nUser with ID " + users.get(i).getId() + " deleted");
                users.remove(i);
                return;
            }
        }

        System.out.println("\nNo such username");
    }

}
