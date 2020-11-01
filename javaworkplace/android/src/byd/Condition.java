package byd;

/**
 * Created by mu.guihai on 2017/8/28.
 * 接口参数Condition
 */

public class Condition {
    private String []province;//省份(all, beijing, shanghai, anhui …)
    private String []operator;//运营商(all,byd,sgcc…)
    private String datatype;//数据类型，（all,confirmed,unconfirmed确认的，未确认的）
    private String interfaceType;//接口类型(all,fast,slow)

    public Condition() {
        this.province = new String[]{"all"};
        this.operator = new String[]{"all"};
        this.datatype = "all";
        this.interfaceType = "all";
    }

    @Override
    public String toString() {
        StringBuilder provinceSb=new StringBuilder();
        StringBuilder operatorSb=new StringBuilder();
        if (province.length >= 2) {
            for (int i = 0; i <province.length -1; i++) {
                provinceSb.append(province[i]+",");
            }
        }
        provinceSb.append(province[province.length-1]);

        if (operator.length >= 2) {
            for (int i = 0; i <operator.length -1; i++) {
                operatorSb.append(operator[i]+",");
            }
        }
        operatorSb.append(province[province.length-1]);
        String condition="{\"province\":\""+provinceSb.toString()+"\",\"operator\":\""+operatorSb.toString()+"\",\"datatype\":\""+datatype+"\",\"interface\":\""+interfaceType+"\"}";
        return condition;
    }

    public String[] getProvince() {
        return province;
    }

    public void setProvince(String ... province) {
        this.province = province;
    }

    public String[] getOperator() {
        return operator;
    }

    public void setOperator(String... operator) {
        this.operator = operator;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }
}
