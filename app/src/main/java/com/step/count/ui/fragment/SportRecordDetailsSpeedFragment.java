package com.step.count.ui.fragment;

import android.os.Bundle;
import android.widget.TextView;

import com.step.count.R;
import com.step.count.commmon.bean.PathRecord;
import com.step.count.ui.BaseFragment;
import com.step.count.ui.activity.SportRecordDetailsActivity;

import java.text.DecimalFormat;

import butterknife.BindView;

/**
 * 描述: 运动记录详情-配速
 */
public class SportRecordDetailsSpeedFragment extends BaseFragment {

    @BindView(R.id.tvDistribution)
    TextView tvDistribution;

    private PathRecord pathRecord = null;

    private DecimalFormat decimalFormat = new DecimalFormat("0.00");

    @Override
    public int getLayoutId() {
        return R.layout.fragment_sportrecorddetailsspeed;
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        if (bundle != null) {
            pathRecord = (PathRecord) bundle.getParcelable(SportRecordDetailsActivity.SPORT_DATA);
        }

        if (null != pathRecord)
            tvDistribution.setText(decimalFormat.format(pathRecord.getDistribution()));
    }

    @Override
    public void initListener() {

    }

}
