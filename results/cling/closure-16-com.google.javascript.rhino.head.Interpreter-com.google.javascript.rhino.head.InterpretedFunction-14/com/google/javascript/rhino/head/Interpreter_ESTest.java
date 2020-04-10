/*

 * Tue Mar 03 20:20:48 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.Interpreter;
import com.google.javascript.rhino.head.NativeBoolean;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      Interpreter interpreter0 = new Interpreter();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Error error0 = new Error();
      Delegator delegator0 = new Delegator();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeBoolean0, delegator0, delegator0, (Object[]) null);
  }
}
