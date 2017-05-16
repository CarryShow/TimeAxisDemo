package com.xch.timeaxisdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by carry on 2017/5/16.
 */

public class SMSAdapter extends ArrayAdapter<SMSInfo> {

    private View returnView;
    private Context mContext;

    public SMSAdapter(Context context) {
        super(context, R.layout.item_sms);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SMSInfo smsInfo = getItem(position);
        returnView = LayoutInflater.from(mContext).inflate(R.layout.item_sms, null);
        TextView tv_message = (TextView) returnView.findViewById(R.id.tv_message);
        TextView tv_date = (TextView) returnView.findViewById(R.id.tv_date);
        tv_message.setText(smsInfo.getMessage());
        tv_date.setText(smsInfo.getDate());
        return returnView;
    }
}
