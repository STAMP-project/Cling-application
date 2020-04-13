/*

 * Tue Mar 03 20:38:43 GMT 2020
 */

package com.google.javascript.rhino.head.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.tools.debugger.Dim;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Dim_ESTest extends Dim_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Dim dim0 = new Dim();
      NativeArray nativeArray0 = new NativeArray((-1L));
      Delegator delegator0 = new Delegator(nativeArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, " not found", (Object) delegator0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0, dim0);
      // Undeclared exception!
      try { 
        dim0.objectToString(synchronizer0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(6);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, context0, 8, "", 150, nativeArray0);
      idFunctionObject0.exportAsScopeProperty();
      ContextFactory contextFactory0 = new ContextFactory();
      Dim dim0 = new Dim();
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        dim0.objectToString(nativeArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }
}
