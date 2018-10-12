package music;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/19 12:09
 * Modified By:
 * Description:
 */
public class Music {
    public static void tune(Wind instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void tune(Brass instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed stringed = new Stringed();
        Brass brass = new Brass();
        tune(flute);
        tune(stringed);
        tune(brass);
    }
}
