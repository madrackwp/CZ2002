public class SalePerson implements Comparable<SalePerson> {
    private String firstName, lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String toString() {
        return this.firstName + ", " + this.lastName + ": " + this.totalSales;
    }

    public boolean equals(SalePerson salePerson) {
        if (salePerson.firstName == this.firstName && salePerson.lastName == this.lastName) {
            return true;
        }
        return false;
    }

    public int compareTo(SalePerson salePerson) {
        if (salePerson.totalSales > this.totalSales) {
            return -1;
        } else if (salePerson.totalSales < this.totalSales) {
            return 1;
        } else { // total sales is a tie
            if (this.lastName.compareTo(salePerson.lastName) > 0) {
                return -1;
            } else {
                return 1;
            }
        }

    }

}
