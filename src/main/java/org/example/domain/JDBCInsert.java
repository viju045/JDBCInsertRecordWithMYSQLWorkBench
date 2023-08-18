/**
 * Created By VijayKumar Mohite
 * Date : 8/18/2023
 * Time : 10:10 AM
 * Project : SpringJDBCWithInsertingRecodInDB
 **/

package org.example.domain;

public class JDBCInsert {
    private int insertId;
    private String title;
    private String description;
    private int duration;
    private String status;

    public int getInsertId() {
        return insertId;
    }

    public void setInsertId(int insertId) {
        this.insertId = insertId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JDBCInsert(int insertId, String title, String description, int duration, String status) {
        this.insertId = insertId;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.status = status;
    }

    public JDBCInsert() {
    }

    @Override
    public String toString() {
        return "JDBCInsert{" +
                "insertId=" + insertId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", status='" + status + '\'' +
                '}';
    }
}
