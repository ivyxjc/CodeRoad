package FirstTry;

import org.apache.log4j.PropertyConfigurator;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

import java.util.List;

/**
 * @author 410775541@qq.com <br>
 * @since 0.5.1
 */
public class ZhihuPageProcessor implements PageProcessor {

    private Site site = Site.me().setCycleRetryTimes(5).setRetryTimes(5).setSleepTime(500).setTimeOut(3 * 60 * 1000)
            .setUserAgent("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:38.0) Gecko/20100101 Firefox/38.0")
            .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
            .addHeader("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")
            .setCharset("UTF-8");

    private static final int voteNum = 0;


    @Override
    public void process(Page page) {
        List<String> relativeUrl = page.getHtml().xpath("//li[@class='item clearfix']/div/a/@href").all();
        page.addTargetRequests(relativeUrl);
        relativeUrl = page.getHtml().xpath("//div[@id='zh-question-related-questions']//a[@class='question_link']/@href").all();
        page.addTargetRequests(relativeUrl);
        List<String> answers =  page.getHtml().xpath("//div[@id='zh-question-answer-wrap']/div").all();
        boolean exist = false;


        for(String answer:answers){
            String vote = new Html(answer).xpath("//div[@class='zm-votar']//span[@class='count']/text()").toString();
            System.out.println();
            System.out.println("____________________--------------------++++");
            System.out.println();
            System.out.println(answer);
            if(Integer.valueOf(vote) >= voteNum){
                page.putField("vote",vote);
                page.putField("content",new Html(answer).xpath("//div[@class='zm-editable-content']"));
                page.putField("userid", new Html(answer).xpath("//a[@class='author-link']/@href"));
                exist = true;
            }
        }
        if(!exist){
            page.setSkip(true);
        }
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        String log4jConfPath = "log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        Spider.create(new ZhihuPageProcessor()).
                addUrl("https://www.zhihu.com/search?type=question&q=c").
                addPipeline(new FilePipeline("E:\\webmagic\\")).
                thread(5).
                run();
    }
}