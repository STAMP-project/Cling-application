/*

 * Tue Mar 03 18:57:52 GMT 2020
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
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeObject;
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
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      nativeArray0.delete(6);
      assertEquals(2147483647L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1124L));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(22);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 22 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4503599627370496L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(2310);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 2310 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeObject nativeObject0 = new NativeObject();
      nativeObject0.put("(K", (Scriptable) nativeArray0, (Object) nativeArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(710);
      nativeArray0.delete((-13));
      assertEquals(710L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MemberBox[] memberBoxArray0 = new MemberBox[1];
      NativeArray nativeArray0 = new NativeArray(memberBoxArray0);
      NativeArray nativeArray1 = new NativeArray(2);
      IdFunctionObject idFunctionObject0 = nativeArray1.exportAsJSClass(13, nativeArray0, true);
      assertEquals(2L, nativeArray1.jsGet_length());
      assertTrue(idFunctionObject0.isSealed());
      assertEquals(1, idFunctionObject0.getLength());
      assertEquals(1, idFunctionObject0.methodId());
      
      nativeArray0.delete(246);
      assertEquals(1L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2931L);
      NativeArray.init(nativeArray0, false);
      Object[] objectArray0 = nativeArray0.getAllIds();
      assertEquals(2, objectArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      MemberBox[] memberBoxArray0 = new MemberBox[6];
      NativeArray.setMaximumInitialCapacity((-16777216));
      NativeArray nativeArray0 = new NativeArray(memberBoxArray0);
      NativeArray nativeArray1 = new NativeArray(1);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = Context.getContext();
      nativeArray1.getOwnPropertyDescriptor(context0, contextFactory0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(13, nativeArray1, true);
      assertEquals(1, idFunctionObject0.methodId());
      assertEquals(1, idFunctionObject0.getArity());
      assertEquals(1L, nativeArray1.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      MemberBox[] memberBoxArray0 = new MemberBox[6];
      NativeArray.setMaximumInitialCapacity((-16777216));
      NativeArray nativeArray0 = new NativeArray(memberBoxArray0);
      NativeArray nativeArray1 = new NativeArray(1);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeObject nativeObject0 = new NativeObject();
      nativeArray0.put(4, (Scriptable) nativeArray1, (Object) nativeObject0);
      assertEquals(5L, nativeArray1.jsGet_length());
      assertFalse(nativeArray1.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      MemberBox[] memberBoxArray0 = new MemberBox[6];
      NativeArray nativeArray0 = new NativeArray(memberBoxArray0);
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      nativeArray0.put((-16), (Scriptable) nativeArray0, (Object) importerTopLevel0);
      assertEquals("global", importerTopLevel0.getClassName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      NativeArray.init(scriptable0, false);
      NativeArray nativeArray0 = new NativeArray((-5096825099203863601L));
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0, nativeContinuation0);
      synchronizer0.put(13, (Scriptable) nativeArray0, (Object) nativeArray0);
      assertEquals(14L, nativeArray0.getLength());
      assertEquals(14L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2916L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      nativeArray0.getOwnPropertyDescriptor(context0, context0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(99, (Scriptable) null, false);
      assertEquals(1, idFunctionObject0.methodId());
      
      nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, (Scriptable) null, context0.emptyArgs);
      assertFalse(idFunctionObject0.isSealed());
      assertEquals(2916L, nativeArray0.getLength());
      assertEquals(1, idFunctionObject0.getArity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2931L);
      NativeArray.init(nativeArray0, false);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-656));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -656 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MemberBox[] memberBoxArray0 = new MemberBox[6];
      NativeArray nativeArray0 = new NativeArray(memberBoxArray0);
      NativeArray nativeArray1 = new NativeArray(2);
      IdFunctionObject idFunctionObject0 = nativeArray1.exportAsJSClass(13, nativeArray0, true);
      assertEquals(1, idFunctionObject0.methodId());
      assertEquals(1, idFunctionObject0.getArity());
      assertFalse(idFunctionObject0.isEmpty());
      
      nativeArray1.put(0, (Scriptable) nativeArray0, (Object) null);
      assertEquals(6L, nativeArray0.jsGet_length());
      assertEquals(6L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2931L);
      NativeArray.init(nativeArray0, false);
      Class<NativeJavaMethod> class0 = NativeJavaMethod.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeJavaMethod
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      MemberBox[] memberBoxArray0 = new MemberBox[6];
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      NativeArray nativeArray0 = new NativeArray(memberBoxArray0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      // Undeclared exception!
      try { 
        nativeArray0.setInstanceIdValue(1, importerTopLevel0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // RangeError: Inappropriate array length.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      MemberBox[] memberBoxArray0 = new MemberBox[6];
      NativeArray nativeArray0 = new NativeArray(memberBoxArray0);
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(99, importerTopLevel0, true);
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, importerTopLevel0, nativeArray0, memberBoxArray0);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      int int0 = nativeArray1.lastIndexOf(nativeWith0);
      assertEquals((-1), int0);
      assertEquals(1, idFunctionObject0.getArity());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeArray nativeArray0 = new NativeArray(130);
      nativeArray0.defineOwnProperty(context0, (Object) contextFactory0, (ScriptableObject) importerTopLevel0, true);
      assertEquals(Integer.MAX_VALUE, context0.getMaximumInterpreterStackDepth());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(120);
      NativeArray nativeArray1 = new NativeArray(1);
      nativeArray0.put("language version", (Scriptable) nativeArray1, (Object) nativeArray1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.delete(0);
      NativeArray.init(nativeContinuation0, false);
      assertFalse(nativeContinuation0.isSealed());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MemberBox[] memberBoxArray0 = new MemberBox[6];
      NativeArray nativeArray0 = new NativeArray(memberBoxArray0);
      NativeArray.init(nativeArray0, false);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(6, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      MemberBox[] memberBoxArray0 = new MemberBox[9];
      NativeArray nativeArray0 = new NativeArray(memberBoxArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeArray0.put(180, (Scriptable) nativeArray0, (Object) context0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray((-237L));
      Double double0 = new Double(170);
      nativeArray0.getOwnPropertyDescriptor(context0, double0);
  }
}
