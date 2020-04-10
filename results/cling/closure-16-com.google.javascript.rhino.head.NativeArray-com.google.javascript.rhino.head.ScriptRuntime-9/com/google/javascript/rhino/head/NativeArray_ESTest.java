/*

 * Tue Mar 03 20:28:36 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.UniqueTag;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(180);
      Class<NativeGenerator> class0 = NativeGenerator.class;
      ScriptableObject.getTypedProperty((Scriptable) nativeArray0, (-3134), class0);
      assertEquals(180L, nativeArray0.getLength());
      assertEquals(180L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(3);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 3 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 13, 120);
      ScriptableObject.putConstProperty(nativeArray0, "", idFunctionObject0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-5634L));
      NativeArray nativeArray1 = new NativeArray(2877L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      BaseFunction baseFunction0 = new BaseFunction(nativeArray1, nativeArray0);
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeArray0, baseFunction0, baseFunction0, context0.emptyArgs);
      nativeArray1.put("e/k3)x/$tG", (Scriptable) nativeArray0, (Object) boundFunction0);
      assertEquals(0L, nativeArray0.getLength());
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1397L));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-1424));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -1424 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(819L);
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
  public void test06()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(12);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 12 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      nativeArray0.defineOwnProperty(context0, (Object) contextFactory0, (ScriptableObject) nativeArray0, true);
      assertEquals(1L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(5);
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
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2782L));
      nativeArray0.delete((-7));
      assertEquals((-2782L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      synchronizer0.put(" TsW8YL;$G*aS&gG)l", (Scriptable) nativeArray0, (Object) context0);
      assertEquals(0L, nativeArray0.getLength());
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      int int0 = nativeArray0.findPrototypeId("language version");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes(1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(101L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(9);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 9 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Scriptable scriptable0 = Context.toObject((Object) context0, (Scriptable) importerTopLevel0);
      assertEquals("JavaObject", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-4568956265895094861L));
      int int0 = nativeArray0.findPrototypeId("StopIteration");
      assertEquals((-4568956265895094861L), nativeArray0.jsGet_length());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[18];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeArray0, 13);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2027L));
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 1, 129);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=1 MASTER=com.google.javascript.rhino.head.NativeArray@ca23857
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      Context context0 = Context.getContext();
      nativeArray0.getOwnPropertyDescriptor(context0, context0);
      assertEquals(2147483647L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.setAttributes((-21), 9);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(0);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      // Undeclared exception!
      try { 
        NativeArray.getLengthProperty(context0, scriptable0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[17];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Double double0 = new Double(13);
      nativeArray0.setInstanceIdValue(1, double0);
      assertEquals(13L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      ScriptableObject.putConstProperty(nativeArray0, "doctest failure running:\n", nativeArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      nativeArray0.getOwnPropertyDescriptor(context0, "jHJ)RvJ");
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9223372036854775789L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ScriptableObject.putProperty((Scriptable) nativeArray0, 6, (Object) context0);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(9223372036854775789L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      context0.initStandardObjects((ScriptableObject) nativeArray0, true);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-4568956265895094861L));
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(idFunctionObject0).getPrototype();
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(8).when(idFunctionObject0).methodId();
      doReturn((Object) null).when(idFunctionObject0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn(false).when(idFunctionObject0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(context0).getLanguageVersion();
      Object object0 = nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
      assertEquals(0.0, object0);
      assertNotNull(object0);
      assertEquals((-4568956265895094861L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(10);
      long long0 = NativeArray.getLengthProperty(context0, nativeArray0);
      assertEquals(10L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2078L));
      nativeArray0.delete(2);
      assertEquals((-2078L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-5634L));
      nativeArray0.put(160, (Scriptable) nativeArray0, (Object) null);
      nativeArray0.getIndexIds();
      assertEquals(161L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Double double0 = new Double(13);
      nativeArray0.setInstanceIdValue(1, double0);
      assertEquals(13L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0);
      Byte byte0 = new Byte((byte)7);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 2, (Object) byte0);
      assertEquals(3L, nativeArray0.jsGet_length());
      assertEquals(3L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((byte)105);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 2, (Object) nativeArray0);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(105L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeArray0, false);
      nativeArray0.defineOwnProperty(context0, 6, nativeGenerator0);
      nativeArray0.toArray(context0.emptyArgs);
      assertEquals(7L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1287L);
      Context context0 = Context.getCurrentContext();
      Double double0 = new Double(1);
      nativeArray0.getOwnPropertyDescriptor(context0, double0);
      assertEquals(1287L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeString nativeString0 = new NativeString("error reporter");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(14L, long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-708L));
      int int0 = nativeArray0.findPrototypeId("LtP7:$X74");
      assertEquals(0, int0);
      assertEquals((-708L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Context context0 = new Context();
      NativeString nativeString0 = new NativeString("language version");
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(101, nativeString0, false);
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, nativeString0, nativeString0, objectArray0);
      assertEquals(1, idFunctionObject0.getArity());
      assertEquals(6L, nativeArray1.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-5634L));
      NativeArray nativeArray1 = new NativeArray(2877L);
      nativeArray1.put(160, (Scriptable) nativeArray0, (Object) null);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(161L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object[] objectArray0 = new Object[18];
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.indexOf(uniqueTag0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArray nativeArray0 = new NativeArray((-765L));
      Object object0 = nativeArray0.get(13, (Scriptable) nativeIterator_StopIteration0);
      nativeArray0.put(14, (Scriptable) nativeArray0, object0);
      assertEquals(15L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-4568956265895094836L));
      ScriptableObject.putProperty((Scriptable) nativeArray0, (-1971924658), (Object) nativeArray0);
      assertEquals((-1971924657L), nativeArray0.jsGet_length());
      assertEquals((-1971924657L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(5225, nativeArray0, false);
      idFunctionObject0.checkPropertyChange("", nativeArray0, nativeArray0);
      assertEquals(0L, nativeArray0.getLength());
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object[] objectArray0 = new Object[18];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putConstProperty(nativeArray0, "+8H6S2Y62eum@l", nativeArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(18, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Context context0 = new Context();
      NativeString nativeString0 = new NativeString("language version");
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(101, nativeString0, false);
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, nativeString0, nativeString0, context0.emptyArgs);
      assertEquals(0L, nativeArray1.getLength());
      assertEquals("Array", nativeArray1.getClassName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 1, (Object) nativeArray0);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(2L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-5634L));
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      BaseFunction baseFunction0 = new BaseFunction(nativeArray0, nativeArray0);
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeArray0, baseFunction0, baseFunction0, context0.emptyArgs);
      nativeArray0.put("e/k3)x/$tG", (Scriptable) nativeArray0, (Object) boundFunction0);
      nativeArray0.put(160, (Scriptable) nativeArray0, (Object) null);
      assertEquals(161L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.exportAsJSClass(5225, nativeArray0, false);
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
  public void test48()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.delete(382);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967328L);
      nativeArray0.delete(26);
      assertEquals(4294967328L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(110);
      Float float0 = new Float(2729.0);
      nativeArray0.getOwnPropertyDescriptor(context0, float0);
      assertEquals(110L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeArray0, false);
      nativeArray0.defineOwnProperty(context0, 6, nativeGenerator0);
      nativeArray0.defineOwnProperty(context0, (Object) 120, (ScriptableObject) nativeGenerator0, true);
      assertEquals(121L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      ScriptableObject.putConstProperty(nativeArray0, "0\"Dl/", nativeArray0);
      nativeArray0.getIndexIds();
  }
}
