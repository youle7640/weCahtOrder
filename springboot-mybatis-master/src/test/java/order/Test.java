package order;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by nfplus on 2017/11/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class Test {
    private  final Logger logger = Logger.getLogger(Test.class);

    @org.junit.Test
    public void testService(){
        logger.info("小明你好");
    }

}
