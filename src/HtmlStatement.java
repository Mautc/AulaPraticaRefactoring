public class HtmlStatement extends Statement {

    // Implementação do cabeçalho
    protected String headerString(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
                "</EM></H1><P>\n";
    }

    // Implementação da linha de aluguel
    protected String rentalFigure(Rental aRental) {
        return aRental.getMovie().getTitle()+ ": " +
                String.valueOf(aRental.getCharge()) + "<BR>\n";
    }

    // Implementação do rodapé
    protected String footerString(Customer aCustomer) {
        String result = "<P>You owe <EM>" +
                String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
        return result;
    }
}