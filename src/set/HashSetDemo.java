package src.set;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Implementation of Set
 * Set contains unique values
 *
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<UUID> uuidSet = new HashSet<>();
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();
        UUID uuid3 = UUID.fromString("6d5405d1-e807-4bd6-bba6-c4be6441bf16");
        UUID uuid4 = UUID.fromString("6d5405d1-e807-4bd6-bba6-c4be6441bf16");
        uuidSet.add(uuid1);
        uuidSet.add(uuid2);
        uuidSet.add(uuid3);
        uuidSet.add(uuid4);
        System.out.println(uuidSet);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Ram");
        stringSet.add("Shyam");
        stringSet.add("Mohan");
        stringSet.add("Ram");
        System.out.println(stringSet);
        System.out.println(stringSet.contains("Luxman"));
    }
}