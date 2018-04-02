package com.poc.lombok;

import lombok.extern.java.Log;

import java.util.logging.Level;

@Log
public class Demo {

    public static void main(String[] args) {
        Employee emp = Employee.builder()
                .id("E11")
                .name("abc")
                .build();
        log.info("Employee id : " + emp.getId());
        log.info("Employee name : " + emp.getName());

        GetLazy getLazy = new GetLazy();
        Long beforeTime = System.currentTimeMillis();
        double[] value1 = getLazy.getLazyValue();
        Long afterTime1 = System.currentTimeMillis();
        double[] value2 = getLazy.getLazyValue();
        Long afterTime2 = System.currentTimeMillis();

        log.info("diff : " + (afterTime1 - beforeTime));
        log.info("diff 2nd time : " + (afterTime2 - afterTime1));
        log.info("value1 : " + value1);
        log.info("value2 : " + value2);
    }
}
