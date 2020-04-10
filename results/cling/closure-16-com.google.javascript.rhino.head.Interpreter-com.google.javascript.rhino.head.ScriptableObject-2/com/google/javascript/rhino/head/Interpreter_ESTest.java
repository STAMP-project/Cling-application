/*

 * Tue Mar 03 20:07:58 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeFunction;
import com.google.javascript.rhino.head.Scriptable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context.enter();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeFunction nativeFunction0 = mock(NativeFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(nativeFunction0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn(0).when(nativeFunction0).getLanguageVersion();
      doReturn(0).when(nativeFunction0).getParamAndVarCount();
      doReturn(0).when(nativeFunction0).getParamCount();
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null).when(nativeFunction0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null).when(nativeFunction0).toString();
      NativeCall nativeCall0 = new NativeCall(nativeFunction0, nativeFunction0, (Object[]) null);
      assertTrue(nativeCall0.isExtensible());
  }
}
