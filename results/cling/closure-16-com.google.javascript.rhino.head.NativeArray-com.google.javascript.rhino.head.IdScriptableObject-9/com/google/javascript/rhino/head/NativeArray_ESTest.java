/*

 * Tue Mar 03 18:57:51 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaArray;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      // Undeclared exception!
      try { 
        nativeCall0.getAttributes("language version");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property language version not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2362L);
      NativeCall nativeCall0 = new NativeCall();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeArray0.put("concat", (Scriptable) nativeCall0, (Object) nativeContinuation0);
      assertFalse(nativeCall0.isEmpty());
      assertEquals(2362L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-227L));
      nativeArray0.delete(309);
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      assertFalse(importerTopLevel0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      long long0 = NativeArray.getLengthProperty(context0, importerTopLevel0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(12);
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
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.getAllIds();
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      nativeArray0.delete(10000);
      NativeArray.init(nativeArray0, false);
      assertEquals(4294967295L, nativeArray0.getLength());
      assertEquals(4294967295L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(110);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 110 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Number;
      Scriptable scriptable0 = importerTopLevel0.getBuiltinPrototype(topLevel_Builtins0);
      NativeArray nativeArray0 = new NativeArray(12);
      Scriptable scriptable1 = context0.newArray(scriptable0, 13);
      scriptable1.put((-3613), (Scriptable) nativeArray0, (Object) scriptable1);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(12L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(452);
      nativeArray0.put(65535, (Scriptable) nativeArray0, (Object) null);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1);
      NativeString nativeString0 = new NativeString("indexOf");
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) nativeString0, (ScriptableObject) nativeString0, false);
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
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-227L));
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Class<NativeJavaArray> class0 = NativeJavaArray.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeJavaArray
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeString nativeString0 = new NativeString("indexOf");
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) nativeString0, (ScriptableObject) nativeString0, false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(889L);
      Object[] objectArray0 = nativeArray0.getAllIds();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(1666, (Scriptable) null, false);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, (Context) null, (Scriptable) null, idFunctionObject0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(889L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeArray0.getIndexIds();
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(889L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeArray0.delete(6);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(889L);
      nativeArray0.getAllIds();
      nativeArray0.exportAsJSClass(1666, (Scriptable) null, false);
      // Undeclared exception!
      try { 
        nativeArray0.getAllIds();
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
  public void test17()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(12);
      nativeArray0.delete((-3334));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(12);
      nativeArray0.put(4, (Scriptable) nativeArray0, (Object) nativeArray0);
  }
}
