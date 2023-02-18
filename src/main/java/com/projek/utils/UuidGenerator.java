package com.projek.utils;
import java.util.UUID;
public class UuidGenerator implements  IRandom{
    @Override
    public String Random() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
