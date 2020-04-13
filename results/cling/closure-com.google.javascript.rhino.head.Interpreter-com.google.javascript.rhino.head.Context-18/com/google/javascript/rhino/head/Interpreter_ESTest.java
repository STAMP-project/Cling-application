/*

 * Tue Mar 03 19:46:40 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.WrappedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-194), "fb`Z$^E97", ")9_t", false);
      // Undeclared exception!
      try { 
        interpreterData0.getLineNumbers();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/javascript/rhino/head/Interpreter
         //
         verifyException("com.google.javascript.rhino.head.InterpreterData", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      Throwable throwable0 = new Throwable("G2vb|+VeHs odWxy");
      WrappedException wrappedException0 = null;
      try {
        wrappedException0 = new WrappedException(throwable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }
}
