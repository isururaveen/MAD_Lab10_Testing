package com.example.mad_lab10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private MainActivity mainActivity;

    @Before
    public void setup(){
        mainActivity = new MainActivity();
    }

    @Test
    public void celciusIsCorrect(){
        float result = mainActivity.convertToCelcious(100);
        assertEquals(37.77778,result,0.001);
    }

    @Test
    public void fahrenhightIsCorrect(){
        float result = mainActivity.convertTofarenhight(100);
        assertEquals(212.0,result,0.001);
    }
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}