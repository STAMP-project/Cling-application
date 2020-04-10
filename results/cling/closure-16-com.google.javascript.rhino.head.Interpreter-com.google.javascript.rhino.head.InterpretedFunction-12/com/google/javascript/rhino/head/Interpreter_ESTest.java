/*

 * Tue Mar 03 20:33:15 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.Interpreter;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.Synchronizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Interpreter interpreter0 = new Interpreter();
      Double double0 = new Double(1.0E13);
      // Undeclared exception!
      try { 
        interpreter0.createScriptObject(double0, (Object) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Error error0 = new Error("language version");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Synchronizer synchronizer0 = new Synchronizer((Scriptable) null);
      Interpreter interpreter0 = new Interpreter();
  }
}
