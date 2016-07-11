package xiongjian.com.havefun.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import xiongjian.com.havefun.modal.Headline;
import xiongjian.com.havefun.viewholder.HeadViewHolder;

/**
 * Created by zyl on 16/7/11.
 */
public class HeadRecyclerViewAdapter extends RecyclerArrayAdapter<Headline> {

    public HeadRecyclerViewAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup headline, int viewType) {
        return new HeadViewHolder(headline);
    }
}
