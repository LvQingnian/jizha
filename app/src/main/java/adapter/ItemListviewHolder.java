package adapter;

import android.view.View;
import android.widget.TextView;

import com.jizha.jizha.R;

public class ItemListviewHolder {
    private TextView itemName;
    private TextView itemCardtype;
    private TextView itemFakaren;
    private TextView itemStartTime;
    private TextView itemEndTime;
    private TextView itemCardno;
    private TextView itemUsingStatus;
    private TextView itemComment;

    public ItemListviewHolder(View view) {
        itemName = (TextView) view.findViewById(R.id.item_name);
        itemCardtype = (TextView) view.findViewById(R.id.item_cardtype);
        itemFakaren = (TextView) view.findViewById(R.id.item_fakaren);
        itemStartTime = (TextView) view.findViewById(R.id.item_start_time);
        itemEndTime = (TextView) view.findViewById(R.id.item_end_time);
        itemCardno = (TextView) view.findViewById(R.id.item_cardno);
        itemUsingStatus = (TextView) view.findViewById(R.id.item_using_status);
        itemComment = (TextView) view.findViewById(R.id.item_comment);
    }

    public TextView getItemStartTime() {
        return itemStartTime;
    }

    public TextView getItemUsingStatus() {
        return itemUsingStatus;
    }

    public TextView getItemComment() {
        return itemComment;
    }

    public TextView getItemCardno() {
        return itemCardno;
    }

    public TextView getItemEndTime() {
        return itemEndTime;
    }

    public TextView getItemCardtype() {
        return itemCardtype;
    }

    public TextView getItemFakaren() {
        return itemFakaren;
    }

    public TextView getItemName() {
        return itemName;
    }
}
