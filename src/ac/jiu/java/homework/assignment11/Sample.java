package ac.jiu.java.homework.assignment11;

public class Sample {
    public static void main(String[] args) {


        Tiger tiger = new Tiger();
        Lion lion = new Lion();


        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}
