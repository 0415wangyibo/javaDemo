package music;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/19 12:11
 * Modified By:
 * Description:
 */
public class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
}
