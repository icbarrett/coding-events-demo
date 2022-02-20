package org.launchcode.codingevents.models;

import javax.validation.constraints.*;
import java.util.Objects;

/**
 * Created by Chris Bay
 */
public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @NotNull(message = "Location is required")
    @NotBlank(message = "Location is required")
    private String location;

    @AssertTrue(message = "This event must have attendees.")
    private Boolean register = true;

    @NotNull(message = "Minimum of 1 attendee.")
    @Min(value = 1, message = "Minimum of 1 attendee.")
    private Integer numOfAttendees;

    @AssertTrue(message = "You must have food")
    private Boolean isThereFood = true;

    @NotNull(message = "Enter how many parking spots needed.")
    private Integer numOfParking;

    public Event(String name, String description,
                 String contactEmail, String location, Integer numOfAttendees, Integer numOfParking) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.numOfAttendees = numOfAttendees;
        this.numOfParking = numOfParking;
    }

    public Event() {
        this.id = nextId;
        nextId++;
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

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getRegister() {
        return register;
    }

    public void setRegister(Boolean register) {
        this.register = register;
    }

    public Integer getNumOfAttendees() {
        return numOfAttendees;
    }

    public void setNumOfAttendees(Integer numOfAttendees) {
        this.numOfAttendees = numOfAttendees;
    }

    public Integer getNumOfParking() {
        return numOfParking;
    }

    public void setNumOfParking(Integer numOfParking) {
        this.numOfParking = numOfParking;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
