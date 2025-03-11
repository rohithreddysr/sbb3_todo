package beans;

import java.util.Objects;

public class Task {
private int taskid;
private String taskName;
private String taskDate;
private int taskStatus;
private int regid;
public Task() {
super();
}
public int getTaskid() {
	return taskid;
}
public void setTaskid(int taskid) {
	this.taskid = taskid;
}
public String getTaskName() {
	return taskName;
}
public void setTaskName(String taskName) {
	this.taskName = taskName;
}
public String getTaskDate() {
	return taskDate;
}
public void setTaskDate(String taskDate) {
	this.taskDate = taskDate;
}
public int getTaskStatus() {
	return taskStatus;
}
public void setTaskStatus(int taskStatus) {
	this.taskStatus = taskStatus;
}
public int getRegid() {
	return regid;
}
public void setRegid(int regid) {
	this.regid = regid;
}
@Override
public int hashCode() {
	return Objects.hash(regid, taskDate, taskName, taskStatus, taskid);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Task other = (Task) obj;
	return regid == other.regid && Objects.equals(taskDate, other.taskDate) && Objects.equals(taskName, other.taskName)
			&& taskStatus == other.taskStatus && taskid == other.taskid;
}
@Override
public String toString() {
	return "Task [taskid=" + taskid + ", taskName=" + taskName + ", taskDate=" + taskDate + ", taskStatus=" + taskStatus
			+ ", regid=" + regid + "]";
}
public Task(int taskid, String taskName, String taskDate, int taskStatus, int regid) {
	super();
	this.taskid = taskid;
	this.taskName = taskName;
	this.taskDate = taskDate;
	this.taskStatus = taskStatus;
	this.regid = regid;
}



}
