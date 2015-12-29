package CC210_ORM;

/**
 * Created by Administrator on 2015/12/10.
 * 反射机制读取注解
 */
@SxTable("tb_student")
public class SxStudent {
    
    @SxField(columnName = "id",type = "int",length = 10)
    private int id;
    @SxField(columnName = "sname",type = "varchar",length = 10)
    private String studentName;
    @SxField(columnName = "age",type = "int",length = 10)
    private int age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
