package studikasus3;

public class SalesPerson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    public SalesPerson(String first, String last, int sales){
        this.firstName = first;
        this.lastName = last;
        this.totalSales = sales;
    }   

    public boolean equals(Object other){
        return (lastName.equals(((SalesPerson)other).getLastName()) && firstName.equals(((SalesPerson)other).getFirstName()));
    }

    @Override
    public int compareTo(Object obj) {
        if (obj instanceof SalesPerson) {
            SalesPerson other = (SalesPerson) obj;
            return Integer.compare(this.totalSales, other.getTotalSales());
        } else {
            throw new ClassCastException("Invalid object type for comparison");
        }
    }
    

    @Override
    public String toString() {
        return firstName + " " + lastName + ": " + totalSales;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }
}
