import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner passwordScanner = new Scanner(System.in);
        String systemUsername = "javaLover";
        String systemPassword = "ilovejava";
        String userName;
        String password;
        String newPassword;
        int choice;

        System.out.print("Enter username: ");
        userName = scanner.nextLine();
        System.out.print("Enter password: ");
        password = scanner.nextLine();

        if(userName.equals("javaLover")&& password.equals("ilovejava")){
            System.out.println("Login Successful.");
        }
        else if(userName.equals(systemUsername) && !password.equals(systemPassword)){
            System.out.println("Your password is not correct");
            System.out.println("Do you want to change your password");
            System.out.println("[1]-Yes");
            System.out.println("[2]-No");
            System.out.print("Enter a Choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("New password: ");
                    newPassword = passwordScanner.nextLine();
                    if(newPassword.equals(systemPassword)){
                        System.out.println("Your new password is the same as your old password.");
                        System.out.println("Please Try Again.");
                    }
                    else{
                        System.out.println("Your password has been changed.");
                        System.out.println("Your new password is: " + "'"+newPassword+"'");
                    }
                    break;

                case 2:
                    System.out.println("You don't want to change your password.. ");
                    System.out.println("Please login to the system again. ");
                    break;

                default:
                    System.out.println("Entered an invalid option... Please Try Again");
            }
        }
        else {
            System.out.println("Your username and password are incorrect.");
            System.out.println("Please Try Again.");
        }

    }
}