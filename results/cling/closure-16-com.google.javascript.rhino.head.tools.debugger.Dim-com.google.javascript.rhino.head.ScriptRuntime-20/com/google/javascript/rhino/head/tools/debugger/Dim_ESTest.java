/*

 * Tue Mar 03 20:43:00 GMT 2020
 */

package com.google.javascript.rhino.head.tools.debugger;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Dim_ESTest extends Dim_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      Context context0 = Context.enter((Context) null);
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.defineProperty("", (Object) nativeArray0, 8);
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage((String) null);
      // Undeclared exception!
      try { 
        nativeJavaPackage0.getAttributes((String) null, (Scriptable) nativeArray0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 0 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      Context context0 = Context.enter((Context) null);
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      context0.initStandardObjects((ScriptableObject) nativeArray0);
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("error reporter");
      // Undeclared exception!
      try { 
        nativeJavaPackage0.getAttributes("error reporter", (Scriptable) nativeArray0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property error reporter not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }
}
