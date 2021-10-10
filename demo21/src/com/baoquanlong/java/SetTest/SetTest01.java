package com.baoquanlong.java.SetTest;

import javax.print.DocFlavor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("baoquanlong");
        hashSet.add("kangxiaomeng");
        hashSet.add("caijiepeng");
        hashSet.add("chengyuanhao");
        hashSet.add("caishunyuan");
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        }

    }

