package com.smart.router.router;

/**
 * Interface that help to generate param class.
 * <p>
 * Created by Harry.Kong.
 */
public interface ParamInjector {
    /**
     * Inject params.
     *
     * @param obj Activity or fragment instance.
     */
    void inject(Object obj);
}
