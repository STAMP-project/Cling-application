/*

 * Tue Mar 03 20:05:46 GMT 2020
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
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Ref;
import com.google.javascript.rhino.head.ScriptRuntime;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ScriptRuntime_ESTest extends ScriptRuntime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(69);
      ScriptableObject scriptableObject0 = mock(ScriptableObject.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptableObject0).associateValue(any() , any());
      doReturn((Object) null).when(scriptableObject0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptableObject0).getParentScope();
      doReturn((String) null, (String) null).when(scriptableObject0).toString();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(scriptableObject0, true);
      // Undeclared exception!
      try { 
        ScriptRuntime.eq(charBuffer0, nativeGenerator0);
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
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Scriptable scriptable1 = ScriptRuntime.toIterator(context0, scriptable0, scriptable0, false);
      assertNull(scriptable1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ScriptableObject scriptableObject0 = mock(ScriptableObject.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptableObject0).associateValue(any() , any());
      doReturn((Object) null).when(scriptableObject0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptableObject0).getParentScope();
      doReturn((String) null, (String) null).when(scriptableObject0).toString();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(scriptableObject0, false);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.strictSetName((Scriptable) null, nativeGenerator0, context0, (Scriptable) null, "");
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // ReferenceError: Assignment to undefined \"\" in strict mode
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null).when(scriptable0).toString();
      Callable callable0 = mock(Callable.class, new ViolatedAssumptionAnswer());
      BoundFunction boundFunction0 = new BoundFunction(context0, scriptable0, callable0, scriptable0, (Object[]) null);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Object object0 = ScriptRuntime.enumInit((Object) null, context0, true);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      // Undeclared exception!
      try { 
        ScriptRuntime.getCallable(importerTopLevel0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).getDefaultValue(nullable(java.lang.Class.class));
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((String) null).when(scriptable0).toString();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.setObjectElem(scriptable0, (Object) scriptable0, (Object) scriptable0, context0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null).when(scriptable0).getParentScope();
      Object object0 = ScriptRuntime.name(context0, scriptable0, "XMLEND");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ScriptableObject scriptableObject0 = mock(ScriptableObject.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptableObject0).associateValue(any() , any());
      doReturn((Object) null).when(scriptableObject0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptableObject0).getParentScope();
      doReturn((String) null, (String) null).when(scriptableObject0).toString();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(scriptableObject0, true);
      // Undeclared exception!
      try { 
        ScriptRuntime.toCharSequence(nativeGenerator0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.enumInit((Object) null, context0, false);
      TopLevel topLevel0 = new TopLevel();
      // Undeclared exception!
      try { 
        ScriptRuntime.toInt32((Object) topLevel0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn("/*").when(context0).toString();
      // Undeclared exception!
      try { 
        ScriptRuntime.getElemFunctionAndThis(context0, context0, context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(nativeIterator_StopIteration0).when(scriptable0).getParentScope();
      doReturn(nativeIterator_StopIteration0).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Scriptable scriptable1 = ScriptRuntime.bind(context0, scriptable0, "error reporter");
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertNull(scriptable1);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ref ref0 = mock(Ref.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(ref0).get(any(com.google.javascript.rhino.head.Context.class));
      doReturn((Object) null).when(ref0).set(any(com.google.javascript.rhino.head.Context.class) , any());
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.refIncrDecr(ref0, context0, 0);
      assertEquals(1.0, object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      NativeWith nativeWith0 = new NativeWith(nativeBoolean0, nativeBoolean0);
      nativeBoolean0.put("__proto__", (Scriptable) nativeWith0, (Object) nativeWith0);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn(true).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((String) null).when(scriptable0).toString();
      // Undeclared exception!
      try { 
        ScriptRuntime.toIterator(context0, scriptable0, scriptable0, false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Invalid iterator value
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Object[] objectArray0 = ScriptRuntime.getArrayElements(scriptable0);
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        ScriptRuntime.cmp_LT((Object) null, nativeArray0);
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
  public void test15()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      ImporterTopLevel importerTopLevel1 = (ImporterTopLevel)ScriptRuntime.setConst(importerTopLevel0, importerTopLevel0, context0, "error reporter");
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      ScriptRuntime.typeofName(scriptable0, "WKw@BU9dhc;WxnXRrJ/");
      TopLevel topLevel0 = new TopLevel();
      // Undeclared exception!
      try { 
        ScriptRuntime.toInt32((Object) topLevel0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.add((Object) null, (Object) null, context0);
      long long0 = ScriptRuntime.indexFromString("rP>=");
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(context0).hasFeature(anyInt());
      ScriptRuntime.getObjectIndex((Object) nativeIterator_StopIteration0, (-2389.3706), context0);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(nativeIterator_StopIteration0).when(context1).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context1);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = ScriptRuntime.getIndexObject("6lUX5k{NMoAyQ/'u[2E");
      assertEquals("6lUX5k{NMoAyQ/'u[2E", object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(nativeJavaTopPackage0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      ScriptRuntime.getArrayElements(scriptable0);
      Context context0 = Context.getCurrentContext();
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
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ScriptableObject scriptableObject0 = ScriptRuntime.getGlobal(context0);
      ScriptableObject scriptableObject1 = context0.initStandardObjects(scriptableObject0, true);
      assertFalse(scriptableObject1.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(importerTopLevel0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Object[] objectArray0 = ScriptRuntime.getArrayElements(scriptable0);
      assertEquals(0, objectArray0.length);
  }
}
