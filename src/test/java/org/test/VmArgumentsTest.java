package org.test;

import org.junit.Test;

public class VmArgumentsTest {

    @Test
    public void testVmArguments() {
        // Just set a VM option -Xmx in Run configuration to something other that 1024m and you will see,
        // this output is still the same because of Surefire settings from parent Maven project.
        // When I run this in Eclipse with different -Xmx argument in Run configuration, it changes.
        System.out.println(Runtime.getRuntime().maxMemory());
    }

}
