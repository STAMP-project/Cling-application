/*

 * Tue Mar 03 20:41:45 GMT 2020
 */

package com.google.javascript.rhino.head.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.tools.debugger.Dim;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Dim_ESTest extends Dim_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Dim dim0 = new Dim();
      String[] stringArray0 = dim0.functionNames();
      NativeArray nativeArray0 = new NativeArray(stringArray0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, dim0, 0, "msg.invalid.i$erato*", 1, nativeArray0);
      idFunctionObject0.exportAsJSClass(2, nativeArray0, true);
      Class<TopLevel> class0 = TopLevel.class;
      // Undeclared exception!
      try { 
        Context.toObject((Object) null, (Scriptable) null, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }
}
