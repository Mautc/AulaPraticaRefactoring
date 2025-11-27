import java.util.Enumeration;

public abstract class Statement {

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = headerString(aCustomer);

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for this rental
            result += rentalFigure(each); // Método abstrato
        }

        result += footerString(aCustomer); // Método abstrato
        return result;
    }

    // Métodos abstratos para formatação específica
    protected abstract String headerString(Customer aCustomer);
    protected abstract String rentalFigure(Rental aRental);
    protected abstract String footerString(Customer aCustomer);
}