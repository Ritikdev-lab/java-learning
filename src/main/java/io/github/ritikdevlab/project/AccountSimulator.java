package io.github.ritikdevlab.project;
public class AccountSimulator {
    public static void main(String[] args) {
        //Create a Variable to store the information so it can be used in all places
        int numbers = 0;
        Operation[] Ac = null;
        while(true) {
            String command = IO.readln("What you want to do in the account (Create , Check, Deposit , Withdraw , Change , Delete ,Exit):- ");
            switch (command.toLowerCase()) {
                //Get the user input for number of accounts, its details and store it inside the array
                case "create" -> {
                    int numbersOfAccount = Integer.parseInt(IO.readln("Give the number of account you want to create:- "));
                    Operation[] ac = new Operation[numbersOfAccount];
                    for(int i = 0; i < numbersOfAccount; i++) {
                        String name = IO.readln("User Name:- ");
                        int accountNumber = Integer.parseInt(IO.readln("User AC Number:- "));
                        double initialDeposit = Double.parseDouble(IO.readln("User initial deposit:- "));
                        ac[i] = new Operation(name, accountNumber, initialDeposit);   
                    }
                    Ac = ac;
                    numbers = numbersOfAccount; 
                } 
                //Check all User BalanceSheet if "Yes" if "No" return Okey if else then return Invalid input                  
                case "check" -> {
                    String checkBalance = IO.readln("Do you want to check balance ( Yes / No ):- ");
                    if (checkBalance.equalsIgnoreCase("Yes") && Ac != null) {
                        for (int i = 0; i < numbers; i++) {
                            IO.println("Found-> Name:- " + Ac[i].giveName() + " Account Number:- " + Ac[i].getAccountNumber() + " Balance:- " + Ac[i].getInitialDeposit());

                        }
                    }
                    else if (checkBalance.equalsIgnoreCase("Yes") && Ac == null) {
                    IO.println("Account not found");
                    }
                    else if(checkBalance.equalsIgnoreCase("No")) {
                    IO.println("Okay");
                    }
                    else {
                        IO.println("Invalid input");
                    }
                }
                //Here we will deposit the money in the account and we will ask the user to give the account number and then we will search for that account number in the array and if we found that account number we will ask the user how much they want to deposit and then we will call the deposit method of the Operation class and we will pass the amount to be deposited as a parameter and if we don't find that account number we will print "Account not found"
                case "deposit" -> {
                    int accountNb = Integer.parseInt(IO.readln("Give the account number:- ")); 
                    boolean found = false;                   
                    for (int i = 0; i < numbers; i++) {
                        if (Ac[i] != null && Ac[i].searchAccountNumber() == accountNb) {
                            IO.println("Found-> Name:- " + Ac[i].giveName() + " Account Number:- " + Ac[i].getAccountNumber() + " Balance:- " + Ac[i].getInitialDeposit());
                            double add = Double.parseDouble(IO.readln("How much you want to deposit:-"));
                            Ac[i].deposit(add);
                            found = true;
                            break;
                        }
                    }
                    if(!found) {
                        IO.println("Account not found");
                    }
                }
                //Here we will withdraw the money from the account and we will ask the user to give the account number and then we will search for that account number in the array and if we found that account number we will ask the user how much they want to withdraw and then we will call the withdraw method of the Operation class and we will pass the amount to be withdrawn as a parameter and if we don't find that account number we will print "Account not found"
                case "withdraw" -> {
                    int accountNb = Integer.parseInt(IO.readln("Give the account number:- "));
                    boolean fnd = false;
                    for(int i = 0; i < numbers; i++) {    
                        if (Ac[i] != null && Ac[i].searchAccountNumber() == accountNb) {
                            IO.println("Found-> Name:- " + Ac[i].giveName() + " Account Number:- " + Ac[i].getAccountNumber() + " Balance:- " + Ac[i].getInitialDeposit());
                            double minus = Double.parseDouble(IO.readln("How much you want to withdraw:-"));
                            Ac[i].withdraw(minus);
                            fnd = true;
                            break;
                        }
                    }
                    if(!fnd){
                        IO.println("Account not found");
                    }
                }
                //Here we will change the name or account number of the account and we will ask the user to give the account number and then we will search for that account number in the array and if we found that account number we will ask the user what they want to change (Name or Account Number) and then we will ask the user to give the new name or new account number and then we will create a new object of the Operation class with the new name or new account number and we will assign that object to the index of the array where we found the account number and if we don't find that account number we will print "Account not found"
                case "change" -> {
                    String changeInfo = IO.readln("What you want to change (Name / Account Number):- ");
                    if (changeInfo.equalsIgnoreCase("Name")) {
                        int accountNb = Integer.parseInt(IO.readln("Give the account number:- "));
                        boolean found = false;
                        for(int i = 0; i < numbers; i++) {    
                            if (Ac[i] != null && Ac[i].searchAccountNumber() == accountNb) {
                                IO.println("Found-> Name:- " + Ac[i].giveName() + " Account Number:- " + Ac[i].getAccountNumber() + " Balance:- " + Ac[i].getInitialDeposit());
                                String newName = IO.readln("Give the new name:- ");
                                Ac[i] = new Operation(newName, Ac[i].getAccountNumber(), Ac[i].getInitialDeposit());
                                found = true;
                                break;
                            }
                        }
                        if(!found){
                            IO.println("Account not found");
                        }
                    }
                    else if (changeInfo.equalsIgnoreCase("Account Number")) {
                        int accountNb = Integer.parseInt(IO.readln("Give the account number:- "));
                        boolean found = false;
                        for(int i = 0; i < numbers; i++) {    
                            if (Ac[i] != null && Ac[i].searchAccountNumber() == accountNb) {
                                IO.println("Found-> Name:- " + Ac[i].giveName() + " Account Number:- " + Ac[i].getAccountNumber() + " Balance:- " + Ac[i].getInitialDeposit());
                                int newAccountNb = Integer.parseInt(IO.readln("Give the new account number:- "));
                                Ac[i] = new Operation(Ac[i].giveName(), newAccountNb, Ac[i].getInitialDeposit());
                                found = true;
                                break;
                            }
                        }
                        if(!found){
                            IO.println("Account not found");
                        }
                    }
                    else {
                        IO.println("Invalid input");
                    }
                }
                //Here we will delete the account and we will ask the user to give the account number and then we will search for that account number in the array and if we found that account number we will set that index of the array to null and if we don't find that account number we will print "Account not found"
                case "delete" -> {
                    int accountNb = Integer.parseInt(IO.readln("Give the account number:- "));
                    boolean found = false;
                    for(int i = 0; i < numbers; i++) {    
                        if (Ac[i] != null && Ac[i].searchAccountNumber() == accountNb) {
                            IO.println("Found-> Name:- " + Ac[i].giveName() + " Account Number:- " + Ac[i].getAccountNumber() + " Balance:- " + Ac[i].getInitialDeposit());
                            Ac[i] = null;
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        IO.println("Account not found");
                    }
                }
                //Here we will exit the program and we will print a goodbye message and then we will return from the main method to exit the program
                case "exit" -> {
                    IO.println("Exiting the program. Goodbye!");
                    return;
                }
                //Here we will handle the invalid command and we will print "Invalid command. Please try again." if the user gives an invalid command
                default -> {
                    IO.println("Invalid command. Please try again.");
                }
            }           
            //We write it outside the switch statement because if we write it beatween the cases because the switch statement will not work properly
            //Here we will print the balance statement after each operation
            IO.println("-".repeat(40));

            IO.println("The balance statement is:- ");

            if (Ac != null) {
                for (int i =0; i < numbers; i++) {
                    //Here it checks if the account is not null because if the account is null then it means that the account is deleted and we don't want to print the balance statement of the deleted account
                    if (Ac[i] != null) {
                        IO.println("Name: " + Ac[i].giveName() + ", Account Number: " + Ac[i].getAccountNumber() + ", Balance: " + Ac[i].getInitialDeposit());
                    }
                }   
            }
            else {
                IO.println("Account not found");
            }

            IO.println("-".repeat(40));      
        }                                       
    }           
}

/**
 * {@literal Represents a simple bank account and provides operation
 * for depositing and withdrawing money}
 * 
 * <p><head>Note:</head>There are 4 type of accessor method and
 * 2 type of mutator method.
 * 
 * <p><head>Accessor method:</head>
 * 
 * <ul>
 *     <li>{@code giveName()}:Give the account holder name</li>
 *     <li>{@code searchAccountNumber()}:Give the account number</li>
 *     <li>{@code getInitialDeposit()}:Give the initial deposit of the account holder</li>
 * </ul>
 * 
 * <p><head>mutator method</head>
 * <ul>
 *     <li>{@code deposit(double add)}:Add the amount to the initial deposit</li>
 *     <li>{@code withdraw(double minus)}:Subtract the amount from the initial deposit</li>
 * </ul>
 * 
 * <p><head>Example:</head>
 * <pre>{@code Operation op = new Operation("Ritik",121,2000);
 *       op.giveName();
 *       op.getAccountNumber();
 *       op.deposit(1200);
 *       op.withdraw(120);
 *       }
 * @since 1.0
 * @author Ritikdev-lab
 */
class Operation {
    private final String Name;
    private final int accountNumber;
    private double initialDeposit;
    /**
     * Create a new account
     * 
     * @param N the account holder's name
     * @param a the account number
     * @param i the initial account balance
     */
    Operation (String N , int a, double i) {
        this.Name = N;
        this.accountNumber = a;
        this.initialDeposit = i;
    }
    /**
     * {@return the account holder's name}
     */
    public String giveName() {
        return this.Name;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }
    /**
     * Search Account number
     * 
     * @return account number
     */
    public int searchAccountNumber() {
        return this.accountNumber;
    }
    /**
     * {@return current account balance}
     */
    public double getInitialDeposit() {
        return this.initialDeposit;
    }
    /**
     * Deposit money into the account.
     * 
     * @param add the amount to deposit
     */
    public void deposit(double add) {
        this.initialDeposit += add;
    }
    /**
     * Withdraws money from the account.
     * 
     * @param minus the amount to withdraw
     */
    public void withdraw(double minus) {
        this.initialDeposit -= minus;
    }
}