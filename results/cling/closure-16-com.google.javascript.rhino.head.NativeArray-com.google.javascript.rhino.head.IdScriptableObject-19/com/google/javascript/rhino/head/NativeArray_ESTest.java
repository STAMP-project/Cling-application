/*

 * Tue Mar 03 19:01:17 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.WrapFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1223L);
      nativeArray0.delete(1055);
      assertEquals(1223L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes("heh<}6l4J0NL|g&c", (Scriptable) baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property heh<}6l4J0NL|g&c not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(620L);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeArray0.has((-966), (Scriptable) nativeArray0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(1182, nativeArray0, false);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext((Context) null);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, nativeIterator_StopIteration0, nativeArray0, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeArray0.defineOwnProperty(context0, (Object) importerTopLevel0, (ScriptableObject) importerTopLevel0, false);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(620L);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeArray0.get((-59), (Scriptable) nativeIterator_StopIteration0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(1182, nativeArray0, false);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext((Context) null);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, nativeIterator_StopIteration0, nativeArray0, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      NativeArray nativeArray1 = new NativeArray(13);
      nativeArray1.getIndexIds();
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
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) nativeArray0, false);
      scriptableObject0.delete(3389);
      assertSame(scriptableObject0, nativeArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(150);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 0 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WrapFactory wrapFactory0 = new WrapFactory();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      NativeArray nativeArray0 = new NativeArray(1);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.String;
      Scriptable scriptable0 = importerTopLevel0.getBuiltinPrototype(topLevel_Builtins0);
      nativeArray0.get(107, scriptable0);
      Class<IdFunctionObject> class0 = IdFunctionObject.class;
      Scriptable scriptable1 = wrapFactory0.wrapJavaClass(context0, scriptable0, class0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(847, scriptable1, false);
      nativeArray0.execIdCall(idFunctionObject0, context0, (Scriptable) null, scriptable0, context0.emptyArgs);
      assertFalse(idFunctionObject0.isSealed());
      assertEquals(1, idFunctionObject0.getLength());
      assertFalse(idFunctionObject0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967300L);
      Context context0 = Context.getContext();
      nativeArray0.getOwnPropertyDescriptor(context0, (Object) null);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(5);
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
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      NativeArray nativeArray1 = new NativeArray(3630L);
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeArray1.defineOwnProperty(context0, (Object) importerTopLevel0, (ScriptableObject) nativeArray0, true);
      nativeArray0.put(131, (Scriptable) nativeArray1, (Object) context0);
      assertEquals(3630L, nativeArray1.jsGet_length());
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(808L);
      Object[] objectArray0 = nativeArray0.getIds();
      assertEquals(0, objectArray0.length);
      
      NativeArray.init(nativeArray0, true);
      assertEquals(808L, nativeArray0.jsGet_length());
      assertEquals(808L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-1119));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -1119 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.enter();
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
  public void test14()  throws Throwable  {
      WrapFactory wrapFactory0 = new WrapFactory();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      NativeArray nativeArray0 = new NativeArray(1);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.String;
      Scriptable scriptable0 = importerTopLevel0.getBuiltinPrototype(topLevel_Builtins0);
      Class<IdFunctionObject> class0 = IdFunctionObject.class;
      Scriptable scriptable1 = wrapFactory0.wrapJavaClass(context0, scriptable0, class0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(847, scriptable1, false);
      Object[] objectArray0 = new Object[5];
      nativeArray0.execIdCall(idFunctionObject0, context0, (Scriptable) null, scriptable0, objectArray0);
      assertFalse(idFunctionObject0.isEmpty());
      assertFalse(idFunctionObject0.isSealed());
      assertEquals(1, idFunctionObject0.getArity());
      assertEquals(1L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      NativeArray nativeArray1 = new NativeArray(47L);
      Context context0 = Context.getCurrentContext();
      Delegator delegator0 = new Delegator();
      nativeArray1.put(150, (Scriptable) nativeArray0, (Object) delegator0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
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
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      nativeArray0.getOwnPropertyDescriptor(context0, contextFactory0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(3, (Scriptable) null, false);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, (Scriptable) null, idFunctionObject0, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      NativeArray.init(nativeArray0, true);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      nativeArray0.put("[1eIiuH'J", (Scriptable) importerTopLevel0, (Object) importerTopLevel0);
      assertFalse(importerTopLevel0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = (NativeArray)context0.topCallScope;
      // Undeclared exception!
      try { 
        NativeArray.init(nativeArray0, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Array.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray((-237L));
      nativeArray0.getOwnPropertyDescriptor(context0, nativeArray0.READONLY);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      Long long0 = new Long(160);
      nativeArray0.getOwnPropertyDescriptor(context0, long0);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId((-838));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -838
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }
}
