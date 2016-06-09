package CC162_Decor_pattern;

/**
 * Created by Administrator on 2015/12/1.
 * Ô­±¾µÄÉùÒô
 */
public class Voice {
    private int voice=10;

    public Voice(int voice) {
        this.voice = voice;
    }

    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        this.voice = voice;
    }
    public void say() {
        System.out.println(this.getVoice());
    }
}
