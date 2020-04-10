/*

 * Tue Mar 03 18:58:06 GMT 2020
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
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-936L));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes("unshift", (Scriptable) null);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property unshift not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(115);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 115 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(10);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      // Undeclared exception!
      try { 
        NativeArray.getLengthProperty(context0, scriptable0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1580L);
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        nativeArray0.setInstanceIdValue(1, nativeJavaClass0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // RangeError: Inappropriate array length.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object[] objectArray1 = nativeArray0.toArray();
      Context context0 = contextFactory0.enterContext();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(110, nativeArray0, false);
      nativeArray0.execIdCall(idFunctionObject0, context0, nativeArray0, nativeArray0, objectArray1);
      assertEquals(1, idFunctionObject0.getLength());
      assertEquals(1, idFunctionObject0.getArity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      nativeArray0.delete(110);
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      assertTrue(importerTopLevel0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = contextFactory0.enterContext();
      NativeArray nativeArray1 = (NativeArray)context0.initStandardObjects((ScriptableObject) nativeArray0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(110, nativeArray1, false);
      nativeArray0.execIdCall(idFunctionObject0, context0, nativeArray1, nativeArray1, objectArray0);
      assertFalse(idFunctionObject0.isSealed());
      assertEquals(1, idFunctionObject0.getArity());
      assertEquals(1L, nativeArray1.jsGet_length());
      assertEquals(1L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4);
      Context context0 = Context.getCurrentContext();
      context0.initStandardObjects();
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(5);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 5 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(1);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray((-1388L));
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put((-23), (Scriptable) nativeArray0, (Object) null);
      assertEquals((-22L), nativeArray0.getLength());
      assertEquals((-22L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray.setMaximumInitialCapacity(130);
      NativeArray nativeArray0 = new NativeArray(2321L);
      nativeArray0.delete(130);
      assertEquals(2321L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1580L);
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      importerTopLevel0.put(1981, (Scriptable) nativeArray0, (Object) context0);
      assertEquals(1982L, nativeArray0.getLength());
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10);
      NativeArray.init(nativeArray0, false);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-1));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -1 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = contextFactory0.enterContext();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(110, nativeArray0, false);
      Float float0 = new Float((float) 4);
      nativeArray0.defineOwnProperty(context0, (Object) float0, (ScriptableObject) idFunctionObject0, false);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      nativeArray0.getOwnPropertyDescriptor(context0, nativeWith0);
      assertEquals(5L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("reverse");
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(3L);
      nativeArray0.put((-14), scriptable0, (Object) nativeJavaPackage0.UNINITIALIZED_CONST);
      NativeArray.init(nativeArray0, false);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(170);
      NativeArray nativeArray1 = new NativeArray(3);
      nativeArray1.exportAsJSClass(130, nativeArray0, true);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Double double0 = new Double(0);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.put(0, (Scriptable) nativeArray1, (Object) double0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: 0.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = contextFactory0.enterContext();
      context0.initStandardObjects((ScriptableObject) nativeArray0);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      nativeArray0.getOwnPropertyDescriptor(context0, nativeWith0);
      assertEquals(1L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray.setMaximumInitialCapacity(130);
      NativeArray nativeArray0 = new NativeArray(140);
      nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) nativeArray0, true);
      assertEquals((-1), Context.VERSION_UNKNOWN);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(170);
      NativeArray nativeArray1 = new NativeArray(3);
      nativeArray1.exportAsJSClass(130, nativeArray0, true);
      // Undeclared exception!
      try { 
        nativeArray1.getIndexIds();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 24
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = (NativeArray)ScriptableObject.getArrayPrototype(importerTopLevel0);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeArray0, true);
      ScriptableObject.getPropertyIds(nativeArray0);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, nativeGenerator0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      NativeArray nativeArray0 = new NativeArray(1);
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) null, false);
      nativeArray0.defineOwnProperty(context0, (Object) contextFactory0, scriptableObject0, true);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray((-1388L));
      BaseFunction baseFunction0 = new BaseFunction(importerTopLevel0, nativeArray0);
      Synchronizer synchronizer0 = new Synchronizer(baseFunction0, (Object) null);
      nativeArray0.put(":-!dKv_0F!M8J,oyHI", (Scriptable) baseFunction0, (Object) synchronizer0);
      assertEquals((-1388L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(6);
      nativeArray0.delete(2);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(1, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      Scriptable scriptable0 = ScriptableObject.getArrayPrototype(importerTopLevel0);
      // Undeclared exception!
      try { 
        scriptable0.delete((-984));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: -984.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1580L);
      Context context0 = Context.getContext();
      Double double0 = new Double(12);
      nativeArray0.getOwnPropertyDescriptor(context0, double0);
      NativeArray.init((Scriptable) null, false);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      importerTopLevel0.put(3, (Scriptable) nativeArray0, (Object) nativeArray0);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(4L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Short short0 = new Short((short)496);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, short0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray.setMaximumInitialCapacity(130);
      NativeArray nativeArray0 = new NativeArray(140);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(8);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 8 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      importerTopLevel0.put(0, (Scriptable) nativeArray0, (Object) context0);
      assertEquals(1L, nativeArray0.getLength());
      assertTrue(nativeArray0.isEmpty());
      assertEquals("Array", nativeArray0.getClassName());
  }
}
