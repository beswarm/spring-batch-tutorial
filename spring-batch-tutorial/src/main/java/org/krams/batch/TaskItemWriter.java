package org.krams.batch;

import org.krams.domain.Task;
import org.krams.domain.User;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TaskItemWriter implements ItemWriter<Task> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static final String UPDATE_QUERY = "update beswarm_task set STATUS=? where TASK_ID=?";

	@Override
	public void write(List<? extends Task> tasks) throws Exception {
		for (Task task : tasks) {
			jdbcTemplate.update(UPDATE_QUERY,task.getStatus(),task.getUserId());
		}
	}

}