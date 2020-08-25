package today.zjc.myandroidlearningprogram.java;

import android.util.Log;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class ExampleContainer {
    public void p(String p) {
        System.out.println(p);
    }


    @Test
    public void list() {
//        ArrayList a = new ArrayList<String>();
//        a.add("1");
//        p(a.toString());
//        LinkedList l = new LinkedList();
//        //Collections#synchronizedList
//        //Collections.synchronizedList()
    }


    @Test
    public void linkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.linkLast("222");
//        linkedList.linkLast("333");
//        linkedList.linkLast("444");
        linkedList.linkFirst("222");
        linkedList.linkFirst("1111");
        p(linkedList.toString());
    }

}
