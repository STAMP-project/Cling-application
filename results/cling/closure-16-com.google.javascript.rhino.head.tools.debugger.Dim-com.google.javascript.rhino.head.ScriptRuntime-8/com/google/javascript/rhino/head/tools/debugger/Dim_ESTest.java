/*

 * Tue Mar 03 20:40:42 GMT 2020
 */

package com.google.javascript.rhino.head.tools.debugger;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import java.time.chrono.MinguoChronology;
import java.time.chrono.MinguoDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Dim_ESTest extends Dim_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray((-1L));
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) nativeArray0, false);
      Class<NativeIterator> class0 = NativeIterator.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) scriptableObject0, class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.NativeIterator\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(110);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "", (Object) nativeArray0);
      Class<NativeIterator> class0 = NativeIterator.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) nativeArray0, class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.NativeIterator\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      MinguoChronology minguoChronology0 = MinguoChronology.INSTANCE;
      MinguoDate minguoDate0 = minguoChronology0.dateYearDay(1859, 8);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "0*@|McVk9pBlVx(iG?^", (Object) minguoDate0);
      Class<NativeIterator> class0 = NativeIterator.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) nativeArray0, class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.NativeIterator\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }
}
