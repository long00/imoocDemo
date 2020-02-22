/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: LoggerTest
 * Author:   king
 * Date:     2020/02/08 16:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.biggg.king;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author king
 * @create 2020/02/08
 * @since 1.0.0
 */
public class LoggerTest {

    private Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test

    public void test1() {

        try {
            logger.info("Test");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
