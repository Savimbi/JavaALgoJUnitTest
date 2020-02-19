package test;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    void linkedListTest(){
        List<String> list= new LinkedList<>();
        //let add "a"
        list.add("a");
        assertEquals(1,list.size());

        //let remove "a"
        list.remove("a");
        assertTrue(list.isEmpty());
    }
}
