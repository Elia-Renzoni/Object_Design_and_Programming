
public class RiceSnack implements Snack {
    private final int snackId;
    private final String snackName;
    private final String snackProducer;
    private final double snackPrice;

    public RiceSnack(final String snackName, final String snackProducer, final double snackPrice) {
        this.snackId = new Random().nextInt();
        this.snackName = snackName;
        this.snackProducer = snackProducer;
        this.snackPrice = snackPrice;
    }

    public int getSnackId() {
        return this.snackId;
    }

    public String getSnackName() {
        return this.snackName;
    }

    public double getSanckPrice() {
        return this.snackPrice;
    }

    public String getSnackProducer() {
        return this.snackProducer;
    }
}
