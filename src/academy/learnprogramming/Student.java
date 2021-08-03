package academy.learnprogramming;

import java.util.Locale;

public class Student {
    private int studentId;
    private String studentName;
    private String residentialStatus;
    private long semesterFees;
    private long hostelFees;

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentFirstName,String studentSecondName) {
        this.studentName = studentFirstName+studentSecondName;
    }

    public String getResidentialStatus() {
        return residentialStatus;
    }

    public void setResidentialStatus(String residentialStatus) {
            this.residentialStatus = residentialStatus;
    }

    public long getSemesterFees() {
        return semesterFees;
    }

    public void setSemesterFees(long semesterFees) {
        this.semesterFees = semesterFees;
    }
    public void setHostelFees(long hostelFees){
        this.hostelFees=hostelFees;
    }
    public long getHostelFees(){
        return hostelFees;
    }
    public long totalFees(){
        long semFee=getSemesterFees();
        long hostelFee=getHostelFees();
        if(residentialStatus=="Hostel"){
            return semFee+hostelFee;
        }
        return semFee;
    }
}
