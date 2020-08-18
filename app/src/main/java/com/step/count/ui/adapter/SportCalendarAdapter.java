package com.step.count.ui.adapter;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.step.count.R;
import com.step.count.commmon.bean.PathRecord;
import com.step.count.sport_motion.MotionUtils;

import java.text.DecimalFormat;
import java.util.List;

/**
 * 描述: 运动日历
 */
public class SportCalendarAdapter extends BaseQuickAdapter<PathRecord, BaseViewHolder> {

    private DecimalFormat decimalFormat = new DecimalFormat("0.00");
    private DecimalFormat intFormat = new DecimalFormat("#");

    public SportCalendarAdapter(int layoutResId, @Nullable List<PathRecord> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, PathRecord item) {
        helper.setText(R.id.distance, decimalFormat.format(item.getDistance() / 1000d));
        helper.setText(R.id.duration, MotionUtils.formatseconds(item.getDuration()));
        helper.setText(R.id.calorie, intFormat.format(item.getCalorie()));
        helper.setText(R.id.step, intFormat.format(item.getStepCount()) + "");

    }
}
