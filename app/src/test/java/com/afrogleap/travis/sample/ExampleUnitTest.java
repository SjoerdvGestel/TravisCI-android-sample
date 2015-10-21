package com.afrogleap.travis.sample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowLog;


/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class ExampleUnitTest {

    @Before
    public void setUp() throws Exception {
        ShadowLog.stream = System.out;
    }

    @Test
    public void a0_shouldAlwaysPass() throws Exception {
        Assert.assertTrue(true);
    }

    @Test
    public void a1_calcTest() throws Exception {
        int val = 2+2+2;

        Assert.assertEquals(val, 7); //error
    }
}
