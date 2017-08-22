package Account;

/**
 * Created by RENT on 2017-08-21.
 */
public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("1", "KKK", 1234);
        Account acc2 = new Account("2", "KKK3", 12);
        acc1.transferTo(acc2, 45);
        System.out.println(acc2.getBalance());
        System.out.println(acc1.getBalance());

    }
}
