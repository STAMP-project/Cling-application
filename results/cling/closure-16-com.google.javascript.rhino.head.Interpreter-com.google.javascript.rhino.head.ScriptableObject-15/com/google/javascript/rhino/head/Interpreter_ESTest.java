/*

 * Tue Mar 03 20:12:44 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.JavaAdapter;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeJavaObject;
import com.google.javascript.rhino.head.Script;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.tools.shell.Global;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) baseFunction0, "jsStaticFunction_", (Object[]) null);
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
      NativeError nativeError0 = new NativeError();
      assertFalse(nativeError0.isSealed());
      
      Class<BaseFunction> class0 = BaseFunction.class;
      BaseFunction baseFunction0 = ScriptableObject.buildClassCtor((Scriptable) nativeError0, class0, false, false);
      assertTrue(nativeError0.isEmpty());
      
      ScriptableObject.redefineProperty(baseFunction0, "gI9", true);
      assertTrue(baseFunction0.isExtensible());
      assertTrue(nativeError0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Class<Error> class0 = Error.class;
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject(scriptableObject0, context0, class0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Script script0 = mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(script0).exec(any(com.google.javascript.rhino.head.Context.class) , any(com.google.javascript.rhino.head.Scriptable.class));
      Global global0 = (Global)JavaAdapter.runScript(script0);
      assertFalse(global0.isEmpty());
  }
}
