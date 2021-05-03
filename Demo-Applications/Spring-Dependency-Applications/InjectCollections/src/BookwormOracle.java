public class BookwormOracle implements Oracle {

    private Encyclopedia enc;

    public void setEncyclopedia(Encyclopedia enc) {
        this.enc = enc;
    }

    public String defineMeaningOfLife() {
        return "Encyclopedia's are a waste of money - use the Internet";
    }

}

