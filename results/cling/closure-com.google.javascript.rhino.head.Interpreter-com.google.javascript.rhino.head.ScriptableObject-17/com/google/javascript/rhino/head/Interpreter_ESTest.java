/*

 * Tue Mar 03 20:07:41 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.JavaAdapter;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeFunction;
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
  @Ignore
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptable((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeContinuation nativeContinuation0 = mock(NativeContinuation.class, new ViolatedAssumptionAnswer());
      doReturn(importerTopLevel0).when(nativeContinuation0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null).when(nativeContinuation0).getParentScope();
      doReturn("D").when(nativeContinuation0).toString();
      Scriptable scriptable0 = ScriptableObject.getClassPrototype(nativeContinuation0, "\u0002+U@'!|N");
      assertTrue(importerTopLevel0.isEmpty());
      assertTrue(importerTopLevel0.isExtensible());
      assertNull(scriptable0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptableObject(context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeGenerator nativeGenerator0 = NativeGenerator.init((ScriptableObject) null, false);
      ScriptableObject scriptableObject0 = ScriptableObject.ensureScriptableObject(nativeGenerator0);
      assertTrue(scriptableObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn((String) null, (String) null).when(scriptable0).toString();
      NativeFunction nativeFunction0 = mock(NativeFunction.class, new ViolatedAssumptionAnswer());
      NativeGenerator nativeGenerator0 = new NativeGenerator(scriptable0, nativeFunction0, scriptable0);
      assertTrue(nativeGenerator0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      InterpreterData interpreterData0 = new InterpreterData(4, "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/ContextFactory;", "vh;w0'6]Pk", false);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      // Undeclared exception!
      try { 
        JavaAdapter.createAdapterWrapper(importerTopLevel0, importerTopLevel0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("com.google.javascript.rhino.head.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NativeContinuation nativeContinuation0 = mock(NativeContinuation.class, new ViolatedAssumptionAnswer());
      ContextFactory.getGlobal();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
  }
}
