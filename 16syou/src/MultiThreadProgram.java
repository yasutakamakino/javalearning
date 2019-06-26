/**
 * 問題16-10　マルチスレッド①
 * <pre>{@code
 * public class SingleThreadProgram {
 *      Job[] jobs;
 *      public SingleThreadProgram(int jobcount) {
 *          jobs = new Job[jobcount];
 *          for (int i = 0; i < jobcount; i++) {
 *              jobs[i] = new Job(i);
 *          }
 *      }
 * <p>
 *      public void workAllJobs() {
 *          for (int i=0; i < jobs.length; i++) {
 *              jobs[i].work();
 *           }
 *      }
 * <p>
 *      public static void main(String[] args) {
 *      public static void main(String[] args) {
 *          SingleThreadProgram self = new SingleThreadProgram(10);
 *          while (true) {
 *              self.workAllJobs();
 *          }
 *      }
 * }
 * }</pre>
 */
class JobThread extends Thread {
    Job job;

    public JobThread(int n) {
        job = new Job(n);
    }

    @Override
    public void run() {
        while (true) {
            job.work();
        }
    }
}

public class MultiThreadProgram {
    //Jobのクラスを10かいマワス
    public MultiThreadProgram(int jobcount) {
        for (int i = 0; i < jobcount; i++) {
            new JobThread(i).start();
        }
    }

    //minメソッド
    public static void main(String[] args) {
        new MultiThreadProgram(10);
    }
}
