/*

 * Tue Mar 03 18:56:58 GMT 2020
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
import com.google.javascript.rhino.head.InterpretedFunction;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(365L);
      Class<ImporterTopLevel> class0 = ImporterTopLevel.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.ImporterTopLevel
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      NativeArray nativeArray0 = new NativeArray(428L);
      nativeArray0.put("^\u0004", (Scriptable) nativeBoolean0, (Object) "^\u0004");
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(17);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      NativeArray nativeArray0 = new NativeArray(4096L);
      // Undeclared exception!
      try { 
        nativeArray0.setInstanceIdValue(1, context0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // RangeError: Inappropriate array length.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(84L);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-974L));
      nativeArray0.delete(180);
      NativeArray.init(nativeArray0, false);
      assertEquals(0L, nativeArray0.jsGet_length());
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      long long0 = NativeArray.getLengthProperty(context0, importerTopLevel0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(428L);
      NativeArray.init(nativeArray0, false);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(2);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 2 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeArray.init((Scriptable) null, false);
      Object[] objectArray0 = new Object[9];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(9, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(160);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray(1540L);
      nativeArray0.delete(2);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty((Context) null, (Object) null, (ScriptableObject) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript((InterpreterData) null, (Object) null);
      NativeArray.init(interpretedFunction0, false);
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
  @Ignore
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeArray.init(nativeArray0, false);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(798);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 798 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(377L);
      Object[] objectArray0 = nativeArray0.toArray();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn((-1134)).when(idFunctionObject0).methodId();
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, nativeArray0, idFunctionObject0, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1134
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.enter();
      nativeArray0.getOwnPropertyDescriptor(context0, context0);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId((-632));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -632
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1851L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) nativeContinuation0, (ScriptableObject) nativeContinuation0, true);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      NativeArray nativeArray0 = new NativeArray(428L);
      nativeArray0.put("^\u0004", (Scriptable) nativeBoolean0, (Object) "^\u0004");
      NativeArray.init(nativeArray0, false);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(428L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray(2);
      nativeArray0.delete(4);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(120);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(377L);
      NativeArray.init((Scriptable) null, false);
      nativeArray0.delete((-17));
      assertFalse(nativeArray0.isSealed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(160);
      NativeArray nativeArray0 = new NativeArray(1540L);
      NativeArray.init(nativeArray0, true);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(376);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 376 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }
}
