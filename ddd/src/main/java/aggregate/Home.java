package aggregate;

import entity.People;

public class Home {
    private People me;

    public void setMe(People me) {
        this.me = me;
    }

    public People getMe() {
        return me;
    }

    public void comeBack(People people) {
        System.out.println(people.getIdentityCard() + " come back home.");
        this.me = people;
    }

    public void run() {
        this.me.eat();
        this.me.play();
        this.me.sleep();
    }
}
