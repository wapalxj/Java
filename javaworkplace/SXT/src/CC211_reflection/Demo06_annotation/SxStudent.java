package CC211_reflection.Demo06_annotation;

/**
 * Created by Administrator on 2015/12/10.
 * ������ƶ�ȡע��
 */
@SxTable("tb_student")
public class SxStudent {
    
    @SxField(columnName = "id",type = "int",length = 10)
    private int id;
    @SxField(columnName = "sname",type = "varchar",length = 10)
    private String studentName;
    @SxField(columnName = "age",type = "int",length = 10)
    private int age;

    @SxTable("method")
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
