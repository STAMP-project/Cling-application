/*

 * Tue Mar 03 20:33:27 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.Interpreter;
import com.google.javascript.rhino.head.JavaScriptException;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Interpreter interpreter0 = new Interpreter();
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        interpreter0.createScriptObject(integer0, integer0);
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
      NativeGenerator.init((ScriptableObject) null, true);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Double.valueOf((double) 110);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Interpreter interpreter0 = new Interpreter();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      Long long0 = new Long(180);
      JavaScriptException javaScriptException0 = null;
      try {
        javaScriptException0 = new JavaScriptException(long0, "language version", 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }
}
