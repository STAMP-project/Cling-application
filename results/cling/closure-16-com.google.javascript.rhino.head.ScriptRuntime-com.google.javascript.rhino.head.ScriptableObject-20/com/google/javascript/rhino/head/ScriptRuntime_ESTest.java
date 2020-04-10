/*

 * Tue Mar 03 20:06:13 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.ScriptRuntime;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ScriptRuntime_ESTest extends ScriptRuntime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptRuntime.setObjectProp((Object) null, "Dalvik", (Object) "?CUIJPI2kN", (Context) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot set property \"Dalvik\" of null to \"?CUIJPI2kN\"
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable0).getParentScope();
      // Undeclared exception!
      try { 
        ScriptRuntime.bind((Context) null, scriptable0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Byte byte0 = new Byte((byte)49);
      EcmaError ecmaError0 = (EcmaError)ScriptRuntime.undefWriteError(byte0, byte0, byte0);
      assertEquals(0, ecmaError0.getColumnNumber());
      assertEquals("com.google.javascript.rhino.head.EcmaError: TypeError: Cannot set property \"49\" of 49 to \"49\"", ecmaError0.toString());
      
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Object[] objectArray0 = ScriptRuntime.getArrayElements(scriptable0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyInt() , any(com.google.javascript.rhino.head.Scriptable.class));
      Object object0 = ScriptRuntime.getObjectIndex(scriptable0, 5, context0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Object object0 = ScriptRuntime.getIndexObject("msg.both.data.and.accessor.desc");
      assertEquals("msg.both.data.and.accessor.desc", object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test6()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ScriptableObject scriptableObject0 = ScriptRuntime.getGlobal(context0);
      ScriptableObject scriptableObject1 = ScriptRuntime.initStandardObjects(context0, scriptableObject0, false);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(scriptableObject1).when(context1).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context1, false);
      // Undeclared exception!
      try { 
        ScriptRuntime.setObjectElem((Object) importerTopLevel0, (Object) importerTopLevel0, (Object) importerTopLevel0, context0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Integer integer0 = new Integer((-1011));
      Class<Byte> class0 = Byte.TYPE;
      Object object0 = ScriptRuntime.toPrimitive((Object) integer0, (Class<?>) class0);
      assertEquals((-1011), object0);
  }
}
