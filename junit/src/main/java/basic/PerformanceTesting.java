package java_collections_streams.junit.src.main.java.basic;

public class PerformanceTesting {
    public static String longRunningTask(){
         try {
             Thread.sleep(3000);
         }catch (InterruptedException e){
             Thread.currentThread().interrupt();
         }
         return "Task Completed";
    }
}
