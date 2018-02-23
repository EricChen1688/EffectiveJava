package com.eric.example.example1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 服务提供者注册
 * @author Chen 2018/2/23
 */
public class ServiceManager {
    private ServiceManager(){

    }

    private static final Map<String,Provider> providers = new ConcurrentHashMap<String, Provider>();
    public static final String DEFAULT_PROVODER_NAME = "def";


    public static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    public static void registerProvider(Provider provider){
        providers.put(DEFAULT_PROVODER_NAME, provider);
    }

    public static Service getService() {
        return getService(DEFAULT_PROVODER_NAME);
    }

    public static Service getService(String name) {
        Provider p = providers.get(name);
        if (p == null) {
            throw new IllegalArgumentException(
                    "No provider registered with name:" + name);
        }
        return p.newService();

    }
}
