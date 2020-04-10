/*

 * Tue Mar 03 20:07:27 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Callable;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaObject;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
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
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.getObjectIndex((Object) nativeJavaClass0, 0.0, context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeJavaObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      context0.initStandardObjects((ScriptableObject) nativeObject0);
      long long0 = ScriptRuntime.testUint32String("Dalvik");
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null).when(scriptable0).toString();
      Callable callable0 = mock(Callable.class, new ViolatedAssumptionAnswer());
      BoundFunction boundFunction0 = new BoundFunction(context0, scriptable0, callable0, scriptable0, (Object[]) null);
      // Undeclared exception!
      try { 
        ScriptRuntime.eqNumber(12, boundFunction0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object[] objectArray1 = ScriptRuntime.getArrayElements(nativeArray0);
      assertTrue(nativeArray0.isExtensible());
      assertEquals(1, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Byte byte0 = new Byte((byte)0);
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "#0(Function)");
      CharSequence charSequence0 = ScriptRuntime.add((Object) byte0, (CharSequence) stringBuilder0);
      assertEquals(13, charSequence0.length());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeIterator.StopIteration nativeIterator_StopIteration1 = (NativeIterator.StopIteration)ScriptRuntime.setObjectElem((Scriptable) scriptableObject0, (Object) scriptableObject0, (Object) nativeIterator_StopIteration0, context0);
      assertFalse(nativeIterator_StopIteration1.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      context0.initStandardObjects((ScriptableObject) nativeObject0);
      ScriptRuntime.notFunctionError((Object) nativeObject0, (Object) nativeObject0, "(v0)B^P");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.enumInit((Object) null, context0, false);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = ScriptRuntime.getIndexObject("msg.function.not.found");
      assertEquals("msg.function.not.found", object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null).when(scriptable0).toString();
      Callable callable0 = mock(Callable.class, new ViolatedAssumptionAnswer());
      BoundFunction boundFunction0 = new BoundFunction(context0, scriptable0, callable0, scriptable0, (Object[]) null);
      boolean boolean0 = ScriptRuntime.eq(boundFunction0, boundFunction0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.nameIncrDecr(scriptable0, "", context0, (-6));
      Scriptable scriptable1 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable1).getPrototype();
      doReturn(false).when(scriptable1).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((String) null).when(scriptable1).toString();
      Object object0 = ScriptRuntime.setObjectElem(scriptable1, (Object) "", (Object) scriptable1, (Context) null);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = ScriptRuntime.isJSWhitespaceOrLineTerminator(1325);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      Scriptable scriptable0 = ScriptRuntime.bind(context0, nativeBoolean0, "language version");
      assertTrue(nativeBoolean0.isExtensible());
      assertNull(scriptable0);
      assertTrue(nativeBoolean0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      Object[] objectArray0 = new Object[9];
      int[] intArray0 = new int[0];
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(nativeJavaObject0).when(context0).newObject(any(com.google.javascript.rhino.head.Scriptable.class));
      // Undeclared exception!
      try { 
        ScriptRuntime.newObjectLiteral(objectArray0, objectArray0, intArray0, context0, (Scriptable) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Ref ref0 = mock(Ref.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(ref0).get(any(com.google.javascript.rhino.head.Context.class));
      doReturn((Object) null).when(ref0).set(any(com.google.javascript.rhino.head.Context.class) , any());
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.refIncrDecr(ref0, context0, 150);
      assertNotNull(object0);
      assertEquals(0.0, object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.getObjectIndex((Scriptable) nativeObject0, 0, context0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context1 = new Context(contextFactory0);
      Scriptable scriptable0 = context1.initStandardObjects((ScriptableObject) nativeObject0);
      assertSame(nativeObject0, scriptable0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Integer integer0 = new Integer(2531);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.add((Object) integer0, (Object) integer0, context0);
      assertEquals(5062.0, object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        ScriptRuntime.toInteger((Object) nativeError0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ScriptRuntime.toBoolean(nativeObject0);
      // Undeclared exception!
      try { 
        ScriptRuntime.notFunctionError((Object) nativeObject0, (Object) nativeObject0, "(v0)B^P");
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      ClassLoader classLoader0 = mock(ClassLoader.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(classLoader0).loadClass(anyString());
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.enumInit((Object) nativeJavaTopPackage0, context0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object object0 = ScriptRuntime.toPrimitive((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ScriptRuntime.toBoolean(nativeObject0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      context0.initStandardObjects((ScriptableObject) nativeObject0);
      ScriptRuntime.notFunctionError((Object) nativeObject0, (Object) nativeObject0, "(v0)B^P");
  }
}
