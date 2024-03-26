import aggregate.Home;
import aggregate.School;
import entity.People;
import vo.Account;
import vo.IdentityCard;
import vo.StudentCard;
import vo.WorkerCard;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* new People */
        People paul = new People();

        // set identityCard
        IdentityCard identityCard = new IdentityCard();
        identityCard.setId(222333444);
        identityCard.setName("Paul");
        paul.setIdentityCard(identityCard);

        // set account
        Account account = new Account();
        account.setId(56789);
        account.setBalance(30000);
        paul.setAccount(account);


        /* new school */
        School mit = new School();
        mit.setName("MIT");
        mit.setStudents(new ArrayList<>());

        /* new home */
        Home home = new Home();

        /* ddd actions */
        // 上学
        mit.receive(paul);
        mit.run();
        System.out.println("current balance is " + paul.getAccount().getBalance());

        // 回家
        home.comeBack(paul);
        home.run();

        // TODO: 工作

        // TODO: 公园游玩
    }
}
