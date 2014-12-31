package org.krams.batch;

import org.krams.domain.Task;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TaskItemProcessor implements ItemProcessor<Task,Task> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static final String UPDATE_QUERY = "update beswarm_fable set STATUS=? where TASK_ID=?";

/*	@Override
	public void write(List<? extends Task> tasks) throws Exception {
		for (Task task : tasks) {
			jdbcTemplate.update(UPDATE_QUERY,task.getStatus(),task.getUserId());
		}
	}*/

	@Override
	public Task process(Task item) throws Exception {
		item.setStatus("DEALED");
		return item;
	}
}