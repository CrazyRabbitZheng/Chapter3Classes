/**
 * This class simulates a hardware store
 */
public class Invoice {
    private String partNumber;
    private String description;
    private int quantityBought;
    private double price;

    public Invoice(String partNumber, String description, int quantityBought, double price) {
        this.partNumber = partNumber;
        this.description = description;
        if (quantityBought > 0){
            this.quantityBought = quantityBought;
        }
        if (price > 0){
            this.price = price;
        }
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityBought() {
        return quantityBought;
    }

    public void setQuantityBought(int quantityBought) {
        this.quantityBought = quantityBought;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInvoiceAmount(int quantity, double price){
        return quantity * price;
    }
}
