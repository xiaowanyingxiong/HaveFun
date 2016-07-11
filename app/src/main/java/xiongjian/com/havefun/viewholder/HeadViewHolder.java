package xiongjian.com.havefun.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;

import xiongjian.com.havefun.R;
import xiongjian.com.havefun.modal.Headline;

/**
 * Created by zyl on 16/7/11.
 */
public class HeadViewHolder extends BaseViewHolder<Headline> {

    private TextView headname;
    private TextView headsign;
    private ImageView headImage;

    public HeadViewHolder(ViewGroup headline) {
        super(headline, R.layout.item_headline);
        headname=$(R.id.headline_name);
        headsign=$(R.id.headline_sign);
        headImage=$(R.id.headline_image);
    }

    @Override
    public void setData(final Headline headline) {
        headsign.setText(headline.getLine());

    }
}
