import java.util.ArrayList;

public class bankSystem {
    private ArrayList<accountDetails> account = new ArrayList<>();
    private ArrayList<customerDetails> customersDets = new ArrayList<>();

    private ArrayList<transactionDetails> transactionDets = new ArrayList<>();

    public void createAccount(accountDetails details){
        account.add(details);
    }

    public accountDetails findAccount(String accountName){
        for (accountDetails details: account) {
            if (details.getAccountName().equals(accountName)) {
                return details;
            }
        }
        return null;
    }

    public void addTransaction(transactionDetails transactionData){
        transactionDets.add(transactionData);

    }

    public void listAllTransactions(){
        for (transactionDetails transactionData: transactionDets){
            System.out.println("Transaction Id: " +transactionData.getTransactionID() +
                    ", Date: "+ transactionData.getDate() + ", Amount: " + transactionData.getAmount() +
                    ", Transaction type: " + transactionData.getTransactionType() +
                    ", Transaction description: " + transactionData.getDescription());
        }
    }
    public void manageCustomerInfo(customerDetails customersData) {
        customersDets.add(customersData);
    }

    public void listAllAccounts() {
        for (accountDetails details : account) {
            System.out.println("Account Number: " + details.getAccountNumber() +
                    ", Customer Name: " + details.getAccountName()+
                    ", Balance: " + details.getAccountBalance() +
                    ", Account Type: " + details.getAccountType());
        }
    }

    public void deleteAccount(String accountName){
        accountDetails details = findAccount(accountName);
        if (details == null){
            System.out.println("The account with name" + accountName + " does not exist");
            return;
        }
        account.remove(details);
    }

}

