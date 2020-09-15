package sample;
import javafx.embed.swing.JFXPanel;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ControllerTest extends TestCase {
    public void setUp() throws Exception {
        super.setUp();
    }
    private JFXPanel panel = new JFXPanel();
    //creates Person
    Block Nathan = new Block("Computer Science 11", "Zaremba", "VLN");
    @Test
    public void testSetCourse() {//tests Set Course
        Nathan.setCourse("Computer Science 11");
        String expResult = "Computer Science 11";
        assertEquals(expResult, Nathan.getCourse());
    }

    @Test
    public void testSetTeacher(){//tests Set Teacher
        Nathan.setTeacher("Zaremba");
        String expResult = "Zaremba";
        assertEquals(expResult, Nathan.getTeacher());
    }

    @Test//tests toString
    public void testToString(){
        assertEquals(Nathan.getCourse(), "Computer Science 11");
    }
}