package testCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/1/3.
 */
public class testList {
    public static void main(String[] args) {
        List<String> strings=new ArrayList<>();
        for (int i =0; i<5;i++){
            strings.add("vero"+i);
        }
        System.out.println(strings);
        System.out.println("==========================================");
        String [] str=new String[5];
        for (int i =0; i<5;i++){
            str[i]="vnix"+i;
        }
        List<String> strings2= Arrays.asList(str);
        System.out.println(strings2);
        strings2.add("ssssss");
        System.out.println(strings2);
    }
}
