import java.util.Scanner;

class ATM_Program {


    private static Scanner sc;
    private static int i;
    private static String pin_no = null;
    private static double amountofATM=100000;

    private ATM_Program() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\"Welcome to My Program\"" + "\n");
        System.out.println("Please Enter the your  four Digits Pin No" + "\n");
        System.out.print("****");


        pin_no = sc.next();


    }



    private static int anotherTransaction;

    public static void main(String args[]) {
        ATM_Program ob = new ATM_Program();
        sc = new Scanner(System.in);
        ChooseUserId();

        transaction();
    }
    private static String []id=new String[]{"Sachin@123" , "Amit@123" , "Himanshu@123"};
    private static double []balance = new double[]{10000,50000,60000};
    private static void ChooseUserId() {

        }


    private static void transaction() {
        int ch;

        System.out.println("Please select an option");
        System.out.println("1. User1 " + "\t");
        System.out.print("2. User2" + "\n");
        System.out.println("3. User3");

        ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println(id[0]);
                int choice;

                System.out.println("Please select an option");
                System.out.println("1. Withdraw" + "\t");
                System.out.print("2. Deposit" + "\n");
                System.out.println("3. Balance");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        double amount;
                        System.out.println("Please enter amount to withdraw: ");
                        amount = sc.nextDouble();
                        if (amount > balance[0] || amount == 0) {


                            System.out.println("You have insufficient Balance\n\n");
                            anotherTransaction();
                        }
                        else if(amount>amountofATM){
                            System.out.println("ATM has insufficient Balance");
                        }
                        else {

                            balance[1] = balance[0] - amount;
                            System.out.println("You have withdrawn " + amount + " and your new balance is " + balance[0] + "\n");
                            anotherTransaction();
                        }
                        break;

                    case 2:
                        double deposit;
                        System.out.println("Please enter amount you would wish to deposit: ");
                        deposit = sc.nextDouble();

                        balance[0] = deposit + balance[0];
                        System.out.println("You have deposited " + deposit + " new balance is " + balance[0] + "\n");
                        anotherTransaction();
                        break;

                    case 3:
                        System.out.println("Your balance is " + balance[0] + "\n");
                        anotherTransaction();
                        break;

                    default:
                        System.out.println("Invalid option:\n\n");
                        anotherTransaction();
                        break;
                }

                break;
            case 2:
                System.out.println(id[1]);


                System.out.println("Please select an option");
                System.out.println("1. Withdraw" + "\t");
                System.out.print("2. Deposit" + "\n");
                System.out.println("3. Balance");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        double amount;
                        System.out.println("Please enter amount to withdraw: ");
                        amount = sc.nextDouble();
                        if (amount > balance[1] || amount == 0) {


                            System.out.println("You have insufficient Balance\n\n");
                            anotherTransaction();
                        }
                        else if(amount>amountofATM){
                            System.out.println("ATM has insufficient Balance");
                        }
                        else {

                            balance[1] = balance[1] - amount;
                            System.out.println("You have withdrawn " + amount + " and your new balance is " + balance[1] + "\n");
                            anotherTransaction();
                        }
                        break;

                    case 2:
                        double deposit;
                        System.out.println("Please enter amount you would wish to deposit: ");
                        deposit = sc.nextDouble();

                        balance[1] = deposit + balance[1];
                        System.out.println("You have deposited " + deposit + " new balance is " + balance[1] + "\n");
                        anotherTransaction();
                        break;

                    case 3:
                        System.out.println("Your balance is " + balance[1] + "\n");
                        anotherTransaction();
                        break;

                    default:
                        System.out.println("Invalid option:\n\n");
                        anotherTransaction();
                        break;
                }
                break;
            case 3:
                System.out.println(id[2]);


                System.out.println("Please select an option");
                System.out.println("1. Withdraw" + "\t");
                System.out.print("2. Deposit" + "\n");
                System.out.println("3. Balance");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        double amount;
                        System.out.println("Please enter amount to withdraw: ");
                        amount = sc.nextDouble();
                        if (amount > balance[2] || amount == 0) {


                            System.out.println("You have insufficient Balance\n\n");
                            anotherTransaction();
                        }
                        else if(amount>amountofATM){
                            System.out.println("ATM has insufficient Balance");
                        }

                        else {

                            balance[2] = balance[2] - amount;
                            System.out.println("You have withdrawn "+ amount + " and your new balance is " + balance[2] + "\n");

                            anotherTransaction();
                        }
                        break;

                    case 2:
                        double deposit;
                        System.out.println("Please enter amount you would wish to deposit: ");
                        deposit = sc.nextDouble();

                        balance[2] = deposit + balance[2];
                        System.out.println("You have deposited " + deposit + " new balance is " + balance[2] + "\n");
                        anotherTransaction();
                        break;

                    case 3:
                        System.out.println("Your balance is " + balance[2] + "\n");
                        anotherTransaction();
                        break;

                    default:
                        System.out.println("Invalid option:\n\n");
                        anotherTransaction();
                        break;
                }
                break;
            default:
                System.out.println("You are enter invalid ID");
                break;
        }

    }

    private static void anotherTransaction() {
        System.out.println("Do you want another transaction?\n\nPress 1 for another transaction\n2 To exit");
        anotherTransaction = sc.nextInt();
        if (anotherTransaction == 1) {
            transaction();
        } else if (anotherTransaction == 2) {
            System.out.println("Thanks for choosing us. Good Bye!");
        } else {
            System.out.println("Invalid choice\n\n");
            anotherTransaction();
        }
    }
}

