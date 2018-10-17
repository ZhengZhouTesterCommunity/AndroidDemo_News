package com.lauren.simplenews.news.model;


import com.lauren.simplenews.utils.OkHttpUtils;
import com.orhanobut.logger.Logger;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Description : 对Presenter层的代码进行测试
 * Author : xuanke
 *
 */
//@RunWith(AndroidJUnit4.class)
public class WeatherPresenterImplTest {

    public void testLoadWeatherData() throws UnsupportedEncodingException {
        String url = "http://wthrcdn.etouch.cn/weather_mini?city=" + URLEncoder.encode("郑州", "utf-8");
        OkHttpUtils.ResultCallback<String> callback = new OkHttpUtils.ResultCallback<String>() {
            @Override
            public void onSuccess(String response) {
                Logger.d(response);
            }

            @Override
            public void onFailure(Exception e) {
                Logger.d(e.getMessage());
            }
        };

        OkHttpUtils.get(url,callback);
    }
}
