package zhihu;

import org.apache.log4j.PropertyConfigurator;
import us.codecraft.webmagic.*;
import us.codecraft.webmagic.downloader.Downloader;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xgh on 2016/2/19.
 */

public class Zhihu_XiaoJinMo implements PageProcessor{
    private final int minumVote=0;
    private Site site = Site.me().setCycleRetryTimes(5).setRetryTimes(5).setSleepTime(2000)
            .setUserAgent("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:38.0) Gecko/20100101 Firefox/38.0")
            .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
            .addHeader("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")
            .setCharset("UTF-8");

    @Override
    public void process(Page page) {
        List<String> questionurls=new ArrayList<>();
        questionurls=page.getHtml().xpath("//div[@class='zm-item']/h2/a/@href").all();
        for(String s:questionurls){
            System.out.println(s);
        }
//        for(int i=1;i<10;i++){
//            questionurls.add("https://www.zhihu.com/people/xiao-jing-mo/answers?page="+i);
//        }
        //page.addTargetRequests(questionurls);
        //page.addTargetRequest("https://www.zhihu.com/people/xiao-jing-mo/answers");
        page.addTargetRequests(questionurls,1);
        List<String> answers=page.getHtml().xpath("//div[@id='zh-question-answer-wrap']/div").all();

        boolean exist = false;
        for(String answer:answers){
            Html html=new Html(answer);
            String author=html.xpath("//div[@class='answer-head']//a[@class='author-link']/text()").toString();
            String vote = html.xpath("//div[@class='zm-votebar']//span[@class='count']/text()").toString();
            String text=html.xpath("//div[@class='zm-editable-content']/text()").toString();

            if(Integer.valueOf(vote)>=minumVote) {
                //page.putField("author",html);
                page.putField("author",author);
                page.putField("votes", vote);
                page.putField("text",html.xpath("//div[@class='zm-editable-content']/text()"));
                exist=true;
            }
            if(!exist){
                page.setSkip(true);
            }
        }


    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args){
        String log4jConfPath = "log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        Spider.create(new Zhihu_XiaoJinMo()).
                addUrl("https://www.zhihu.com/people/xiao-jing-mo/answers").
                addPipeline(new FilePipeline("E:\\webmagic\\")).
                thread(1).
                run();
    }

}
