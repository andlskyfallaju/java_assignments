public class RetailItem2 {
    private String description;
    private int unitsOnHand;
    private double price;

    public RetailItem2(String descript, int unitsOnHand, double price) {
        if (unitsOnHand < 0) {
            throw new IllegalArgumentException("Units on hand cannot be negative.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        description = descript;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }

    public void setDescription(String descript) {
        description = descript;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        if (unitsOnHand < 0) {
            throw new IllegalArgumentException("Units on hand cannot be negative.");
        }
        this.unitsOnHand = unitsOnHand;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public double getPrice() {
        return price;
    }
}

