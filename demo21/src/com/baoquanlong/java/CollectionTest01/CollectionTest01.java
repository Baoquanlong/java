package com.baoquanlong.java.CollectionTest01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionTest01 {
    //测试collection接口的各个方法;
    public static void main(String[] args) {
        Collection clt = new ArrayList();
        Collection clt2 = new LinkedList();

        clt.add(100);
        clt.add(true);


        clt2.add(100);
        clt2.add(true);
        clt2.add(3.14);

//        System.out.println(clt2.containsAll(clt));
        clt.add(3.14);

        System.out.println(clt.equals(clt2));
         Iterator it = clt.iterator();
        for (int i = 0; i < clt.size(); i++) {
            System.out.println(it.next());
        }

    }
}
