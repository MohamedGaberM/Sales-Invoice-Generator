package salesProgram;

import salesProgram.view.InvoiceAction;
import salesProgram.view.MainMenuOfOptions;
import static salesProgram.controller.InvoiceController.ShowAllInvoices;

public class Main {
    public static void main(String[] args) {
        runSalesInvoiceApplication();
    }

    public static void runSalesInvoiceApplication() {
        MainMenuOfOptions mainMenuOfOptions = new MainMenuOfOptions();
        InvoiceAction invoiceAction = new InvoiceAction();
        mainMenuOfOptions.menuOfOptions();
        switch (mainMenuOfOptions.getSelectedOption()) {
            case 1 -> ShowAllInvoices(true);
            case 2 -> invoiceAction.addNewInvoice();
            case 3 -> invoiceAction.addItemToStoredInvoice();
            case 4 -> invoiceAction.openSpecificInvoice();
            case 5 -> invoiceAction.deleteInvoice();
            case 6 -> System.exit(0);
        }
    }
}