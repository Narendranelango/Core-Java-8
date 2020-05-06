public class Student
{
    private int sid;
    private String sname;
    private Department department;
    /*public Student(int did,String dname,int sid,String sname)
    {
        this.sid=sid;
        this.sname=sname;
        Department d1=new Department(did,dname);
        setDepartment(d1);
        //department.setDid(did);
        //department.setDname(dname);
    }*/
    public void setSid(int sid)
    {
        this.sid=sid;
    }
    public int getSid()
    {
        return sid;
    }
    public void setSname(String sname)
    {
        this.sname=sname;
    }
    public String getSname()
    {
        return sname;
    }
    public void setDepartment(Department department)
    {
        this.department=department;
    }
    public Department getDepartment()
    {
        return department;
    }
    
}