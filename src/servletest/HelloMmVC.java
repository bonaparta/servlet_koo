package servletest;

import java.util.*;

public class HelloMmVC {
    private Map<String, String> messages;
    
    public HelloMmVC() {
        messages = new HashMap<String, String>();
        messages.put("caterpillar", "Hello");
        messages.put("Justin", "Welcome");
        messages.put("momor", "Hi");
    }

    public String doHello(String user) {
        String message = messages.get(user);
        return message + ", " + user + "!";
    }
}