package com.poc.lombok;

import lombok.val;

import java.util.ArrayList;

public class ValExample {

    String extractFirstInLower(ArrayList<String> list) {
        list.add("Hello, World!");
        val foo = list.get(0);
        return foo.toLowerCase();
    }

    public static void main(String[] args) {
        val myList = new ArrayList<String>();
        val valExampleObj = new ValExample();
        val result = valExampleObj.extractFirstInLower(myList);
        System.out.println("result : " + result);
    }
}
