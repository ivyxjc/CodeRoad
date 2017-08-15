package xyz.ivyxjc.aop;

import org.junit.Test;
import xyz.ivyxjc.HelloWorldService;
import xyz.ivyxjc.context.ApplicationContext;
import xyz.ivyxjc.context.ClassPathXmlApplicationContext;

/**
 * @author yihua.huang@dianping.com
 */
public class JdkDynamicAopProxyTest {

	@Test
	public void testInterceptor() throws Exception {
		// --------- helloWorldService without AOP
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resource_test.xml");
		HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
		helloWorldService.helloWorld();

		// --------- helloWorldService with AOP
		// 1. 设置被代理对象(Joinpoint)
		AdvisedSupport advisedSupport = new AdvisedSupport();
		TargetSource targetSource = new TargetSource(helloWorldService, HelloWorldService.class);
		advisedSupport.setTargetSource(targetSource);

		// 2. 设置拦截器(Advice)
		TimerInterceptor timerInterceptor = new TimerInterceptor();
		advisedSupport.setMethodInterceptor(timerInterceptor);

		// 3. 创建代理(Proxy)
		JdkDynamicAopProxy jdkDynamicAopProxy = new JdkDynamicAopProxy(advisedSupport);
		HelloWorldService helloWorldServiceProxy = (HelloWorldService) jdkDynamicAopProxy.getProxy();

        // 4. 基于AOP的调用
        helloWorldServiceProxy.helloWorld();
        helloWorldServiceProxy.hello();
//        helloWorldServiceProxy.helloWorld();
//		helloWorldServiceProxy.helloWorld();
//		helloWorldServiceProxy.helloWorld();
//		helloWorldServiceProxy.helloWorld();
//		helloWorldServiceProxy.hello();
//		helloWorldServiceProxy.hello();
//		helloWorldServiceProxy.hello();
//		helloWorldServiceProxy.hello();

	}
}
