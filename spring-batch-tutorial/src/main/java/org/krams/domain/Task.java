package org.krams.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2014-12-30.
 */

@Entity(name="BESWARM_TASK")
public class Task {
    @Id
    @Column(name="TASK_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long taskId;

    private String type;

    private String from;

    private String to;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "LAST_UPDATED")
    private Date lastUpdated;

    private String status;

    @Column(name = "USER_ID")
    private Long userId;





    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
