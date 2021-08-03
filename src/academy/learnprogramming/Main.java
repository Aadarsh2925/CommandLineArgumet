package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Student student=new Student();
        student.setStudentId(12);
        student.setStudentName("Bony","Thomas");
        student.setResidentialStatus("Hostel");
        student.setSemesterFees(60000);
        student.setHostelFees(60000);
        System.out.println("studentId = "+student.getStudentId());
        System.out.println("studentName = "+student.getStudentName());
        System.out.println("residentalStatus = "+student.getResidentialStatus());
        System.out.println("semesterFee = "+student.getSemesterFees());
        System.out.println("HostelFee = "+student.getHostelFees());
        System.out.println("total fee of student based on residentialStatus = "+student.totalFees());


    }
}
