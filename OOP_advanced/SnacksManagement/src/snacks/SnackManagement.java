

public class SnackManagement <E> {
    private Map<E> snackDatabase;

    public SnackManagement() {
        this.snackDatabase = new HashMap<>();
    }

    public void addSnack(final E snack) {
        this.snackDatabase.put(Map.hashCode(), snack);
    }

    public double getSnackBelowPrice() throws SnackNotFoundException {
        return this.snackDatabase.stream()
            .values()
            .mapToDouble(n -> n.getSnackPrice())
            .min(Comparator.comparing(n -> n.getSanckPrice()))
            .orElseThrow(new SnackNotFoundException());
    }

    public String getSnackByNamePrefix(final String namePrefix) throws SnackNotFoundException {
        return this.snackDatabase.stream()
            .values()
            .map(n -> n.getSnackName())
            .filter(n -> n.charAt(2))
            .findAny()
            .orElseThrow(new SnackNotFoundException());
    }

    public String getSnackbyProducerName(final String producerName) throws SnackNotFoundException {
        return this.snackDatabase.stream()
            .values()
            .map(n -> n.getSnackProducer())
            .filter(n -> n.equals(producerName))
            .findAny()
            .orElseThrow(new SnackNotFoundException());
    }
}
