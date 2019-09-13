package usersArrayList;

import java.util.Scanner;

public class MainArrayList {

    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;

    public static void main(String[] args) {

        System.out.println("CRUD with ArrayList");

        while (loop) {
            menu();
        }

    }

    private static void menu() {
        System.out.println("\n1. Create User");
        System.out.println("2. Read User");
        System.out.println("3. Update User");
        System.out.println("4. Delete by ID");
        System.out.println("5. Delete by Username");
        System.out.println("0. Exit");

        System.out.print("Make a choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                sc.nextLine();
                UserManagementArrayList.createUser();
                break;
            case 2:
                System.out.print("What is the ID of the user to be shown? ");
                int id = sc.nextInt();
                sc.nextLine();
                UserManagementArrayList.readUserByID(id);
                break;

            case 3:
                System.out.print("What is the ID of the user to be updated? ");
                id = sc.nextInt();
                sc.nextLine();
                UserManagementArrayList.updateUser(id);
                break;
            case 4:
                System.out.print("What is the ID of the user to be removed? ");
                id = sc.nextInt();
                sc.nextLine();
                UserManagementArrayList.deleteUserById(id);
                break;
            case 5:
                System.out.print("What is the username to be removed? ");
                sc.nextLine();
                String username = sc.nextLine().trim();
                UserManagementArrayList.deleteUserByUsername(username);
                break;
            case 0:
                loop = false;
                break;
        }
    }

}
