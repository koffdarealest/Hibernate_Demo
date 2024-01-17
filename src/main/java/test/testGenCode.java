package test;

import java.util.UUID;

public class testGenCode {
    public static String generateTransactionCode() {
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString().replace("-", "");
        return randomUUIDString.substring(0,15);
    }

    public static void main(String[] args) {
        System.out.println(generateTransactionCode());
    }
}
