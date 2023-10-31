import java.util.ArrayList;

public class BankingSystem {
    private ArrayList<Account> account = new ArrayList<>();
    private ArrayList<Customer> customersDets = new ArrayList<>();
    private ArrayList<Transaction> transactionDets = new ArrayList<>();

    public void createAccount(Account details) {
        account.add(details);
    }

    public Account findAccount(String accountName) {
        for (Account details : account) {
            if (details.getAccountName().equals(accountName)) {
                return details;
            }
        }
        return null;
    }

    public void addTransaction(Transaction transactionData) {
        transactionDets.add(transactionData);

    }

    public void listAllTransactions() {
        for (Transaction transactionData : transactionDets) {
            System.out.println("Transaction Id: " + transactionData.getTransactionID() +
                    ", Date: " + transactionData.getDate() + ", Amount: " + transactionData.getAmount() +
                    ", Transaction type: " + transactionData.getTransactionType() +
                    ", Transaction description: " + transactionData.getDescription());
        }
    }

    public void manageCustomerInfo(Customer customersData) {
        customersDets.add(customersData);
    }

    public void listAllAccounts() {
        for (Account details : account) {
            System.out.println("Account Number: " + details.getAccountNumber() +
                    ", Customer Name: " + details.getAccountName() +
                    ", Balance: " + details.getAccountBalance() +
                    ", Account Type: " + details.getAccountType());
        }
    }

    public void deleteAccount(String accountName) {
        Account details = findAccount(accountName);
        if (details == null) {
            System.out.println("The account with name" + accountName + " does not exist");
            return;
        }else {
            System.out.println("Account with name " + accountName + " has been deleted");
        }
        account.remove(details);
    }

}

