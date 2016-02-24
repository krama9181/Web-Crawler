package com.stephen.crawler;

public class SpiderTest
{
    /**
     * This is our test. It creates a spider (which creates spider legs) and crawls the web.
     * 
     * @param args
     *            - not used
     */
    public static void main(String[] args)
    {
        Spider spider = new Spider();
        spider.search("http://www.futurebiotics.com/product/102/", "store locator");
     //   spider.crawl("http://arstechnica.com/", "computer");
    }
}