/*

 * Tue Mar 03 18:57:19 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeObject;
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
      NativeArray nativeArray0 = new NativeArray(565L);
      Context context0 = Context.getContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(2, scriptableObject0, false);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, (Object[]) null);
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
  public void test01()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(4);
      nativeArray0.delete(100);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4041L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(1);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 1 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeArray.init(nativeObject0, true);
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object[] objectArray1 = nativeArray0.getAllIds();
      assertEquals(3, objectArray1.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray.setMaximumInitialCapacity(111);
      NativeArray nativeArray0 = new NativeArray(1804L);
      Byte byte0 = new Byte((byte) (-114));
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, byte0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(4);
      NativeArray nativeArray0 = new NativeArray(110);
      nativeArray0.delete(160);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArray.init(nativeIterator_StopIteration0, true);
      assertEquals("object", nativeIterator_StopIteration0.getTypeOf());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray((-954L));
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
  public void test07()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(1);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(184);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 184 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.put(342, (Scriptable) nativeArray0, (Object) "");
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(1);
      Class<Delegator> class0 = Delegator.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.Delegator
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Object;
      Scriptable scriptable0 = importerTopLevel0.getBuiltinPrototype(topLevel_Builtins0);
      NativeArray.setMaximumInitialCapacity(11);
      NativeArray nativeArray0 = new NativeArray(10000);
      nativeArray0.defineOwnProperty(context0, (Object) scriptable0, (ScriptableObject) importerTopLevel0, true);
      assertEquals(10000L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeArray nativeArray0 = new NativeArray((-3605L));
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(175, (Scriptable) null, false);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, (Scriptable) null, objectArray0);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(1);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, context0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(1);
      nativeArray0.getOwnPropertyDescriptor(context0, context0);
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
  @Ignore
  public void test14()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(4);
      nativeArray0.defineOwnProperty(context0, (Object) importerTopLevel0, (ScriptableObject) importerTopLevel0, false);
      assertEquals(4L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(1);
      nativeArray0.put("u/YGKEr>^Th-+gX", (Scriptable) importerTopLevel0, (Object) null);
      assertEquals(1L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4086L);
      nativeArray0.delete(0);
      NativeArray.init(nativeArray0, false);
      assertEquals(4086L, nativeArray0.getLength());
      assertEquals(4086L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(100);
      nativeArray0.getIndexIds();
      NativeArray.init(nativeArray0, false);
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(1);
      nativeArray0.delete((-1250));
      assertEquals(1L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1);
      nativeArray0.delete((-1250));
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
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1472L));
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeArray0, false);
      nativeArray0.put(1, (Scriptable) nativeGenerator0, (Object) null);
      NativeArray.init(nativeArray0, false);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray.setMaximumInitialCapacity(1);
      NativeArray nativeArray0 = new NativeArray(12L);
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
  public void test22()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(4);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeArray0, false);
      nativeArray0.put(8, (Scriptable) nativeArray0, (Object) nativeGenerator0);
      nativeArray0.defineOwnProperty(context0, (Object) importerTopLevel0, (ScriptableObject) importerTopLevel0, false);
  }
}
