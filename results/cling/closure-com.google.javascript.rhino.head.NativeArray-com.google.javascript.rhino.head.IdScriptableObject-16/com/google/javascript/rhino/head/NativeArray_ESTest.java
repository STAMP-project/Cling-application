/*

 * Tue Mar 03 19:02:28 GMT 2020
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
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      Long long0 = new Long(847L);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, long0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2610);
      ScriptableObject.hasProperty((Scriptable) nativeArray0, 13);
      Context context0 = Context.getCurrentContext();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(10, (Scriptable) null, false);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, (Scriptable) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      int int0 = nativeArray0.getAttributes("length");
      assertEquals(6, int0);
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2609);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes("/)\"gx+hoW");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property /)\"gx+hoW not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Float float0 = new Float((double) 4);
      nativeArray0.put(10, (Scriptable) importerTopLevel0, (Object) float0);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2870L);
      nativeArray0.delete("length");
      assertEquals(2870L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2609);
      NativeArray.init(nativeArray0, true);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(17);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(3071L);
      NativeArray nativeArray1 = (NativeArray)context0.initStandardObjects((ScriptableObject) nativeArray0, false);
      nativeArray1.defineOwnProperty(context0, nativeArray1, nativeArray1);
      assertEquals(3071L, nativeArray1.getLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeArray.init(nativeArray0, false);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(15);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(100);
      NativeObject nativeObject0 = new NativeObject();
      ScriptableObject.putProperty((Scriptable) nativeArray0, 2, (Object) nativeObject0);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(16);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10000);
      // Undeclared exception!
      try { 
        nativeArray0.setInstanceIdValue(1, nativeArray0);
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
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-1108681016));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -1108681016 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1919L));
      TopLevel topLevel0 = new TopLevel();
      nativeArray0.get((-537), (Scriptable) topLevel0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(11, topLevel0, false);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, topLevel0, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(18);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2610);
      Object[] objectArray0 = nativeArray0.getAllIds();
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      nativeArray1.getAllIds();
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2610);
      Object[] objectArray0 = nativeArray0.getAllIds();
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      nativeArray1.has(1802, (Scriptable) nativeArray0);
      Context context0 = Context.getCurrentContext();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(10, (Scriptable) null, false);
      // Undeclared exception!
      try { 
        nativeArray1.execIdCall(idFunctionObject0, context0, idFunctionObject0, (Scriptable) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2870L);
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      nativeArray1.delete(8);
      NativeArray.init(nativeArray0, true);
      assertEquals(2870L, nativeArray0.jsGet_length());
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2609);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext((Context) null);
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) nativeArray0, false);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(2609, scriptableObject0, false);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, scriptableObject0, (Object[]) null);
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
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2870L);
      NativeArray.init(nativeArray0, true);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      Scriptable scriptable0 = context0.newObject((Scriptable) nativeArray0);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(4, scriptable0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 4 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      Context context0 = Context.enter((Context) null);
      nativeArray0.getOwnPropertyDescriptor(context0, context0);
      NativeArray.init(nativeArray0, false);
      assertEquals(1431655764L, nativeArray0.getLength());
      assertEquals(1431655764L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2610);
      NativeArray.init(nativeArray0, false);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2870L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      nativeArray0.put((-14), (Scriptable) nativeArray0, (Object) contextFactory0);
      assertEquals(2870L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2870L);
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      Context context0 = Context.getCurrentContext();
      nativeArray1.defineOwnProperty(context0, context0, nativeArray0);
      assertEquals(2870L, nativeArray0.jsGet_length());
      assertEquals(6L, nativeArray1.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2609);
      nativeArray0.getAllIds();
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(17);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2609);
      NativeArray.init(nativeArray0, true);
      NativeArray nativeArray1 = new NativeArray(8);
      ScriptableObject.putProperty((Scriptable) nativeArray1, 13, (Object) null);
      assertEquals(14L, nativeArray1.jsGet_length());
      assertTrue(nativeArray1.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10000);
      EvaluatorException evaluatorException0 = new EvaluatorException("enumerable", "enumerable", 10000, "value", 1);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(4).when(idFunctionObject0).methodId();
      doReturn(evaluatorException0).when(idFunctionObject0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(415).when(context0).getLanguageVersion();
      nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, (Object[]) null);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context1 = new Context(contextFactory0);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context1, contextFactory0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2610);
      NativeArray.init(nativeArray0, true);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-1074), (Scriptable) nativeArray0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -1074 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "{HG+Tf4Ejg7H", (Object) "{HG+Tf4Ejg7H");
      nativeArray0.getIndexIds();
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2);
      NativeArray.init(nativeArray0, true);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(11, (Scriptable) nativeArray0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 11 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(100);
      NativeArray nativeArray1 = new NativeArray(1);
      Double double0 = new Double(1453.36949);
      nativeArray1.put(17, (Scriptable) nativeArray0, (Object) double0);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(100L, nativeArray0.getLength());
      assertEquals(100L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      nativeArray0.getOwnPropertyDescriptor((Context) null, (Object) null);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      nativeArray0.getOwnPropertyDescriptor(context0, "sDun?V_vY$6V");
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeArray nativeArray0 = new NativeArray(100);
      nativeArray0.put("language version", (Scriptable) importerTopLevel0, (Object) importerTopLevel0);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2610);
      NativeArray.init(nativeArray0, true);
      nativeArray0.delete(0);
      assertEquals(2610L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2610);
      NativeArray.init(nativeArray0, false);
      Object[] objectArray0 = nativeArray0.getAllIds();
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      Object[] objectArray1 = nativeArray1.getAllIds();
      assertEquals(3, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2870L);
      nativeArray0.delete((-7));
      NativeArray.init(nativeArray0, true);
      assertEquals(2870L, nativeArray0.getLength());
      assertEquals(2870L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      NativeArray nativeArray0 = new NativeArray(2);
      NativeArray.init(nativeArray0, true);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 170, (Object) contextFactory0);
      assertEquals(171L, nativeArray0.getLength());
      assertEquals(171L, nativeArray0.jsGet_length());
  }
}
