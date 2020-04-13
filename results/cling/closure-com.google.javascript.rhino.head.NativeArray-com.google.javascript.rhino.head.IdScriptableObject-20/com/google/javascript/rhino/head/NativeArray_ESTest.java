/*

 * Tue Mar 03 19:00:48 GMT 2020
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
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.MemberBox;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.NativeObject;
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
      NativeArray nativeArray0 = new NativeArray(527L);
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeArray0, 0);
      assertFalse(boolean0);
      
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(106, nativeIterator_StopIteration0, false);
      assertEquals(1, idFunctionObject0.methodId());
      
      Context context0 = Context.getContext();
      nativeArray0.execIdCall(idFunctionObject0, context0, nativeIterator_StopIteration0, nativeIterator_StopIteration0, context0.emptyArgs);
      assertFalse(idFunctionObject0.isSealed());
      assertEquals(1, idFunctionObject0.getArity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4096L);
      NativeJavaMethod nativeJavaMethod0 = new NativeJavaMethod((MemberBox) null, "Hw& tUjh<\"%fh517");
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes("Hw& tUjh<\"%fh517", (Scriptable) nativeJavaMethod0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property Hw& tUjh<\"%fh517 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(656, scriptable0, false);
      assertFalse(idFunctionObject0.isSealed());
      assertEquals(1, idFunctionObject0.getLength());
      assertEquals(1, idFunctionObject0.methodId());
      
      boolean boolean0 = nativeArray0.has("java/lang/Boolean", (Scriptable) synchronizer0);
      assertFalse(boolean0);
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.get((int) (byte) (-8), (Scriptable) nativeIterator_StopIteration0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(21, nativeIterator_StopIteration0, false);
      nativeArray0.execIdCall(idFunctionObject0, context0, nativeIterator_StopIteration0, nativeArray0, context0.emptyArgs);
      assertEquals(1, idFunctionObject0.methodId());
      assertEquals(1, idFunctionObject0.getArity());
      assertEquals(1, idFunctionObject0.getLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.has(4, (Scriptable) nativeIterator_StopIteration0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(21, nativeIterator_StopIteration0, false);
      nativeArray0.execIdCall(idFunctionObject0, context0, nativeIterator_StopIteration0, nativeArray0, context0.emptyArgs);
      assertFalse(nativeIterator_StopIteration0.isEmpty());
      assertFalse(idFunctionObject0.isSealed());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-4L));
      nativeArray0.exportAsJSClass(8, nativeArray0, false);
      nativeArray0.delete(172);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1979L);
      NativeArray.init(nativeArray0, true);
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
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeArray.init(nativeArray0, true);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(3, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.get(13, (Scriptable) nativeIterator_StopIteration0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(21, nativeIterator_StopIteration0, false);
      nativeArray0.execIdCall(idFunctionObject0, context0, nativeIterator_StopIteration0, nativeArray0, context0.emptyArgs);
      assertFalse(nativeIterator_StopIteration0.isEmpty());
      assertEquals(1, idFunctionObject0.getArity());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      long long0 = NativeArray.getLengthProperty(context0, importerTopLevel0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArray.init(importerTopLevel0, false);
      NativeArray nativeArray0 = new NativeArray((-700L));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-3464));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -3464 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(99L);
      Context context0 = new Context();
      context0.initStandardObjects();
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(758, (Scriptable) nativeArray0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 758 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(8, nativeArray0, false);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, nativeArray0, nativeArray0, objectArray0);
      assertEquals(1, idFunctionObject0.methodId());
      assertEquals(1, idFunctionObject0.getLength());
      assertEquals("Array", nativeArray1.getClassName());
      assertEquals(2L, nativeArray1.getLength());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArray.init(nativeIterator_StopIteration0, false);
      NativeArray nativeArray0 = new NativeArray(1383L);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      nativeArray0.put(726, (Scriptable) nativeIterator_StopIteration0, (Object) importerTopLevel0);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.exportAsJSClass(8, nativeArray0, false);
      Class<NativeJavaClass> class0 = NativeJavaClass.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeJavaClass
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1979L);
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      nativeArray0.getOwnPropertyDescriptor(context0, scriptableObject0);
      assertEquals("Array", nativeArray0.getClassName());
      assertEquals(1979L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1979L);
      Context context0 = new Context();
      nativeArray0.getOwnPropertyDescriptor(context0, context0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(13, (Scriptable) null, false);
      assertEquals(1, idFunctionObject0.methodId());
      
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, (Context) null, (Scriptable) null, idFunctionObject0, context0.emptyArgs);
      assertEquals(1, idFunctionObject0.getLength());
      assertEquals(0L, nativeArray1.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(99L);
      Context context0 = Context.getCurrentContext();
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) nativeObject0, (ScriptableObject) nativeObject0, false);
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
      NativeArray nativeArray0 = new NativeArray((-1613L));
      NativeArray nativeArray1 = new NativeArray(8);
      Context context0 = Context.getCurrentContext();
      Scriptable scriptable0 = context0.initStandardObjects((ScriptableObject) nativeArray0);
      Scriptable scriptable1 = ScriptableObject.getFunctionPrototype(scriptable0);
      nativeArray1.put(",f]Hge_{|>DvnKLLw{", scriptable0, (Object) scriptable1);
      assertEquals(0L, nativeArray0.jsGet_length());
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(515L);
      NativeNumber nativeNumber0 = new NativeNumber(2);
      nativeArray0.exportAsJSClass(104, nativeNumber0, false);
      nativeArray0.delete(8);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1979L);
      NativeNumber nativeNumber0 = new NativeNumber(1209.84328);
      nativeArray0.exportAsJSClass(21, nativeNumber0, false);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(99L);
      nativeArray0.delete((-3603));
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      assertFalse(scriptableObject0.isSealed());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1979L);
      Context context0 = new Context();
      Long long0 = new Long(180);
      nativeArray0.getOwnPropertyDescriptor(context0, long0);
      NativeArray.init(nativeArray0, false);
      assertEquals(1979L, nativeArray0.jsGet_length());
      assertEquals(1979L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      scriptableObject0.put(11, (Scriptable) nativeArray0, (Object) nativeArray0);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(12L, nativeArray0.getLength());
  }
}
