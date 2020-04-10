/*

 * Tue Mar 03 20:47:34 GMT 2020
 */

package com.google.javascript.rhino.head.tools.shell;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Function;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaObject;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.tools.shell.Global;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Global_ESTest extends Global_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        Global.sync((Context) null, baseFunction0, objectArray0, baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Context context0 = new Context();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("language version");
      Global global0 = new Global(context0);
      PrintStream printStream0 = global0.getOut();
      assertNotNull(printStream0);
      
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Number;
      IdFunctionObject idFunctionObject0 = (IdFunctionObject)TopLevel.getBuiltinCtor(context0, (Scriptable) global0, topLevel_Builtins0);
      global0.setOut(printStream0);
      Global.print(context0, nativeJavaPackage0, context0.emptyArgs, idFunctionObject0);
      assertFalse(idFunctionObject0.isSealed());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Synchronizer synchronizer0 = new Synchronizer(scriptableObject0);
      Object[] objectArray0 = context0.getElements(synchronizer0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Function;
      Scriptable scriptable0 = TopLevel.getBuiltinPrototype((Scriptable) scriptableObject0, topLevel_Builtins0);
      Synchronizer synchronizer0 = new Synchronizer(scriptable0);
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) synchronizer0;
      Object object0 = Global.toint32(context0, scriptableObject0, objectArray0, synchronizer0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Object[] objectArray0 = new Object[5];
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        Global.doctest(context0, scriptableObject0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global();
      // Undeclared exception!
      try { 
        Global.runCommand(context0, global0, objectArray0, (Function) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        Global.spawn(context0, scriptableObject0, context0.emptyArgs, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Object[] objectArray0 = new Object[2];
      objectArray0[1] = (Object) scriptable0;
      Class<NativeObject> class0 = NativeObject.class;
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass(importerTopLevel0, class0);
      // Undeclared exception!
      try { 
        Global.runCommand(context0, nativeJavaClass0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot convert null to an object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        Global.pipe(false, pipedInputStream0, (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        Global.runCommand(context0, nativeJavaObject0, context0.emptyArgs, (Function) null);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // The first argument to runCommand must be a command name.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Global global0 = new Global();
      InputStream inputStream0 = global0.getIn();
      InputStream inputStream1 = global0.getIn();
      assertSame(inputStream1, inputStream0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Object[] objectArray0 = new Object[1];
      Class<Delegator> class0 = Delegator.class;
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass(scriptableObject0, class0);
      // Undeclared exception!
      try { 
        Global.spawn(context0, scriptableObject0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      Function function1 = mock(Function.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) function0;
      Context context0 = new Context();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("language version", classLoader0);
      BaseFunction baseFunction0 = new BaseFunction(function1, nativeJavaPackage0);
      // Undeclared exception!
      try { 
        Global.seal(context0, baseFunction0, objectArray0, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function supports only sealing of ScriptableObject instances
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      Function function1 = mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(function1).getParentScope();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) function0;
      Context context0 = Context.enter();
      Thread thread0 = (Thread)Global.spawn(context0, function1, objectArray0, function1);
      assertFalse(thread0.isDaemon());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = new Context();
      Delegator delegator0 = new Delegator();
      Global.seal(context0, delegator0, context0.emptyArgs, delegator0);
      assertEquals(130, Context.VERSION_1_3);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        Global.sync((Context) null, baseFunction0, objectArray0, baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Global.pipe(true, pipedInputStream0, (OutputStream) null);
      assertEquals(0, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Global.sync((Context) null, function0, context0.emptyArgs, function0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) importerTopLevel0;
      Synchronizer synchronizer0 = new Synchronizer(importerTopLevel0);
      Global.toint32(context0, scriptable0, objectArray0, synchronizer0);
      Object[] objectArray1 = context0.getElements(synchronizer0);
      assertNotSame(objectArray1, objectArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(573);
      Global.pipe(false, byteArrayInputStream0, byteArrayOutputStream0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(6, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Synchronizer synchronizer0 = new Synchronizer(importerTopLevel0);
      Object object0 = Global.toint32(context0, scriptable0, context0.emptyArgs, synchronizer0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Object[] objectArray0 = new Object[1];
      Delegator delegator0 = new Delegator(scriptableObject0);
      try { 
        Global.readFile(context0, scriptableObject0, objectArray0, delegator0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File not found: null
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global();
      int int0 = global0.runDoctest(context0, global0, "ZY<J%5}nBv", "error reporter", (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Object[] objectArray0 = new Object[3];
      objectArray0[2] = (Object) importerTopLevel0;
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        Global.runCommand(context0, importerTopLevel0, objectArray0, delegator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Delegator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Context context0 = Context.enter();
      Object[] objectArray0 = new Object[1];
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      try { 
        Global.readUrl(context0, nativeJavaClass0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: null
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      StringReader stringReader0 = new StringReader("OpenJDK 64-Bit Server VM");
      // Undeclared exception!
      try { 
        context0.compileReader((Scriptable) scriptableObject0, (Reader) stringReader0, "OpenJDK 64-Bit Server VM", 59, (Object) null);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (OpenJDK 64-Bit Server VM#59)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Global global0 = new Global();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(global0, global0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Context context0 = new Context();
      Object[] objectArray0 = new Object[2];
      objectArray0[1] = (Object) scriptable0;
      // Undeclared exception!
      try { 
        Global.runCommand(context0, nativeJavaClass0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Context context0 = Context.enter();
          Global global0 = new Global();
          BaseFunction baseFunction0 = new BaseFunction(global0, global0);
          Object[] objectArray0 = new Object[4];
          // Undeclared exception!
          try { 
            Global.runCommand(context0, global0, objectArray0, baseFunction0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"<<ALL FILES>>\" \"execute\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkExec(SecurityManager.java:799)
             // java.lang.ProcessBuilder.start(ProcessBuilder.java:1018)
             // java.lang.Runtime.exec(Runtime.java:621)
             // java.lang.Runtime.exec(Runtime.java:486)
             // com.google.javascript.rhino.head.tools.shell.Global.runProcess(Global.java:930)
             // com.google.javascript.rhino.head.tools.shell.Global.runCommand(Global.java:760)
             // sun.reflect.GeneratedMethodAccessor161.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
