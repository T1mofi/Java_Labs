package com.compare.numbers.cache;

import org.springframework.stereotype.Component;

@Component
public class Counter {
    private long count;

    public  long increment(){
        return ++count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getCount() {
        return count;
    }
}
