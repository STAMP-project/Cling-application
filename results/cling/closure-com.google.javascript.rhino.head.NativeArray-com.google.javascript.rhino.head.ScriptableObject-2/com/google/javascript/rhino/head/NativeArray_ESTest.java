/*

 * Tue Mar 03 19:06:44 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaArray;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      int int0 = nativeArray0.size();
      assertEquals(0, int0);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-38366372719436721L));
      TreeSet<BoundFunction> treeSet0 = new TreeSet<BoundFunction>((Comparator<? super BoundFunction>) null);
      boolean boolean0 = nativeArray0.containsAll(treeSet0);
      assertTrue(boolean0);
      
      nativeArray0.equivalentValues(treeSet0);
      assertTrue(nativeArray0.isExtensible());
      assertEquals((-38366372719436721L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Method[] methodArray0 = new Method[1];
      NativeArray nativeArray0 = new NativeArray(methodArray0);
      Class<NativeJavaArray> class0 = NativeJavaArray.class;
      ScriptableObject.getTypedProperty((Scriptable) nativeArray0, "KUg-K}M%9'Rfl@ghD\"", class0);
      int int0 = nativeArray0.lastIndexOf(class0);
      assertTrue(nativeArray0.isEmpty());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(559L);
      nativeArray0.get(0);
      // Undeclared exception!
      try { 
        nativeArray0.get(3411);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeArray.init(scriptable0, true);
      NativeArray nativeArray0 = new NativeArray((-38366372719436721L));
      TreeSet<BoundFunction> treeSet0 = new TreeSet<BoundFunction>((Comparator<? super BoundFunction>) null);
      boolean boolean0 = nativeArray0.containsAll(treeSet0);
      assertEquals("Array", nativeArray0.getClassName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      assertFalse(nativeIterator_StopIteration0.isSealed());
      
      Class<BaseFunction> class0 = BaseFunction.class;
      BaseFunction baseFunction0 = ScriptableObject.buildClassCtor((Scriptable) nativeIterator_StopIteration0, class0, true, true);
      assertTrue(baseFunction0.isEmpty());
      assertTrue(baseFunction0.isSealed());
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject.buildDataDescriptor(nativeIterator_StopIteration0, "", 2);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(20);
      nativeArray0.setDenseOnly(false);
      Object[] objectArray0 = nativeArray0.toArray();
      assertTrue(nativeArray0.isEmpty());
      assertEquals(20, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(20);
      nativeArray0.setDenseOnly(false);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      boolean boolean0 = nativeArray0.contains(nativeWith0);
      assertFalse(boolean0);
      assertTrue(nativeArray0.isExtensible());
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeArray.init(scriptable0, true);
      NativeArray nativeArray0 = new NativeArray((-38366372719436721L));
      // Undeclared exception!
      try { 
        nativeArray0.get(111);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ContextFactory contextFactory0 = new ContextFactory();
      Context context1 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-473L));
      EcmaError ecmaError0 = null;
      try {
        ecmaError0 = new EcmaError(nativeArray0, "pop", 72, 4, "pop");
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.containsAll(nativeArray0);
      ScriptableObject.defineProperty((Scriptable) nativeArray0, "length", (Object) nativeArray0.READONLY, 8);
      assertEquals(1L, nativeArray0.getLength());
      assertEquals(1L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1713L);
      Object[] objectArray0 = new Object[1];
      nativeArray0.toArray(objectArray0);
      NativeArray.init(nativeArray0, false);
      assertEquals("object", nativeArray0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      int int0 = nativeArray0.indexOf((Object) null);
      assertEquals((-1), int0);
      assertTrue(nativeArray0.isExtensible());
      assertEquals((-1L), nativeArray0.getLength());
  }
}
