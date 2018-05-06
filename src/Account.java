public class Account {
    private long id;
    private double balance;
    private String password;
    private static long incId;
    static {
        incId = 0;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public Account(double balance, String password) {
        this.id = ++incId;
        this.balance = balance;
        this.password = password;
    }

    public Account() {
    }


}
