package com.example.myapplication;

public class MainModel {
    String Classroom,Day,Division,Subject,Teacher,Type;
    float Batch,End,Start;
    public MainModel(String classroom, String day, String division,
                     String subject, String teacher, String type, float batch, float end, float start) {
        Classroom = classroom;
        Day = day;
        Division = division;
        Subject = subject;
        Teacher = teacher;
        Type = type;
        Batch = batch;
        End = end;
        Start = start;
    }
    public String getClassroom() {
        return Classroom;
    }
    public void setClassroom(String classroom) {
        Classroom = classroom;
    }
    public String getSubject() {
        return Subject;
    }
    public void setSubject(String subject) {
        Subject = subject;
    }
    public String getTeacher() {
        return Teacher;
    }
    public void setTeacher(String teacher) {
        Teacher = teacher;
    }
    public String getType() {
        return Type;
    }
    public void setTypes(String type) {
        Type = type;
    }
    public float getBatch() {
        return Batch;
    }
    public void setBatch(float batch) {
        Batch = batch;
    }
    MainModel(){
    }
}