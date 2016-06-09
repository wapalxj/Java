package CC162_Decor_pattern;

/**
 * Created by Administrator on 2015/12/1.
 * À©ÒôÆ÷
 */

public class Amplifier {
    private Voice voice=null;

    public Amplifier() {
    }

    public Amplifier(Voice voice) {
        this.voice = voice;
    }
    public void say() {
        System.out.println(voice.getVoice()*1000);
    }
}
