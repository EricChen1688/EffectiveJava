package com.eric.example.example1;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Chen 2018/2/23
 */
public class Services {
    private Services(){}

    private static final Map<String,Provider> providers = new ConcurrentHashMap<String, Provider>();

    public static final String DEFAULT_PROVODER_NAME = "<def>";

    public static void registerDefaultProvider(Provider p){
        registerProvider(DEFAULT_PROVODER_NAME,p);
    }

    public static void registerProvider(String name,Provider p){
        providers.put(name,p);
    }

    public static Service newInstance(){
        return newInstance(DEFAULT_PROVODER_NAME);
    }
    public static Service newInstance(String name){
        Provider p = providers.get(name);
        if (p == null)
            throw new IllegalArgumentException("");
        return p.newService();
    }
}
