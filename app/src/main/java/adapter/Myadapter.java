package adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/11/16 0016.
 */
public class Myadapter extends BaseAdapter {

    private Context mContext;

    private List<Map<String,Object>> lists;

    public Myadapter(Context context,List<Map<String,Object>> listmap){
        mContext = context;
        lists = listmap;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }



}
