package com.eric.example.example1;

/**
 * @author Chen 2018/2/23
 */
public class CardProvider implements Provider {
    static {
        ServiceManager.registerProvider("card",new PhoneProvider());
    }
    @Override
    public Service newService() {
        return new CardService();
    }
}
