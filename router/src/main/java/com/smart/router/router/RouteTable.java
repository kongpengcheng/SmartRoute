package com.smart.router.router;

import java.util.Map;

/**
 * Route table mapping.
 * <p>
 * Created by Harry.Kong.
 */
public interface RouteTable {
    /**
     * Mapping between uri and target, the target class may be an {@link android.app.Activity},
     * {@link android.app.Fragment} or {@link android.support.v4.app.Fragment}.
     *
     * @param map uri -> target.
     */
    void handle(Map<String, Class<?>> map);
}
