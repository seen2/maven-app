package com.my_app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.my_app.learning.StringOps;

/**
 *
 * @author codespace
 */
public class StringOpsTest {

    @Test
    void test() {
        StringOps ops = new StringOps();

        assertEquals("avaj", ops.reverse("java"),()->"Reverse String is not correct");
    }

}
