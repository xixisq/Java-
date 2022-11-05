package com.atguigu.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ganccl
 * @create 2022-10-04 21:01
 */
public class ListExer {
    @Test
    public void testListRemove(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);
    }

    private static void updateList(List list) {
        list.remove(2);
    }
}
