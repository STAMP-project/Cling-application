/*

 * Tue Mar 03 20:09:00 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaArray;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn((String) null).when(scriptable0).toString();
      Error error0 = new Error("language version");
      // Undeclared exception!
      try { 
        NativeJavaArray.wrap(scriptable0, (Object) error0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("com.google.javascript.rhino.head.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeContinuation nativeContinuation0 = mock(NativeContinuation.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(nativeContinuation0).getAssociatedValue(any());
      doReturn((Scriptable) null).when(nativeContinuation0).getParentScope();
      doReturn((Scriptable) null).when(nativeContinuation0).getPrototype();
      doReturn((String) null).when(nativeContinuation0).toString();
      NativeWith nativeWith0 = new NativeWith(nativeContinuation0, nativeContinuation0);
      Class<Long> class0 = Long.class;
      NativeJavaClass nativeJavaClass0 = null;
      try {
        nativeJavaClass0 = new NativeJavaClass(nativeWith0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("com.google.javascript.rhino.head.ClassCache", e);
      }
  }
}
