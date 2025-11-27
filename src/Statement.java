import java.util.Enumeration;

public abstract class Statement {

    // MÉTODO TEMPLATE CONCRETO (final)
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = headerString(aCustomer);

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for this rental
            result += rentalFigure(each);
        }

        result += footerString(aCustomer);
        return result;
    }

    // Métodos abstratos para formatação específica
    protected abstract String headerString(Customer aCustomer);
    protected abstract String rentalFigure(Rental aRental);
    protected abstract String footerString(Customer aCustomer);
}