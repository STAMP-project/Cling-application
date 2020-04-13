/*

 * Tue Mar 03 20:40:24 GMT 2020
 */

package com.google.javascript.rhino.head.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.Scriptable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Dim_ESTest extends Dim_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      BaseFunction baseFunction0 = new BaseFunction();
      NativeArray nativeArray0 = new NativeArray(2);
      baseFunction0.exportAsJSClass(1, nativeArray0, true);
      // Undeclared exception!
      try { 
        importerTopLevel0.getAttributes(4, (Scriptable) baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 4 not found.
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }
}
