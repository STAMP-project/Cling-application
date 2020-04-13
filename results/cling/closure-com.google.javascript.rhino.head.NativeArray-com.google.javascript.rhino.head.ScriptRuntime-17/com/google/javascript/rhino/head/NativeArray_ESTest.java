/*

 * Tue Mar 03 20:30:52 GMT 2020
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
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.MemberBox;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object object0 = nativeArray0.get((-643), (Scriptable) null);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9223372036854775790L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(18);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 18 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Iterator iterator0 = nativeArray0.iterator();
      NativeArray nativeArray1 = new NativeArray(8);
      nativeArray0.put("Infinity", (Scriptable) nativeArray1, (Object) iterator0);
      assertEquals(8L, nativeArray1.getLength());
      assertEquals(8L, nativeArray1.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2822L);
      BaseFunction baseFunction0 = new BaseFunction();
      nativeArray0.exportAsJSClass(13, baseFunction0, true);
      // Undeclared exception!
      try { 
        nativeArray0.delete(23);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: 23.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(751L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-1952464512));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -1952464512 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1350L));
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) null, false);
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
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(22L);
      Class<BaseFunction> class0 = BaseFunction.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.BaseFunction
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(13);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 13 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(140);
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("language version");
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) nativeJavaPackage0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-5353181642124984136L));
      nativeArray0.delete((-1597));
      assertEquals((-5353181642124984136L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put(" where it expected String, Number, Boolean or Scriptable instance. Please check your code for missing Context.javaToJS() call.", (Scriptable) nativeArray0, (Object) context0);
      assertEquals(4L, nativeArray0.jsGet_length());
      assertEquals(4L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(6L);
      int int0 = nativeArray0.findPrototypeId("%");
      assertEquals(0, int0);
      assertEquals(6L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(120);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(18);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 18 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = null;
      try {
        nativeArray0 = new NativeArray(context0.emptyArgs);
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
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(5);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 0, 110);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, (Scriptable) null, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=0 MASTER=com.google.javascript.rhino.head.NativeArray@65bef890
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9221120237041090560L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      nativeArray0.getOwnPropertyDescriptor(context0, nativeArray0.READONLY);
      assertEquals(9221120237041090560L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "TypeError: ", (Object) "Iterator");
      assertEquals(4L, nativeArray0.getLength());
      assertEquals(4L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, "{C@!");
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      ScriptableObject.hasProperty((Scriptable) nativeArray0, 3353);
      assertEquals(2147483647L, nativeArray0.getLength());
      assertEquals(2147483647L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Iterator iterator0 = nativeArray0.iterator();
      nativeArray0.put("Infinity", (Scriptable) nativeArray0, (Object) iterator0);
      nativeArray0.getIndexIds();
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeArray0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 13, (Object) nativeArray0);
      assertEquals(14L, nativeArray0.jsGet_length());
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, 110);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0);
      BaseFunction baseFunction0 = new BaseFunction();
      nativeArray0.exportAsJSClass(71, baseFunction0, false);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0, "B%Mi< ^.3K");
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(synchronizer0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      NativeArray.getLengthProperty(context0, scriptable0);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable1 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(scriptable1).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      long long0 = NativeArray.getLengthProperty(context1, scriptable1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(8);
      assertEquals(8L, nativeArray0.jsGet_length());
      
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeArray nativeArray0 = (NativeArray)ScriptableObject.getArrayPrototype(scriptableObject0);
      scriptableObject0.put(5, (Scriptable) nativeArray0, (Object) context0);
      assertEquals(6L, nativeArray0.jsGet_length());
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(0);
      NativeArray nativeArray0 = new NativeArray(380L);
      nativeArray0.get(0, (Scriptable) nativeArray0);
      assertEquals(380L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      Byte byte0 = new Byte((byte)6);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, byte0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1554L));
      // Undeclared exception!
      try { 
        ScriptableObject.defineProperty((Scriptable) nativeArray0, "<\"hC^{BuEi*6s", (Object) null, 2822);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2822
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.defineProperty("-d", (Object) "-d", 6);
      assertEquals(9L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Context context0 = new Context();
      NativeString nativeString0 = new NativeString("error reporter");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(14L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1554L));
      int int0 = nativeArray0.findPrototypeId("?Y%c9sOsP");
      assertEquals((-1554L), nativeArray0.getLength());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(4, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2164);
      NativeCall nativeCall0 = new NativeCall();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(2164, nativeCall0, true);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, nativeCall0, idFunctionObject0, context0.emptyArgs);
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
  public void test34()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Context.toObject((Object) context0, (Scriptable) importerTopLevel0);
      NativeArray nativeArray0 = null;
      try {
        nativeArray0 = new NativeArray(context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(5);
      ScriptableObject.getProperty((Scriptable) nativeArray0, 160);
      assertEquals(5L, nativeArray0.getLength());
      assertEquals(5L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, (-784), (Object) nativeArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(6, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2822L);
      int int0 = nativeArray0.findPrototypeId("{n&UQ-vW9maW");
      assertEquals(2822L, nativeArray0.getLength());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = null;
      try {
        nativeArray0 = new NativeArray(context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.activatePrototypeMap(97);
      // Undeclared exception!
      try { 
        nativeArray0.getIndexIds();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 24
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.delete(473);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(5);
      nativeArray0.getOwnPropertyDescriptor(context0, 5);
      assertEquals(5L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeArray0.defineOwnProperty((Context) null, (Object) null, (ScriptableObject) nativeIterator_StopIteration0, true);
      assertEquals(3L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      NativeJavaMethod nativeJavaMethod0 = new NativeJavaMethod((MemberBox) null, "error reporter");
      nativeArray0.defineOwnProperty(context0, (Object) contextFactory0, (ScriptableObject) nativeJavaMethod0, false);
      assertEquals(1431655764L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(22L);
      ScriptableObject.defineProperty((Scriptable) nativeArray0, "0", (Object) "0", 12);
  }
}
