/**
 * This class plays with Invoice class
 */
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice myInvoice = new Invoice("036","Onion",3,0.92);
        System.out.printf("You bought %d %s %s with the price of $%.2f each, and your total is $%.2f",
                myInvoice.getQuantityBought(),myInvoice.getPartNumber(), myInvoice.getDescription(),myInvoice.getPrice(),myInvoice.getInvoiceAmount(myInvoice.getQuantityBought(), myInvoice.getPrice()));
    }
}
