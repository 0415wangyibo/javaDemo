package music;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/19 12:12
 * Modified By:
 * Description:
 */
public class Brass extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
}
