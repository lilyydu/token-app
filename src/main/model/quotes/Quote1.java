package model.quotes;

public class Quote1 implements Quotes, Authors {
    String quote;
    Boolean status;
    String author;


    public Quote1() {
        this.quote = "When we seek to discover the best in others,"
                + "we somehow bring out the best in ourselves";
        this.status = false;
    }

    @Override
    public Boolean setFavourite() {
        return false;
    }

    // getters
    public String getQuote() {
        return quote;
    }

    public Boolean getStatus() {
        return status;
    }

    public String getAuthor() {
        return this.author;
    }

}