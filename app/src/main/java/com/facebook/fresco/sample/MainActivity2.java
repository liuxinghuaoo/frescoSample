package com.facebook.fresco.sample;

import android.app.Activity;
import android.os.Bundle;

import com.facebook.common.logging.FLog;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;

/**
 * Created by arthur on 15/10/13.
 */
public class MainActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FLog.setMinimumLoggingLevel(FLog.WARN);// 日志打印等级
        Fresco.initialize(MainActivity2.this, ConfigConstants.getImagePipelineConfig(MainActivity2.this));// 图片缓存初始化配置
        ConfigConstants.init(MainActivity2.this.getResources());// 初始化默认图片（占位图，错误图）
        Fresco.initialize(getApplicationContext());
        setContentView(R.layout.activitywww);
//        SimpleDraweeView view = new SimpleDraweeView(this);
//        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
//        layoutParams = new AbsListView.LayoutParams(500, 700);
//        view.setLayoutParams(layoutParams);

        SimpleDraweeView view = (SimpleDraweeView) findViewById(R.id.my_image_view);
//
        String uri = "http://img32.mtime.cn/up/2013/07/20/142428.27146212_500.jpg";
        ImageRequest imageRequest = ConfigConstants.getImageRequest(500,500,uri);
        DraweeController draweeController = ConfigConstants.getDraweeController(imageRequest, view);
        view.setController(draweeController);
//        LinearLayout ll = (LinearLayout) findViewById(R.id.aa);
//        ll.addView(view);

//        SimpleDraweeView view = (SimpleDraweeView) findViewById(R.id.my_image_view);
//        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
//        layoutParams = new AbsListView.LayoutParams(500, 700);
//        view.setLayoutParams(layoutParams);
//        String uri = "http://img32.mtime.cn/up/2013/07/20/142428.27146212_500.jpg";
//        ImageRequest imageRequest = ConfigConstants.getImageRequest(500,500,uri);
//        DraweeController draweeController = ConfigConstants.getDraweeController(imageRequest, view);
//        view.setController(draweeController);
    }
}
