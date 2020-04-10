/*

 * Tue Mar 03 20:05:56 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.MemberBox;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaConstructor;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Ref;
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
  public void test00()  throws Throwable  {
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(scriptableObject0, false);
      ScriptRuntime.setObjectProtoAndParent(nativeGenerator0, scriptableObject0);
      // Undeclared exception!
      try { 
        ScriptRuntime.getCallable(nativeGenerator0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn("-Q)>AQ/", (String) null).when(scriptable0).toString();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.setName(scriptable0, scriptable0, context0, scriptable0, "language version");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      long long0 = ScriptRuntime.testUint32String("=`");
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<NativeGenerator> class0 = NativeGenerator.class;
      boolean boolean0 = ScriptRuntime.eq(class0, class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        ScriptRuntime.toCharSequence(nativeObject0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(scriptableObject0, false);
      // Undeclared exception!
      try { 
        ScriptRuntime.getCallable(nativeGenerator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyInt() , any(com.google.javascript.rhino.head.Scriptable.class));
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.getObjectIndex(scriptable0, (-1877), context0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.enumInit((Object) null, context0, 665);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ImporterTopLevel", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.delete((Object) importerTopLevel0, (Object) "#t", context1);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ref ref0 = mock(Ref.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(ref0).get(any(com.google.javascript.rhino.head.Context.class));
      doReturn((Object) null).when(ref0).set(any(com.google.javascript.rhino.head.Context.class) , any());
      Object object0 = ScriptRuntime.refIncrDecr(ref0, (Context) null, 0);
      assertEquals(1.0, object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.getArrayElements(scriptable0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("$`", "$`", "", 300, "#y/<HO0k", 207);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.getArrayElements(scriptable0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ScriptRuntime.stringToNumber("ps+c/.B8?<hYb", 0, 0);
      NativeJavaConstructor nativeJavaConstructor0 = new NativeJavaConstructor((MemberBox) null);
      // Undeclared exception!
      try { 
        ScriptRuntime.toPrimitive((Object) nativeJavaConstructor0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((String) null).when(scriptable0).toString();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.setConst(scriptable0, scriptable0, context0, "'P");
      // Undeclared exception!
      try { 
        ScriptRuntime.stringToNumber("|arA", (-605), 120);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.getArrayElements(scriptable0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        ScriptRuntime.add(object0, object0, (Context) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.enumInit((Object) nativeIterator_StopIteration0, context0, false);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.getPropFunctionAndThis((Object) nativeIterator_StopIteration0, "language version", context1, (Scriptable) nativeIterator_StopIteration0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      int[] intArray0 = new int[9];
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ImporterTopLevel", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        ScriptRuntime.getGlobal(context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ImporterTopLevel", e);
      }
  }
}
