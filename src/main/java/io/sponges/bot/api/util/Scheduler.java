package io.sponges.bot.api.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Façade utility class for simplifying scheduling tasks
 *
 * @since 0.1.0
 * @author 1Rogue
 * @version 0.1.0
 */
public final class Scheduler {

    private static final List<ScheduledFuture<?>> executives = new ArrayList<>(); //TODO implement a cache pattern
    private static ScheduledExecutorService es;

    private Scheduler() {
    }

    /**
     * Runs a repeating asynchronous task
     * 
     * @since 0.1.0
     * @version 0.1.0
     * 
     * @param r The runnable to execute
     * @param startAfter Time (in seconds) to wait before execution
     * @param delay Time (in seconds) between execution to wait
     * @return The scheduled Task
     */
    public static ScheduledFuture<?> runAsyncTaskRepeat(Runnable r, long startAfter, long delay, TimeUnit timeUnit) {
        ScheduledFuture<?> sch = Scheduler.getService().scheduleWithFixedDelay(r, startAfter, delay, timeUnit);
        Scheduler.executives.add(sch);
        return sch;
    }

    /**
     * Runs a single asynchronous task
     * 
     * @since 0.1.0
     * @version 0.1.0
     * 
     * @param r The runnable to execute
     * @param delay Time (in seconds) to wait before execution
     * @return The scheduled Task
     */
    public static ScheduledFuture<?> runAsyncTask(Runnable r, long delay, TimeUnit timeUnit) {
        ScheduledFuture<?> sch = Scheduler.getService().schedule(r, delay, timeUnit);
        Scheduler.executives.add(sch);
        return sch;
    }

    /**
     * Immediately runs a single asynchronous task
     * 
     * @since 0.1.0
     * @version 0.1.0
     * 
     * @param r The runnable to execute
     * @return The scheduled Task
     */
    public static ScheduledFuture<?> runAsyncTask(Runnable r) {
        return Scheduler.runAsyncTask(r, 0, TimeUnit.SECONDS);
    }
    
    /**
     * Runs a Callable
     * 
     * @since 0.1.0
     * @version 0.1.0
     * 
     * @param <T> The return type of the {@link Callable}
     * @param c The callable to execute
     * @param delay Time (in seconds) to wait before execution
     * @return The scheduled Task
     */
    public static <T> ScheduledFuture<T> runCallable(Callable<T> c, long delay, TimeUnit timeUnit) {
        ScheduledFuture<T> sch = Scheduler.getService().schedule(c, delay, timeUnit);
        Scheduler.executives.add(sch);
        return sch;
    }
    
    /**
     * Cancels all running tasks/threads and clears the cached queue.
     * 
     * @since 0.1.0
     * @version 0.1.0
     */
    public static void cancelAllTasks() {
        Scheduler.executives.forEach(s -> s.cancel(false));
        Scheduler.executives.clear();
        try {
            Scheduler.getService().awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Returns the underlying {@link ScheduledExecutorService} used for this
     * utility class
     * 
     * @since 0.1.0
     * @version 0.1.0
     * 
     * @return The underlying {@link ScheduledExecutorService}
     */
    public static ScheduledExecutorService getService() {
        if (Scheduler.es == null || Scheduler.es.isShutdown()) {
            Scheduler.es = Executors.newScheduledThreadPool(10); //Going to find an expanding solution to this soon
        }
        return Scheduler.es;
    }

}