package com.codeclan.balazskertesz.project2;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;


@Entity(tableName = "tasks")
public class Task {
    //This class creates tasks objects also contain information on how to save it to the database

    @PrimaryKey(autoGenerate = true)
    //This one is really important other wise the database can't manipulate or recall objects
    private int taskId;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "status")
    private boolean status;

    @ColumnInfo(name = "priority")
    private String priority;

    public Task(String name, String description, String priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.status = false;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
