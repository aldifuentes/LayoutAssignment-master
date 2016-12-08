package famaf.unc.edu.ar.redditreader;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by fuentald on 29/09/2016.
 */

public class PostsAdapter extends ArrayAdapter {

    private List<PostModel> mListPostModel;

    public PostsAdapter(Context context, int resource, List<PostModel> list) {
        super(context, resource);
        mListPostModel = list;

    }

    @Override
    public int getCount(){
        return mListPostModel.size();
    }

    /*
     @Override
    public PostModel getItem(int position){
        return null;
    }

     @Override
    public getPosition (PostModel item){

    }

     @Override
    public View getView(int position, View currentView, ){
        return super.
    }

     @Override
    public boolean isEmpty(){

    }

*/
}
