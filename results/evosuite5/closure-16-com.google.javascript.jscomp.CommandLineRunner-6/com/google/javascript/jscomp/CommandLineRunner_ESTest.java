/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 22:21:53 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CommandLineRunner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CommandLineRunner_ESTest extends CommandLineRunner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[8];
      MockPrintStream mockPrintStream0 = new MockPrintStream("--A=");
      CommandLineRunner commandLineRunner0 = null;
      try {
        commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
