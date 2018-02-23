package com.eric.example.example1;

/**
 * @author Chen 2018/2/23
 */
public class PhoneProvider implements Provider {
    static {
        ServiceManager.registerProvider("phone",new PhoneProvider());
    }

    @Override
    public Service newService() {
        return new PhoneService();
    }
}
