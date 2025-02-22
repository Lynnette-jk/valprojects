package com.appsbylyn.projectSpringApplication;

public class Student {
    private Long id;
    private String sname;
    private String course;
    private String grade;
    private String marks;
    private String stream;

    public Student(String stream, String marks, String grade, String course, String sname, Long id) {
        this.stream = stream;
        this.marks = marks;
        this.grade = grade;
        this.course = course;
        this.sname = sname;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }
}
