import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        bankSystem bankSys = new bankSystem();

        while (true){
            System.out.println("Bank account management System");
            System.out.println("1. Create account");
            System.out.println("2. Find account details");
            System.out.println("3. Add transaction");
            System.out.println("4. Get transaction history");
            System.out.println("5. List all accounts ");
            System.out.println("6. Update customer info");
            System.out.println("7. Delete account");
            System.out.println("8. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    accountDetails details = new accountDetails();

                    System.out.println("To create an account: ");
                    System.out.println("Please enter your 7 digit account number");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine();

                    details.setAccountNumber(accountNumber);

                    System.out.println("Please enter your account name: ");
                    String accountName = scanner.nextLine();
                    details.setAccountName(accountName);

                    System.out.println("Please enter your account type, Savings or Current: ");
                    String accountType = scanner.nextLine();
                    details.setAccountType(accountType);

                    System.out.println("Please enter your account balance: ");
                    double accountBalance = scanner.nextDouble();
                    scanner.nextLine();

                    details.setAccountBalance(accountBalance);
                    bankSys.createAccount(details);
                    break;

                case 2:
                    System.out.println("Please enter the account name of the account to find: ");
                    String accountFullName = scanner.nextLine();
                    accountDetails accountInfo = bankSys.findAccount(accountFullName);

                    System.out.println("Account number: " + accountInfo.getAccountNumber());
                    System.out.println("Account name: " + accountInfo.getAccountName());
                    System.out.println("Account balance: " + accountInfo.getAccountBalance());
                    System.out.println("Account Type: " + accountInfo.getAccountType());
                    System.out.println();
                    break;



                case 3:
                    transactionDetails transactionData = new transactionDetails();
                    System.out.println("To add transaction");
                    System.out.println("Please enter your transactionID");
                    int transactionID = scanner.nextInt();
                    scanner.nextLine();

                    transactionData.setTransactionID(transactionID);

                    System.out.println("Please add date in the format DD-MM-YYYY:");
                    String date = scanner.nextLine();
                    transactionData.setDate(date);

                    System.out.println("Please enter transaction type, withdrawal or deposit:");
                    String transactionType = scanner.nextLine();
                    transactionData.setTransactionType(transactionType);

                    System.out.println("Please enter transaction description:");
                    String transactionDescription = scanner.nextLine();
                    transactionData.setDescription(transactionDescription);

                    System.out.println("Please enter amount:");
                    double amount = scanner.nextDouble();
                    transactionData.setAmount(amount);

                    bankSys.addTransaction(transactionData);

                    break;

                case 4:
                    System.out.println();
                    bankSys.listAllTransactions();
                    break;

                case 5:
                    System.out.println();
                    bankSys.listAllAccounts();
                    break;

                case 6:
                    customerDetails customersData = new customerDetails();

                    System.out.println("To update customer info: ");
                    System.out.println("Enter customer ID");
                    int customerId = scanner.nextInt();
                    scanner.nextLine();
                    customersData.setCustomerID(customerId);

                    System.out.println("Enter customer name");
                    String name = scanner.nextLine();
                    customersData.setName(name);

                    System.out.println("Enter contact info");
                    String contactInfo = scanner.nextLine();
                    customersData.setContactInfo(contactInfo);

                    bankSys.manageCustomerInfo(customersData);
                    break;

                case 7:
                    System.out.println("Please enter the name of the account to be deleted: ");
                    String accountRemove = scanner.nextLine();

                    bankSys.deleteAccount(accountRemove);
                    break;
                case 8:
                    System.out.println("Exiting. Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.\n");
                    break;
            }

        }


    }
}