//package com.jc.servic

import com.jc.service.Config;
import com.jc.service.MyHttpClient;
import org.apache.http.client.HttpClient;
import java.io.IOException;

/**
 * Created by jc on 1/4/2016.
 */
//public class RoomInformation {
//    private static MyHttpClient httpClient = new MyHttpClient();
//
//
//    public static String getRoomIdByNickname(String roomName) {
//        String contextHtml = httpClient.doGet(Config.getDouyu() + "/" + roomName);
//        return getRoomIdByHtml(contextHtml);
//    }
//
//    private static String getRoomIdByHtml(String html) {
//        Document doc = Jsoup.parse(html);
//        Element element = doc.select("#feedback_report_button").first();
//        String href = element.attr("href");
//        if (href != null) {
//            return href.split("=")[1];
//        }
//        return null;
//    }
//
//    public static void getGroupId() {
//
//    }
//}

