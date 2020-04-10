/*

 * Tue Mar 03 20:40:31 GMT 2020
 */

package com.google.javascript.rhino.head.tools.debugger;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Dim_ESTest extends Dim_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(3);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, (-52), 2);
      IdFunctionObject idFunctionObject1 = idFunctionObject0.exportAsJSClass(1, nativeArray0, true);
      Context context0 = new Context();
      idFunctionObject0.execIdCall(idFunctionObject1, context0, nativeArray0, nativeArray0, context0.emptyArgs);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "", (Object) nativeArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1);
      Context context0 = Context.getCurrentContext();
      ScriptableObject.putProperty((Scriptable) nativeArray0, " where it expected String, Number, Boolean or Scriptable instance. Please check your code for missing Context.javaToJS() call.", (Object) context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Error;
      // Undeclared exception!
      try { 
        TopLevel.getBuiltinCtor(context0, (Scriptable) nativeArray0, topLevel_Builtins0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Constructor for \"Error\" not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1);
      Context context0 = Context.getCurrentContext();
      ScriptableObject.putProperty((Scriptable) nativeArray0, "0`,7Inw_Y!R", (Object) context0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, context0, 6, 6);
      IdFunctionObject idFunctionObject1 = idFunctionObject0.exportAsJSClass(2, nativeArray0, false);
      idFunctionObject0.execIdCall(idFunctionObject1, context0, nativeArray0, idFunctionObject1, context0.emptyArgs);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(3);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "", (Object) "");
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Number;
      // Undeclared exception!
      try { 
        TopLevel.getBuiltinCtor(context0, (Scriptable) nativeArray0, topLevel_Builtins0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Constructor for \"Number\" not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test4()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "0`,7Inw_Y!R", (Object) nativeArray0);
      Context context0 = Context.getCurrentContext();
      context0.getImplementationVersion();
  }
}
