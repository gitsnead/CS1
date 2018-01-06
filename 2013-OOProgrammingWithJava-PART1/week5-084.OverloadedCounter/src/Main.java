public class Main {
    public static void main(String[] args) {
        // write testcode here
        
        //starts at zero.
        Counter noFloor = new Counter();
        noFloor.decrease(5);
        noFloor.printValue();
        noFloor.increase();
        noFloor.printValue();
        Counter Floor = new Counter(noFloor.value(), true);
        Floor.printValue();
        Floor.increase(10);
        Floor.printValue();
        Floor.decrease();
        Floor.printValue();
        Floor.decrease(10);
        Floor.printValue();
        Counter c = new Counter(2, true);
        c.decrease();
        c.decrease();
        c.printValue();
    }
}
