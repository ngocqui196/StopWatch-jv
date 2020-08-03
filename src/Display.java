
public class Display {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        long sum = 0;
        System.out.println(stopWatch.start());
        for (long i = 0; i < 1000000000; i++) {
            sum+=i;
        }
        System.out.println(stopWatch.stop());
        System.out.println(stopWatch.getElapsedTime());
    }
}
