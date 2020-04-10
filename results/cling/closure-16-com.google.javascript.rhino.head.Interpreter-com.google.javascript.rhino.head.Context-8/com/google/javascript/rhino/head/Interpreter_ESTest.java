/*

 * Tue Mar 03 19:45:16 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Synchronizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(50, "5-#*=,Gl /@}?zi", "5-#*=,Gl /@}?zi", true);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Synchronizer synchronizer0 = new Synchronizer(nativeObject0);
      // Undeclared exception!
      try { 
        synchronizer0.newInstance();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }
}
