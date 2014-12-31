package org.krams.batch;

import org.springframework.jdbc.core.PreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TaskItemParamSetter implements PreparedStatementSetter {
    private final Long userId;

    public TaskItemParamSetter(Long userId) {
        this.userId = userId;
    }

    @Override
    public void setValues(PreparedStatement ps) throws SQLException {
        ps.setLong(1, userId);
    }
}