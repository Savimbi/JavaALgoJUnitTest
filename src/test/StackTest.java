package test;

import javafx.beans.binding.BooleanExpression;
import org.junit.jupiter.api.Test;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class StackTest {

    @Test
    void useOfStack() {
        Stack<String> stack=new Stack<>();
        stack.push("a");
        assertEquals(stack.size(),1);

        String element=stack.pop();
        assertEquals(element,"a");
        assertTrue(stack.empty());
    }
    @Test
    void stackOrderTest(){
        Stack<String> stack=new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        //then
        assertEquals("c",stack.pop());
        assertEquals("b",stack.pop());
        assertEquals("a",stack.pop());
    }
    @Test
    void stackPeekTest(){
        Stack<String> stack=new Stack<>();
        stack.push("a");
        assertEquals(1,stack.size());
        assertEquals("a",stack.peek());
        assertEquals(1,stack.size());
    }
    @Test
    void queueTest(){
        Queue<String> strings= new LinkedBlockingDeque<>();

        strings.offer("a");
        String element=strings.poll();

        //then
        assertEquals("a",element);
        assertTrue(strings.isEmpty());
    }


}