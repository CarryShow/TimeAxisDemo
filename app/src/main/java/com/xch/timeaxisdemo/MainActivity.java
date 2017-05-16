package com.xch.timeaxisdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

/**时间轴demo
 * Comment:

 * @author  : carry / 136218609@qq.com
 * @version  : 1.0
 * @date  : 2017-05-16
 */
public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private SMSAdapter smsAdapter;

    private void init() {
        lv = (ListView) findViewById(R.id.lv);
        smsAdapter = new SMSAdapter(this);
    }

    /*返回假数据*/
    private List<SMSInfo> createData(){
        List<SMSInfo> smsInfos = new ArrayList<>();
        SMSInfo smsInfo = new SMSInfo();
        smsInfo.setMessage("已签收，【签收人】：你妈，期待再次为你服务。");
        smsInfo.setDate("刚刚");
        smsInfos.add(smsInfo);

        smsInfo = new SMSInfo();
        smsInfo.setMessage("【广东东莞松山湖分部】的派件员【王小二】正在派件 电话：13790xxx762");
        smsInfo.setDate("昨天");
        smsInfos.add(smsInfo);

        smsInfo = new SMSInfo();
        smsInfo.setMessage("【广东东莞松山湖分部】已收入");
        smsInfo.setDate("04-28");
        smsInfos.add(smsInfo);

        smsInfo = new SMSInfo();
        smsInfo.setMessage("由【广东东莞中转部】发往【广东东莞松山湖分部】");
        smsInfo.setDate("04-28");
        smsInfos.add(smsInfo);

        smsInfo = new SMSInfo();
        smsInfo.setMessage("由【浙江义乌公司】发往【广东东莞中转部】");
        smsInfo.setDate("04-27");
        smsInfos.add(smsInfo);

        smsInfo = new SMSInfo();
        smsInfo.setMessage("由【辽宁沈阳航空部】发往【浙江义乌公司】");
        smsInfo.setDate("04-27");
        smsInfos.add(smsInfo);

        smsInfo = new SMSInfo();
        smsInfo.setMessage("你的包裹已出库");
        smsInfo.setDate("04-24");
        smsInfos.add(smsInfo);

        smsInfo = new SMSInfo();
        smsInfo.setMessage("您的订单等待配货中");
        smsInfo.setDate("04-22");
        smsInfos.add(smsInfo);

        smsInfo = new SMSInfo();
        smsInfo.setMessage("您的订单开始处理");
        smsInfo.setDate("04-22");
        smsInfos.add(smsInfo);

        return smsInfos;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        lv.setAdapter(smsAdapter);
        smsAdapter.addAll(createData());
    }
}
