package com.lauren.simplenews.news.model;

import com.lauren.simplenews.beans.NewsBean;
import com.lauren.simplenews.utils.OkHttpUtils;
import com.orhanobut.logger.Logger;

import org.junit.Test;

import java.util.List;

/**
 * Description : 对接口数据进行测试
 * Author : lauren
 * Email  : lauren.liuling@gmail.com
 * Blog   : http://www.liuling123.com
 * Date   : 15/12/19
 */
public class NewsModelImplTest {

    @Test
    public void testLoadNews() throws Exception {
        String url = "http://c.m.163.com/nc/article/headline/T1348647909107/0-5.html";

        new NewsModelImpl().loadNews(url, 0, new OnLoadNewsListListener() {
            @Override
            public void onSuccess(List<NewsBean> list) {
                Logger.d(list);
            }

            @Override
            public void onFailure(String msg, Exception e) {

            }
        });
    }
}