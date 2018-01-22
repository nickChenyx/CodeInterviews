package com.nickchen._02;

/**
 * 面试题2： 实现单例模式
 *
 * @author nickChen
 * @since 2018-01-19 14:31.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * simple singleton class implement
 */
public class $02 {
    public static final $02 INSTANCE = new $02();
    private $02() { init(); }

    private void init() {
        // do initialize work
    }
}

/**
 * double-checked
 */
class $02$1 {
    private volatile static $02$1 INSTANCE;
    private $02$1() {
    }

    public static $02$1 getInstance() {
        if (INSTANCE == null) {
          synchronized ($02$1.class) {
              if (INSTANCE == null) {
                  INSTANCE = new $02$1();
              }
          }
        }
        return INSTANCE;
    }
}


class Test$02 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        es.execute(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println($02.INSTANCE);
//                System.out.println($02$1.getInstance());
            }
        });
        es.shutdown();
    }
}
