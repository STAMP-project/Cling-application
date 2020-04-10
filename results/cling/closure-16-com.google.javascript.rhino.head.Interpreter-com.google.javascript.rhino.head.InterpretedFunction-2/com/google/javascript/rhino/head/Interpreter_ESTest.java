/*

 * Tue Mar 03 20:25:17 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Interpreter;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeJavaObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Interpreter interpreter0 = new Interpreter();
      // Undeclared exception!
      try { 
        interpreter0.createScriptObject((Object) null, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      Context context0 = new Context();
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Interpreter interpreter0 = new Interpreter();
      contextFactory0.makeContext();
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      EvaluatorException evaluatorException0 = null;
      try {
        evaluatorException0 = new EvaluatorException("error reporter", "error reporter", 0, "kXZGF8AN", 9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }
}
