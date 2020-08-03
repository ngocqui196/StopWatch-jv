public class StopWatch {
    private long startTime;
    private long stopTime;

    public long start() {
       return this.startTime = System.currentTimeMillis();

    }

    public long stop() {
       return this.stopTime = System.currentTimeMillis();

    }
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    //elaspsed time in milliseconds
    public long getElapsedTime() {
       return this.stopTime - this.startTime;
    }



}

