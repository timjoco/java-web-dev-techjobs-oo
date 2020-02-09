package org.launchcode.techjobs_oo;

public abstract class JobField {

    public int id;
    public static int nextId = 1;
    public String value;

    public JobField() {
        id = nextId;
        nextId++;

    }

    public JobField (String value) {
        this();
        this.value = value;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public static int getNextId() { return nextId; }

    public static void setNextId(int nextId) { JobField.nextId = nextId; }

    public String getValue() {
        if (value != " ") {
            return value;
        } else {
            return "Date not available";
        }
    }

    public void setValue(String value) { this.value = value; }

}
