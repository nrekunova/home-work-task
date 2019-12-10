package com.hillel.lecture_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by alpa on 12/5/19
 */
public class ArraysChecker {


    public List<String> getReversList(List<String> list) {
//        Collections.reverse(list);
        List<String> list1 = new ArrayList<>();
        for (String el: list) {
            list1.add(0, el);
        }
        return list1;
    }

    public String getLongestString(List<String> list) {
        String result = "";
        for (String el: list) {
            if(el.length()>result.length()){
                result = el;
            }

        }

        return result;
    }

    public List<String> changeIndex(List<String> list) {

        String el = list.set(3, list.get(1));
        list.set(1, el);
        return list;
    }

    public List<String> removeDuplicates(List<String> list) {
        List<String> list1 = new ArrayList<>();
        for (String el: list) {
            if(!list1.contains(el)) {
                list1.add(el);
            }
        }

        return list1;
    }

    public List<String> sortList(List<String> list) {
        Collections.sort(list);

        return list;
    }
}
