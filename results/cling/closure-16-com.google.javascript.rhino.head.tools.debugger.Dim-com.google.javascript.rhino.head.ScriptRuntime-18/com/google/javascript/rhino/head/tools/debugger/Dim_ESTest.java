/*

 * Tue Mar 03 20:42:45 GMT 2020
 */

package com.google.javascript.rhino.head.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.Synchronizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Dim_ESTest extends Dim_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context.toNumber("tNrR4&1T>XuIe+");
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        context0.newObject((Scriptable) baseFunction0, "=Sza_e7,n_?E4M-7{M+");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Constructor for \"=Sza_e7,n_?E4M-7{M+\" not found.
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Context.toNumber(" ");
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Synchronizer synchronizer0 = new Synchronizer(nativeContinuation0);
      // Undeclared exception!
      try { 
        Context.toNumber(synchronizer0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Context context0 = new Context();
      Context.toNumber("0id{l:ra");
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }
}
