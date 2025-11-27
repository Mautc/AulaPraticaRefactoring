public abstract class Price {
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    // NOVO MÉTODO EXTRAÍDO E MOVIDO
    public int getFrequentRenterPoints(int daysRented) {
        int frequentRenterPoints = 1;

        if ((getPriceCode() == Movie.NEW_RELEASE) &&
                daysRented > 1) {
            frequentRenterPoints ++;
        }
        return frequentRenterPoints;
    }
}