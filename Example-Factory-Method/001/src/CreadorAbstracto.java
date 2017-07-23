/**
 * Created by yiperu on 7/22/17.
 */
public abstract class CreadorAbstracto {

    public static final int AUDIO = 1;
    public static final int VIDEO = 2;

    // - - - - - - - - - -
    public abstract IArchivo crear(int tipo);
}
