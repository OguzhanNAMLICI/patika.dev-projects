import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName;
        String password;
        int choice;
        double transactionAmount = 0;
        double totalBalance = 0;
        int remainingRight = 3;

        while (remainingRight > 0){

            System.out.print("Enter your username: ");
            userName = scanner.nextLine();
            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            if(userName.equals("leemartinez") && password.equals("leemartinez1234")){

                System.out.println("\n");
                System.out.println("Successful login to the system.");
                System.out.println("Welcome to our Bank.");
                System.out.println();

                do{
                    System.out.println("[1]-Withdraw Money.");
                    System.out.println("[2]-Deposit Money");
                    System.out.println("[3]-Balance Inquiry");
                    System.out.println("[4]-EXIT");
                    System.out.print("Please select the action you want to do: ");
                    choice = scanner.nextInt();

                    switch (choice){

                        case 1:
                            System.out.println();
                            System.out.print("Enter the amount you want to withdrawn: ");
                            transactionAmount = scanner.nextInt();

                            if(transactionAmount > totalBalance){
                                System.out.println();
                                System.out.println("You do not have enough funds in your account.");
                                System.out.println("Maximum withdrawal money: "+totalBalance+"$");
                                System.out.println();
                            }

                            else{
                                totalBalance = totalBalance - transactionAmount;
                                System.out.println();
                                System.out.println("The amount you entered has been withdrawn from your account.");
                                System.out.println("Money in your account: " + totalBalance);
                                System.out.println();
                            }
                            break;

                        case 2:
                            System.out.println();
                            System.out.print("Enter the amount you want to deposit: ");
                            transactionAmount = scanner.nextInt();
                            totalBalance += transactionAmount;
                            System.out.println("The amount of money in your account after the deposit: "+totalBalance);
                            System.out.println();
                            break;

                        case 3:
                            System.out.println();
                            System.out.println("Amount of the previous transaction: "+transactionAmount);
                            System.out.println("Extract of account: " + totalBalance);
                            System.out.println();
                            break;

                        case 4:
                            System.out.println();
                            System.out.println("Thank you for choosing out bank.");
                            System.out.println("Logging out from the system.");
                            System.out.println("Have a great day. See you again.");
                            System.out.println();
                            break;
                    }

                }while (choice != 4);
                break;

            }

            else{
                remainingRight--;
                System.out.println("Username or Password is not correct. Please try again.");

                if(remainingRight == 0){
                    System.out.println();
                    System.out.println("You have no login rights. ");
                    System.out.println("Your account has been blocked.");
                    System.out.println("Contact the Bank.");
                    break;
                }
                System.out.println("Remaining right : " + remainingRight);
            }

        }
    }
}