package Account;

/**
 * @author sakurasep
 * * @date 2024/3/13
 **/
public class AccountTest {
    public static void main(String[] args) {
        AccountTest test = new AccountTest();
        test.console(new CheckAccount());
        test.console(new SaveAccount());

    }
    public void console(Account account){
        account.saveMoney(100);
        account.getMoney(40);

        if (account instanceof CheckAccount){
            CheckAccount check_account = (CheckAccount)account;
            check_account.getQuota();
        }

        if (account instanceof SaveAccount){
            SaveAccount save_account = (SaveAccount)account;
            save_account.getInterest();
            save_account.getRate();
        }

    }

}
class Account {
    String username;
    String password;
    int money; // 余额

    // 存钱
    public void saveMoney(int money) {
        this.money = money;
        System.out.printf("普通账户余额为: %d\n", this.money);
    }

    // 取钱
    public void getMoney(int money) {
        if(money <= this.money) {
            this.money -= money;
            System.out.printf("普通账户余额为: %d\n", this.money);
        }
        else {
            System.out.println("普通账户余额不足");
        }
    }
}

class CheckAccount extends Account {
    int quota = 500; // 额度
    @Override
    public void saveMoney(int money) {
        this.money = money + quota;
        System.out.printf("信用卡账户余额为: %d\n", this.money);
    }

    public void getQuota(){
        System.out.printf("额度是: %d\n", quota);
    }

    // 取钱
    @Override
    public void getMoney(int money)
    {
        if(this.money >= money) {
            this.money -= money;
            System.out.printf("信用卡余额为: %d\n", this.money);
        }
        else {
            System.out.println("信用卡余额不足");
        }
    }

}

class SaveAccount extends Account {
    float money;
    float rate = 0.2F; // 利率
    float interest; // 利息

    @Override
    public void saveMoney(int money) {
        interest = money * rate;
        this.money = money + interest;
        System.out.printf("储蓄卡预期余额为: %f\n", this.money);
    }
    @Override
    public void getMoney(int money) {
        if(this.money - interest > money) {
            this.money -= money;
            System.out.printf("储蓄卡余额为: %f\n", this.money);
        }
        else {
            System.out.println("储蓄卡余额不足");
        }
    }

    public void getRate(){
        System.out.println("利率是: " + rate);
    }

    public void getInterest(){
        System.out.println("利息是: " + interest);
    }
}