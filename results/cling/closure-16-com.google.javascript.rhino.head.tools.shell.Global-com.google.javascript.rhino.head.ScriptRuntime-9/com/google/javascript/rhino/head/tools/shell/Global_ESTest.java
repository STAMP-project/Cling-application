/*

 * Tue Mar 03 20:47:05 GMT 2020
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
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.tools.shell.Global;
import com.google.javascript.rhino.head.tools.shell.ShellContextFactory;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
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
      Context context0 = new Context();
      Delegator delegator0 = new Delegator(baseFunction0);
      Global global0 = new Global();
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Global.sync(context0, global0, objectArray0, delegator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.enter();
      Object[] objectArray0 = new Object[10];
      // Undeclared exception!
      try { 
        Global.seal(context0, baseFunction0, objectArray0, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function can only be applied to objects
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.enter();
      Object[] objectArray0 = new Object[10];
      // Undeclared exception!
      try { 
        Global.doctest(context0, baseFunction0, objectArray0, baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.enter();
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Global.runCommand(context0, baseFunction0, objectArray0, baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        Global.spawn(context0, baseFunction0, context0.emptyArgs, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      try { 
        Global.pipe(false, pipedInputStream0, outputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        Global.runCommand(context0, delegator0, context0.emptyArgs, delegator0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // The first argument to runCommand must be a command name.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Global global0 = new Global();
      InputStream inputStream0 = global0.getIn();
      InputStream inputStream1 = global0.getIn();
      assertSame(inputStream1, inputStream0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      context0.initStandardObjects((ScriptableObject) nativeArray0, true);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = new Context();
      Object[] objectArray0 = new Object[5];
      Global global0 = new Global(context0);
      // Undeclared exception!
      try { 
        Global.spawn(context0, global0, objectArray0, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global();
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      BaseFunction baseFunction0 = new BaseFunction(global0, (Scriptable) null);
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) nativeJavaObject0;
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
  @Ignore
  public void test11()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null).when(scriptable0).getParentScope();
      Object[] objectArray0 = new Object[8];
      objectArray0[7] = (Object) scriptable0;
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Global.runCommand((Context) null, scriptable0, objectArray0, function0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot convert null to an object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      Double double0 = new Double(1008.31326906412);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(double0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Object[] objectArray0 = new Object[8];
      objectArray0[7] = (Object) scriptable0;
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        Global.runCommand((Context) null, scriptable0, objectArray0, nativeContinuation0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // A value of the env property of option object for runCommnad must be an object.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global();
      // Undeclared exception!
      try { 
        global0.runDoctest(context0, global0, "js>er}orrep`rter", "language version", (-1253));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1253
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = new Context();
      Global.seal(context0, baseFunction0, context0.emptyArgs, baseFunction0);
      assertEquals("function", baseFunction0.getTypeOf());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = new Object[10];
      Context context0 = new Context();
      Global global0 = new Global(context0);
      // Undeclared exception!
      try { 
        Global.sync(context0, global0, objectArray0, baseFunction0);
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
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Global.pipe(true, pipedInputStream0, byteArrayOutputStream0);
      assertEquals(0, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global();
      BaseFunction baseFunction0 = new BaseFunction(global0, global0);
      // Undeclared exception!
      try { 
        Global.sync(context0, global0, context0.emptyArgs, baseFunction0);
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
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(2118).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Global.pipe(false, inputStream0, pipedOutputStream0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.enter();
      Object object0 = Global.toint32(context0, baseFunction0, context0.emptyArgs, baseFunction0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      BaseFunction baseFunction0 = new BaseFunction();
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      Context context0 = shellContextFactory0.enterContext();
      try { 
        Global.readFile(context0, baseFunction0, objectArray0, baseFunction0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File not found: null
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = new Context();
      Global global0 = new Global(context0);
      global0.runDoctest(context0, baseFunction0, "Ope", "language version", 120);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = new Context();
      Synchronizer synchronizer0 = new Synchronizer(baseFunction0);
      Object[] objectArray0 = new Object[4];
      objectArray0[3] = (Object) synchronizer0;
      // Undeclared exception!
      try { 
        Global.runCommand(context0, synchronizer0, objectArray0, baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[1];
      try { 
        Global.readUrl(context0, scriptable0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: null
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      // Undeclared exception!
      try { 
        context0.compileFunction(global0, "Y~ez!G]9Vv(RT", "Y~ez!G]9Vv(RT", (-3198), global0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // securityDomain should be null if setSecurityController() was never called
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Context context0 = new Context();
          Global global0 = new Global();
          String[] stringArray0 = global0.getPrompts(context0);
          BaseFunction baseFunction0 = new BaseFunction(global0, (Scriptable) null);
          // Undeclared exception!
          try { 
            Global.runCommand(context0, global0, stringArray0, baseFunction0);
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
             // sun.reflect.GeneratedMethodAccessor163.invoke(Unknown Source)
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
