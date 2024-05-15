package bugtracking.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@jakarta.persistence.Entity
@Table(name = "Bugs")
public class Bug extends Entity<Long> {
    private String name;
    private String description;
    private Tester reportedBy;
    private Programmer assignedTo;
    private BugStatus status;
    private LocalDateTime timestamp;

    public Bug(String name, String description, Tester reportedBy, Programmer assignedTo) {
        this.name = name;
        this.description = description;
        this.reportedBy = reportedBy;
        this.assignedTo = assignedTo;
        this.status = BugStatus.NEW;
        this.timestamp = LocalDateTime.now();
    }

    public Bug() {

    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne
    @JoinColumn(name = "reported_by_id")
    public Tester getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(Tester reportedBy) {
        this.reportedBy = reportedBy;
    }

    @ManyToOne
    @JoinColumn(name = "assigned_to_id")
    public Programmer getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Programmer assignedTo) {
        this.assignedTo = assignedTo;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    public BugStatus getStatus() {
        return status;
    }

    public void setStatus(BugStatus status) {
        this.status = status;
    }

    @Column(name = "timestamp")
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", reportedBy=" + reportedBy +
                ", assignedTo=" + assignedTo +
                ", status=" + status +
                ", timestamp=" + timestamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bug)) return false;
        Bug bug = (Bug) o;
        return name.equals(bug.name) &&
                description.equals(bug.description) &&
                status == bug.status &&
                timestamp.equals(bug.timestamp);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + reportedBy.hashCode();
        result = 31 * result + assignedTo.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + timestamp.hashCode();
        return result;
    }
}
