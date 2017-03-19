package io.terminus.springframework.dao.impl;

import io.terminus.springframework.dao.MessageDao;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

/**
 * Created by gengrong on 2017/3/19.
 */
public class MessageDaoImpl implements MessageDao, InitializingBean {

    private JdbcTemplate jdbcTemplate;

    @Override
    public String getMessage() {
        Map<String, Object> record = jdbcTemplate.queryForMap("select * from test_message where id = 1");
        return record.get("content").toString();
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        jdbcTemplate.update("CREATE TABLE TEST_MESSAGE (\n" +
                "  id         INT(20) UNSIGNED NOT NULL,\n" +
                "  content    VARCHAR(20)      NOT NULL,\n" +
                "  PRIMARY KEY (id))");

        jdbcTemplate.update("INSERT INTO TEST_MESSAGE (id, content) VALUES (1, 'terminus is amazing')");
    }
}
