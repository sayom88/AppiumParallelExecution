package pack.login;

import org.testng.annotations.Test;

import com.appium.manager.ParallelThread;

public class Runner {
	
	@Test
    public void testApp() throws Exception {
        ParallelThread parallelThread = new ParallelThread();
        //parallelThread.runner(package_name_where_test_located);
        parallelThread.runner("pack.login");

    }

}
