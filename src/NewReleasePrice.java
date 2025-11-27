public class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    // IMPLEMENTAÇÃO ESPECÍFICA PARA LANÇAMENTO
    public double getCharge(int daysRented){
        return daysRented * 3;
    }
}