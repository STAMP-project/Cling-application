/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 07:56:58 GMT 2019
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
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(120);
      nativeArray0.defaultPut("-", "-");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.defaultPut("no message resource found for message property ", "no message resource found for message property ");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(3, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn("").when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      long long0 = NativeArray.getLengthProperty(context0, scriptable0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[19];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.defaultPut("0W(M=uVymMhl+8&B-o", nativeArray0.READONLY);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(19, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = new Context();
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn("-Infinity").when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      long long0 = NativeArray.getLengthProperty(context0, scriptable0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.findPrototypeId("@DrtiuSMvT");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(8);
      int int0 = nativeArray0.findPrototypeId("JavaException");
      assertEquals(0, int0);
      assertEquals(8L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0);
      int int0 = nativeArray0.findPrototypeId("[DiyFp f:");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(5);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(553);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 553 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
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
  public void test10()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.defaultPut("error reporter", context0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-939L));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-264));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -264 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1675L);
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
  public void test13()  throws Throwable  {
      Context context0 = Context.enter();
      Float float0 = new Float((double) 12);
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.defineOwnProperty(context0, (Object) float0, (ScriptableObject) nativeArray0, true);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(160);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 160 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(9218868437227405312L);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, (Scriptable) null);
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor(context0, nativeWith0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeWith", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes(1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(150);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(111);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 111 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(150);
      Object[] objectArray0 = new Object[4];
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(2727, nativeArray0, false);
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, nativeArray0, idFunctionObject0, objectArray0);
      assertEquals(4L, nativeArray1.jsGet_length());
      assertEquals(1, idFunctionObject0.getArity());
      assertEquals(150L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-939L));
      Context context0 = Context.getCurrentContext();
      Byte byte0 = new Byte((byte)97);
      nativeArray0.getOwnPropertyDescriptor(context0, byte0);
      assertEquals((-939L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(974L);
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      // Undeclared exception!
      try { 
        nativeArray0.setInstanceIdValue(1, synchronizer0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(31);
      Long long0 = new Long(0);
      nativeArray0.setInstanceIdValue(1, long0);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      long long0 = NativeArray.getLengthProperty(context0, scriptableObject0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = Context.enter();
      NativeString nativeString0 = new NativeString("error reporter");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(14L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      long long0 = NativeArray.getLengthProperty(context0, nativeArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-140L));
      nativeArray0.get((-1056), (Scriptable) null);
      assertEquals((-140L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(120, (Scriptable) null, false);
      TopLevel topLevel0 = new TopLevel();
      nativeArray0.put("language version", (Scriptable) idFunctionObject0, (Object) topLevel0);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, context0, 13, "ec(l-9Kraj*}", 123, nativeArray0);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=13 MASTER=com.google.javascript.rhino.head.NativeArray@5886dba7
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) null, (ScriptableObject) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(21);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, "error reporter");
      assertNull(scriptableObject0);
      assertEquals(21L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9218868437227405312L);
      nativeArray0.has(58, (Scriptable) null);
      assertEquals(9218868437227405312L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeArray nativeArray0 = new NativeArray(548L);
      nativeArray0.defineOwnProperty(context0, (Object) scriptableObject0, scriptableObject0, true);
      nativeArray0.delete(0);
      assertEquals(548L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-843L));
      nativeArray0.exportAsJSClass(216, (Scriptable) null, false);
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1099L);
      assertEquals(1099L, nativeArray0.getLength());
      
      Object[] objectArray0 = new Object[0];
      Object[] objectArray1 = nativeArray0.toArray(objectArray0);
      assertEquals(1099, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(6);
      nativeArray0.get(130, (Scriptable) null);
      assertEquals(6L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1606L);
      nativeArray0.delete((-3794));
      assertEquals(1606L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1124L));
      nativeArray0.delete(1192);
      assertEquals((-1124L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2374L);
      ScriptableObject.putProperty((Scriptable) nativeArray0, (-1882356977), (Object) nativeArray0);
      assertEquals(2374L, nativeArray0.getLength());
      assertEquals(2374L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-852L));
      nativeArray0.delete(2);
      assertEquals((-852L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(4L);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeArray0.defineOwnProperty(context0, context0, nativeContinuation0);
      boolean boolean0 = nativeArray0.containsAll(nativeArray0);
      assertEquals(4L, nativeArray0.jsGet_length());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(5171L);
      nativeArray0.put(1, (Scriptable) nativeArray0, (Object) null);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(5171L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-757L));
      ScriptableObject.putProperty((Scriptable) nativeArray0, 1, (Object) "Number");
      assertEquals(2L, nativeArray0.jsGet_length());
      assertEquals(2L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeArray0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.exportAsJSClass(120, (Scriptable) null, false);
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
  @Ignore
  public void test43()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(5171L);
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray1 = (NativeArray)context0.newArray((Scriptable) nativeArray0, 663);
      nativeArray0.put(663, (Scriptable) nativeArray1, (Object) null);
      assertEquals(664L, nativeArray1.jsGet_length());
      assertEquals(664L, nativeArray1.getLength());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeArray0, true);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 130, (Object) nativeGenerator0);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(131L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Class<TopLevel> class0 = TopLevel.class;
      Scriptable scriptable0 = Context.toObject((Object) context0, (Scriptable) importerTopLevel0, (Class<?>) class0);
      assertEquals("JavaObject", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test46()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(150);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(2727, nativeArray0, false);
      nativeArray0.execIdCall(idFunctionObject0, context0, nativeArray0, idFunctionObject0, context0.emptyArgs);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test47()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray((-818));
      nativeArray0.getOwnPropertyDescriptor(context0, nativeArray0.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) nativeArray0, true);
      // Undeclared exception!
      try { 
        nativeArray0.exportAsJSClass(140, scriptableObject0, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Array.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }
}
