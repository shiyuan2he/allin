package org.platform.allin.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author heshiyuan
 * @description <p>
 *     防止 mvn install报错
 * </p>
 * @path allin/org.platform.allin.core
 * @date 2019/7/28 09:41
 */
@SpringBootApplication
public class AllinCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(AllinCoreApplication.class, args);
    }
}
