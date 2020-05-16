package hw1;

public class Treadmill implements Obstruction {
    int dist;

    public Treadmill(int dist) {
        this.dist = dist;
    }

    public void tryIt(Competitors c) {
        c.run(dist);
    }
}
