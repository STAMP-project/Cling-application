/*

 * Tue Mar 03 20:08:59 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.regexp.NativeRegExp;
import com.google.javascript.rhino.head.regexp.RegExpImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
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
  public void test1()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      RegExpImpl regExpImpl0 = new RegExpImpl();
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      NativeRegExp nativeRegExp0 = (NativeRegExp)regExpImpl0.wrapRegExp(context0, nativeBoolean0, (Object) null);
      assertTrue(nativeBoolean0.isEmpty());
      assertTrue(nativeRegExp0.isExtensible());
  }
}
