/*

 * Tue Mar 03 20:29:38 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Callable;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.JavaMembers;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1483L);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      nativeWith0.get((-1444815795), (Scriptable) nativeArray0);
      assertEquals(1483L, nativeArray0.jsGet_length());
      assertEquals(1483L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9221120237041090560L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-124));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -124 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeArray0.put(", ", (Scriptable) nativeContinuation0, (Object) ", ");
      assertEquals("object", nativeArray0.getTypeOf());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeArray nativeArray0 = new NativeArray(8);
      nativeArray0.exportAsJSClass(13, nativeContinuation0, true);
      // Undeclared exception!
      try { 
        nativeArray0.delete(3);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: 3.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(8);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-730));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -730 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(14L);
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
  public void test06()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
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
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.has((-8), (Scriptable) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1312L));
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext((Context) null);
      BaseFunction baseFunction0 = new BaseFunction();
      nativeArray0.defineOwnProperty(context0, (Object) null, (ScriptableObject) baseFunction0, false);
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1483L);
      nativeArray0.delete((-19));
      assertEquals(1483L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(130);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      nativeWith0.put(" `]J-#^^1F", (Scriptable) nativeArray0, (Object) context0);
      assertEquals(130L, nativeArray0.jsGet_length());
      assertEquals(130L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[13];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.findPrototypeId(", ");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[14];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes(12);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4240L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(64);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 64 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      // Undeclared exception!
      nativeArray0.lastIndexOf(context0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[14];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeArray0, 3);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(24L);
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeArray0, 8);
      assertEquals(24L, nativeArray0.jsGet_length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(130);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 1, 140);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, integerArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=1 MASTER=com.google.javascript.rhino.head.NativeArray@730be4d5
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, context0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "V>: ", (Object) nativeArray0);
      assertEquals(3L, nativeArray0.jsGet_length());
      assertEquals(3L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(3128L);
      nativeArray0.getOwnPropertyDescriptor(context0, context0);
      assertEquals(3128L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext((Context) null);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      nativeArray0.defineOwnProperty(context0, importerTopLevel0, importerTopLevel0);
      nativeArray0.has(22, (Scriptable) null);
      assertEquals(4L, nativeArray0.jsGet_length());
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Scriptable scriptable0 = context0.initStandardObjects((ScriptableObject) nativeArray0);
      assertEquals("Array", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      long long0 = NativeArray.getLengthProperty(context0, nativeArray0);
      assertEquals(2147483647L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1172L);
      nativeArray0.setInstanceIdValue(1, (Object) null);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.delete(140);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-348L));
      Context context0 = Context.enter();
      Double double0 = new Double(11);
      nativeArray0.getOwnPropertyDescriptor(context0, double0);
      assertEquals((-348L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeArray nativeArray0 = new NativeArray(160);
      nativeObject0.put(2, (Scriptable) nativeArray0, (Object) nativeArray0);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(160L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 161, (Object) nativeArray0);
      nativeArray0.toArray();
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-422L));
      NativeArray.init(nativeArray0, false);
      assertEquals(0L, nativeArray0.jsGet_length());
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1483L);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      nativeArray0.put(1613, (Scriptable) nativeWith0, (Object) nativeWith0);
      assertEquals(1614L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Context context0 = Context.enter();
      NativeString nativeString0 = new NativeString("language version");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(16L, long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10000L);
      int int0 = nativeArray0.findPrototypeId("t@WQ^j0_^");
      assertEquals(0, int0);
      assertEquals(10000L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object[] objectArray0 = new Object[14];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(14, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1483L);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      nativeWith0.put(",ae;e-LJ|n8#j#SX]-}", (Scriptable) nativeArray0, (Object) ",ae;e-LJ|n8#j#SX]-}");
      nativeArray0.getIndexIds();
      assertEquals(1483L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2697L);
      Context context0 = Context.enter();
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = nativeArray1.exportAsJSClass(110, nativeArray0, true);
      NativeArray nativeArray2 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, nativeArray1, nativeArray1, objectArray0);
      assertEquals(1L, nativeArray2.getLength());
      assertEquals(2697L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Scriptable scriptable0 = Context.toObject((Object) context0, (Scriptable) importerTopLevel0);
      assertEquals("JavaObject", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2697L);
      Context context0 = Context.enter();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeArray0, (Callable) null, nativeArray0, context0.emptyArgs);
      Object object0 = nativeArray0.get(0, (Scriptable) boundFunction0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1483L);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      nativeArray0.put((-2147231535), (Scriptable) nativeWith0, (Object) ",ae;e-LJ|n8#j#SX]-}");
      nativeArray0.getIndexIds();
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(119L);
      ScriptableObject.defineProperty((Scriptable) nativeArray0, "-_.!~*'()", (Object) nativeArray0, 8);
      assertEquals(119L, nativeArray0.getLength());
      assertEquals(119L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put(140, (Scriptable) nativeArray0, context0.interpreterSecurityDomain);
      nativeIterator_StopIteration0.put(2217, (Scriptable) nativeArray0, (Object) "language version");
      assertEquals(2218L, nativeArray0.jsGet_length());
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeArray nativeArray0 = new NativeArray(8);
      nativeArray0.exportAsJSClass(419, nativeContinuation0, true);
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
  public void test42()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(8);
      nativeArray0.delete(3);
      assertEquals(8L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity((-2428));
      NativeArray nativeArray0 = new NativeArray((-1399L));
      nativeArray0.delete(0);
      assertEquals((-1399L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(757);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      Byte byte0 = new Byte((byte)68);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, byte0);
      assertEquals(757L, nativeArray0.jsGet_length());
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test45()  throws Throwable  {
      Object[] objectArray0 = new Object[14];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(true, "message", classLoader0);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty((Context) null, (Object) "message", (ScriptableObject) nativeJavaPackage0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(60545L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Class<TopLevel> class0 = TopLevel.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeArray0, class0);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) nativeJavaClass0, (ScriptableObject) nativeJavaMethod0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeJavaClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "", (Object) nativeArray0);
      assertEquals(3L, nativeArray0.jsGet_length());
      assertEquals(3L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2697L);
      Context context0 = Context.enter();
      NativeArray nativeArray1 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = nativeArray1.exportAsJSClass(110, nativeArray0, true);
      nativeArray0.execIdCall(idFunctionObject0, context0, nativeArray1, nativeArray1, context0.emptyArgs);
  }
}
