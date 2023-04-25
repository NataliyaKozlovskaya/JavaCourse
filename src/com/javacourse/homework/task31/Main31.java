package com.javacourse.homework.task31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main31 {
    public static void main(String[] args) {
        Map<String, User31> map = new HashMap<>();

        User31 user1 = new User31("Pasha", "passwordPasha", 123456);
        User31 user2 = new User31("Masha", "passwordMasha", 112233);
        User31 user3 = new User31("Misha", "passwordMisha", 336699);
        User31 user4 = new User31("Sasha", "passwordSasha", 7778895);
        User31 user5 = new User31("Egor", "passwordEgor", 5425486);
        User31 user6 = new User31("Macar", "passwordMacar", 100002);

        map.put(user1.getUsername(), user1);
        map.put(user2.getUsername(), user2);
        map.put(user3.getUsername(), user3);
        map.put(user4.getUsername(), user4);
        map.put(user5.getUsername(), user5);
        map.put("Macar", user6);

        Integer phoneNumber = getPhoneNumber(map, "Egor");
        System.out.println(phoneNumber);
    }

    public static Integer getPhoneNumber(Map<String, User31> map, String username) {
        User31 user = map.get(username);
        Integer phoneNumber = user.getPhoneNumber();
        return phoneNumber;
    }
}



        //1 System.out.println(map.entrySet());

//        Set<Map.Entry<String, User31>> entries = map.entrySet();
//        2 for (Map.Entry<String, User31>entry: entries) {
//            //System.out.println(entry);
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//
////        }
//        //3 map.forEach(s + User31);
//        Iterator<Map.Entry<String, User31>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

// (16-1) & 1525245
// key.hashCode=hash