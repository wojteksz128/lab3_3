package edu.iis.mto.time.timeprovider;

/**
 * Created by Wojciech Szczepaniak on 25.04.2017.
 */
public class RealTimeProvider implements TimeProvider {

    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
