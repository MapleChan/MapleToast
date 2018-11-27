package com.cc.cctoast;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Describe:
 * Created by CC on 2018/11/27 14:01.
 */
public class CCTost {

	public static Toast toast;

	/**
	 * String类型吐司(短吐司)
	 *
	 * @param context
	 * @param info
	 */
	public static void show(Context context, String info) {
		if (toast == null) {
			toast = Toast.makeText(context, null, Toast.LENGTH_SHORT);
			toast.setGravity(Gravity.CENTER, 0, 0);
			toast.setText(info);
			toast.show();
		} else {
			toast.setGravity(Gravity.CENTER, 0, 0);
			toast.setText(info);
			toast.show();
		}
	}
}
