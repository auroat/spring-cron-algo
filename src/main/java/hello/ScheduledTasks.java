/*
 * Copyright 2019 Wenofame.
 *
 */

package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class has the reportCurrentTime() method, which schedules a task for every hour, thanks to the @Scheduled
 * annotation.
 *
 * @author Aurel Pintea
 */

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * The top of every hour of every day.
     * <p>
     * Source:
     * https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/scheduling/support/CronSequenceGenerator.html
     */
//    Every hour.
//    @Scheduled(cron = "0 0 * * * *")

//    Every minute.
    @Scheduled(cron = "0 * * * * *")
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}
