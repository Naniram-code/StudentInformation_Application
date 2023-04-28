package Assignment1;

public class Student {
    String sid;
    String sname;
    String saddress;
    String semail;
    public String getSid() {
        return sid;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getSaddress() {
        return saddress;
    }
    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }
    public String getSemail() {
        return semail;
    }
    public void setSemail(String semail) {
        this.semail = semail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", saddress='" + saddress + '\'' +
                ", semail='" + semail + '\'' +
                '}';
    }
    public Student(String sid, String sname, String saddress, String semail) {
        this.sid = sid;
        this.sname = sname;
        this.saddress = saddress;
        this.semail = semail;

    }
}






