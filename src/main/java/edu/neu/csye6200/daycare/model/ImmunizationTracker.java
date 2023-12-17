package edu.neu.csye6200.daycare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity(name = "immunizationTracker")
public class ImmunizationTracker {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    @Column(name = "studentId")
    private int studentId;
    @Column(name = "immunatizationDetails")
    private String immunizationDetails;
    @Column(name = "upcomingDueDate")
    private String upcomingDueDate;
    @Column(name = "dueDateMessage")
    private String upcomingDueDateMessage;

    public ImmunizationTracker() {
    }

    public ImmunizationTracker(int studentId, String immunizationDetails, String upcomingDueDate, String upcoming_due_date_message) {
        this.studentId = studentId;
        this.immunizationDetails = immunizationDetails;
        this.upcomingDueDate = upcomingDueDate;
        this.upcomingDueDateMessage = upcoming_due_date_message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getImmunizationDetails() {
        return immunizationDetails;
    }

    public void setImmunizationDetails(String immunizationDetails) {
        this.immunizationDetails = immunizationDetails;
    }

    public String getUpcomingDueDate() {
        return upcomingDueDate;
    }

    public void setUpcomingDueDate(String upcomingDueDate) {
        this.upcomingDueDate = upcomingDueDate;
    }

    public String getUpcomingDueDateMessage() {
        return upcomingDueDateMessage;
    }

    public void setUpcomingDueDateMessage(String upcoming_due_date_message) {
        this.upcomingDueDateMessage = upcoming_due_date_message;
    }

//    public Map<String, Object> getImmunizationDetailsMap() {
//        return new Gson().fromJson(this.immunizationDetails, new TypeToken<Map<String, Object>>() {
//        }.getType());
//    }
}