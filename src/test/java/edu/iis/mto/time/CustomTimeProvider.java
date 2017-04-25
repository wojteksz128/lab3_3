package edu.iis.mto.time;

/**
 * Created by Wojciech Szczepaniak on 25.04.2017.
 */
public class CustomTimeProvider implements TimeProvider {

    private long SECONDS_MULTIPLIER = 1000;
    private long MINUTES_MULTIPLIER = 60 * SECONDS_MULTIPLIER;
    private long HOURS_MULTIPLIER = 60 * MINUTES_MULTIPLIER;

    private long millisecondsAdded;
    private long secondsAdded;
    private long minutesAdded;
    private long hoursAdded;

    public CustomTimeProvider() {
        this.millisecondsAdded = 0;
        this.secondsAdded = 0;
        this.minutesAdded = 0;
        this.hoursAdded = 0;
    }

    public CustomTimeProvider addMilliseconds(long value) {
        this.millisecondsAdded += value;

        return this;
    }

    public CustomTimeProvider addSeconds(long value) {
        this.secondsAdded += value;

        return this;
    }

    public CustomTimeProvider addMinutes(long value) {
        this.minutesAdded += value;

        return this;
    }

    public CustomTimeProvider addHours(long value) {
        this.hoursAdded += value;

        return this;
    }

    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis() + millisecondsAdded
                + secondsAdded * SECONDS_MULTIPLIER
                + minutesAdded * MINUTES_MULTIPLIER
                + hoursAdded * HOURS_MULTIPLIER;
    }
}
