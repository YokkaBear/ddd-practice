package entity;

import vo.Account;
import vo.IdentityCard;
import vo.StudentCard;
import vo.WorkerCard;

public class People {
    private Account account;
    private IdentityCard identityCard;
    private StudentCard studentCard;
    private WorkerCard workerCard;

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setIdentityCard(IdentityCard identityCard) {
        this.identityCard = identityCard;
    }

    public void setStudentCard(StudentCard studentCard) {
        this.studentCard = studentCard;
    }

    public void setWorkerCard(WorkerCard workerCard) {
        this.workerCard = workerCard;
    }

    public Account getAccount() {
        return account;
    }

    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    public StudentCard getStudentCard() {
        return studentCard;
    }

    public WorkerCard getWorkerCard() {
        return workerCard;
    }

    // 学习
    public void study() {
        System.out.println(studentCard + " is studying");
    }

    // 考试
    public void exam() {
        System.out.println(studentCard + " is taking an exam");
    }

    // 吃饭
    public void eat() {
        System.out.println(identityCard + " is eating");
        this.account.setBalance(this.account.getBalance() - 1);
    }

    // 睡觉
    public void sleep() {
        System.out.println(identityCard + " is sleeping");
    }

    // 打游戏
    public void play() {
        System.out.println(identityCard + " is playing games");
    }

    // 上班
    public void work() {
        System.out.println(workerCard + " is working");
    }

    // 下班
    public void offWork() {
        System.out.println(workerCard + " is getting off work");
    }

    // 购票
    public void buyTicket() {
        System.out.println(identityCard + " is buying a ticket");
        this.account.setBalance(this.account.getBalance() - 1);
    }

    // 游玩
    public void enjoy() {
        System.out.println(identityCard + " is enjoying");
        this.account.setBalance(this.account.getBalance() - 1);
    }





}
