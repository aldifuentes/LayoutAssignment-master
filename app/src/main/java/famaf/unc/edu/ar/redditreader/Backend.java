package famaf.unc.edu.ar.redditreader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fuentald on 29/09/2016.
 */
public class Backend {
    private static Backend ourInstance = new Backend();
    public static Backend getInstance() { return ourInstance;}

    private List<PostModel> mListPostModel;

    private Backend(){
        mListPostModel = new ArrayList<>();

        PostModel p1 = new PostModel();
        p1.setTitle("Titulo 1");
        p1.setAuthor("Aitor 1");
        p1.setCreated("29/09/2016");
        p1.setSubreddit("/r/today");

        mListPostModel.add(p1);
    }

    /*
    public List<PostModel> get
            return
    */
}
