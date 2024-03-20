package kaem0n.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue
    @Column(name = "event_id")
    private long id;
    private String title;
    private LocalDate date;
    private String description;
    @Enumerated(EnumType.STRING)
    private EventType type;
    @Column(name = "max_participant_capacity")
    private int maxParticipantCapacity;

    public Event() {
    }

    public Event(String title, LocalDate date, String description, EventType type, int maxParticipantCapacity) {
        this.title = title;
        this.date = date;
        this.description = description;
        this.type = type;
        this.maxParticipantCapacity = maxParticipantCapacity;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public int getMaxParticipantCapacity() {
        return maxParticipantCapacity;
    }

    public void setMaxParticipantCapacity(int maxParticipantCapacity) {
        this.maxParticipantCapacity = maxParticipantCapacity;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", maxParticipantCapacity=" + maxParticipantCapacity +
                '}';
    }
}
