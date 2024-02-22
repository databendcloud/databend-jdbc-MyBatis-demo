package com.databend.databendjdbcdemomybatis.entity;

import com.databend.databendjdbcdemomybatis.util.SnowFlake;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Class for
 *
 * @author databend
 * @date 2024/02/22
 */
@Data
@Component
@ConfigurationProperties(prefix = "demo.student")
public class Student {
    private static final long serialVersionUID = 1L;
    private String id = String.valueOf(SnowFlake.getInstance().nextId());
    private String name;
    private Integer age;
}
