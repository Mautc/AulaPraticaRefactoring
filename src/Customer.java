import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer (String name){
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName (){
        return _name;
    }

    // NOVO MÉTODO: Retorna a lista de aluguéis para a classe Statement acessar
    public Enumeration getRentals() {
        return _rentals.elements();
    }

    // MÉTODO DELEGADO: Apenas chama a nova classe TextStatement
    public String statement() {
        return new TextStatement().value(this);
    }

    // MÉTODO DELEGADO: Apenas chama a nova classe HtmlStatement
    public String htmlStatement() {
        return new HtmlStatement().value(this);
    }

    // MUDANÇA: MÉTODO AGORA É PÚBLICO
    public double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    // MUDANÇA: MÉTODO AGORA É PÚBLICO
    public int getTotalFrequentRenterPoints(){
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}