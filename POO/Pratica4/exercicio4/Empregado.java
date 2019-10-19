public abstract class Empregado {
    private String name;
    public Empregado(String name) {
        this.name = name;
    }
    public void printPay() {
        System.out.printf("%10s: ganha %8.2f \n", name,getPay());
    }

    public abstract double getPay();
}