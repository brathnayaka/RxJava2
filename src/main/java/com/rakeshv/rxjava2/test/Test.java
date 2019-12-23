package com.rakeshv.rxjava2.test;

import io.reactivex.Observable;

public class Test {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h"};

        StringBuilder sb = new StringBuilder();
        Observable<String> observable = Observable.fromArray(letters);
        observable.subscribe(i -> sb.append(i),
                    Throwable::printStackTrace,
                () -> System.out.println("completed")
                );

        System.out.println(sb.toString());
    }
}
