package com.fss.common.demo.sampleModules;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.fss.Common.commonUtils.basicUtils.BasicUtils;
import com.fss.Common.commonUtils.basicUtils.HandlerUtils;
import com.fss.Common.commonUtils.logUtils.Logs;
import com.fss.Common.ui.HomeasUpActionbarActivity;
import com.fss.Common.uiModule.photoview.PhotoViewAttacher;
import com.fss.Common.uiModule.square_progressbar.SquareProgressBar;
import com.fss.Common.uiModule.square_progressbar.utils.PercentStyle;
import com.fss.Common.uiModule.tileView.os.AsyncTask;
import com.fss.common.demo.R;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by cym on 14-6-26.
 */
public class SquareProgressBarActivity extends ActionBarActivity {
    //    @InjectView(R.id.photoView)
//    PhotoView photoView;
    @InjectView(R.id.squareProgressBar)
    SquareProgressBar squareProgressBar;
    int progressInt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.square_progress_bar_activity);
        ButterKnife.inject(this);
        // Set the Drawable displayed
        squareProgressBar.setImage(R.drawable.test);
        squareProgressBar.setProgress(40.0);
       // squareProgressBar.setColor("#C9C9C9");
       // squareProgressBar.setImageScaleType(ImageView.ScaleType.CENTER);
        squareProgressBar.setColorRGB(154, 11, 41);
        squareProgressBar.setWidth(6);
        //  squareProgressBar.setOpacity(true, true);
        /**
         * Show progress
         */
//        squareProgressBar.showProgress(true);
//        squareProgressBar.setPercentStyle(new PercentStyle(Paint.Align.CENTER, 190, true));
//        squareProgressBar.showProgress(true);
//        PercentStyle percentStyle = new PercentStyle(Paint.Align.CENTER, 150, true);
//        percentStyle.setCustomText(".-");
//        squareProgressBar.setPercentStyle(percentStyle);

        //  squareProgressBar.drawOutline(true);
        //  squareProgressBar.setImageScaleType(ImageView.ScaleType.MATRIX);
        //      squareProgressBar.setClearOnHundred(true);

//        new Thread() {
//            @Override
//            public void run() {
//                super.run();
//                while (progressInt < 100) {
//                    try {
//                        sleep(200);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                        Logs.e(e, "");
//                    }
//                    progressInt = progressInt + 4;
//                    Message message = new Message();
//                    message.what = 0;
//                    changeProgressHandler.sendMessage(message);
//                }
//
//            }
//        }.start();
    }

    Handler changeProgressHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            squareProgressBar.setProgress(progressInt);
            Logs.d("hh " + progressInt);

        }
    };


}
