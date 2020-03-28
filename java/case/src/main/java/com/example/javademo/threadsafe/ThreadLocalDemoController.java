package com.example.javademo.threadsafe;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/threadsafe/threadlocal")
public class ThreadLocalDemoController {

    private static final ThreadLocal<Integer> currentUser = ThreadLocal.withInitial(() -> null);

    @GetMapping("wrong")
    public Map wrong(@RequestParam("userId") Integer userId) {
        String before = Thread.currentThread().getName() + ":" + currentUser.get();

        currentUser.set(userId);

        String after = Thread.currentThread().getName() + ":" + currentUser.get();

        Map result = new HashMap();
        result.put("before", before);
        result.put("after", after);

        return result;
    }

    @GetMapping("right")
    public Map right(@RequestParam("userId") Integer userId) {
        String before = Thread.currentThread().getName() + ":" + currentUser.get();

        currentUser.set(userId);

        try {
            String after = Thread.currentThread().getName() + ":" + currentUser.get();

            Map result = new HashMap();
            result.put("before", before);
            result.put("after", after);

            return result;
        } finally {
            currentUser.remove();
        }
    }

}
