package net.command;

public class Client {
    public static void main(String[] args) {

        Account account = new Account("ThanhVan");

        Command openAccount = new OpenAccount(account);
        Command closeAccount = new CloseAccount(account);

        BankApp bankApp = new BankApp(openAccount, closeAccount);

        bankApp.clickOpenAccount();
        bankApp.clickCloseAccount();

    }
}