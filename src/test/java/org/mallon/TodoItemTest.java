package org.mallon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoItemTest {
    @Test
    public void createNoDescription() {
        TodoItem i = new TodoItem("Test");

        //assert if title is ""
        assertEquals("", i.getDescription());
    }
    // Test to verify setDescription does not change description if it's the same as the title
    @Test
    public void addDescription() {
        TodoItem i = new TodoItem("Test");
        i.setDescription("My New Todo");
        assertEquals("My New Todo", i.getDescription());
    }

    @Test
    public void addDescription2 (){
        TodoItem i = new TodoItem("Test 2");
        i.setDescription("Test two");
        assertEquals("Test two", i.getDescription());
    }

    @Test
    // Test to verify initial complete status is false
    public void initialCompleteTest (){
        TodoItem i = new TodoItem("complete Test");

        //assert to test if getter is false
       assertEquals(false, i.isComplete());


    }

    @Test
    public void ifCompleteIsFalse (){

        //if set complete called and complete false set to true
        TodoItem i = new TodoItem("Test if complete false");

        //initially complete is false. So call setcomplete and set to true
        assertEquals(true, i.setComplete());

        //assert isComplete should now be true
        assertEquals(true, i.isComplete());
    }

@Test

    public void ifCompleteIsTrue(){
        TodoItem i = new TodoItem("Test if complete is true");

        //set complete to True
        i.setComplete();
        assertEquals(true, i.isComplete());

        //Call set complete method again and should return false since complete is now true
    assertEquals(false, i.setComplete());

    //complete should remain true
    assertEquals(true, i.isComplete());
}
    
}
