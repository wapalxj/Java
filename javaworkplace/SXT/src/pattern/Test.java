package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    //正则表达式匹配@
    public static final String regexp_mention = "@[\\w\\p{InCJKUnifiedIdeographs}-]{1,26}";

    public static void main(String[] args) {

        String string="@vero@vnix@111";
        Pattern pattern = Pattern.compile(regexp_mention, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string.toString());

        while (matcher.find()) {
            System.out.println(""+matcher.start()+"----"+ matcher.end());

        }
    }
}
