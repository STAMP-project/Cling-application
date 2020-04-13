/*

 * Tue Mar 03 20:09:50 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeFunction;
import com.google.javascript.rhino.head.NativeJavaArray;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn((String) null).when(scriptable0).toString();
      // Undeclared exception!
      try { 
        NativeJavaArray.wrap(scriptable0, (Object) context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("com.google.javascript.rhino.head.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Class<Synchronizer> class0 = Synchronizer.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) delegator0, class0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeFunction nativeFunction0 = mock(NativeFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(nativeFunction0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn(0).when(nativeFunction0).getLanguageVersion();
      doReturn(0).when(nativeFunction0).getParamAndVarCount();
      doReturn(0).when(nativeFunction0).getParamCount();
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null).when(nativeFunction0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null).when(nativeFunction0).toString();
      NativeCall nativeCall0 = new NativeCall(nativeFunction0, nativeFunction0, (Object[]) null);
      assertFalse(nativeCall0.isEmpty());
  }
}
