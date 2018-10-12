package music;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/19 12:08
 * Modified By:
 * Description:
 */
public class Wind extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
