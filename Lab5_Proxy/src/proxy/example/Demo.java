/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy.example;

/**
 *
 * @author 1cadmin
 */

import proxy.example.Downloader.YoutubeDownloader;
import proxy.example.proxy.YoutubeCacheProxy;
import proxy.example.some_cool_media_library.ThirdPartyYoutubeClass;

public class Demo {
    public static void main(String[] args) {
        YoutubeDownloader naiveDownloader = new YoutubeDownloader
        (new ThirdPartyYoutubeClass());
        YoutubeDownloader smartDownloader = new YoutubeDownloader
        (new YoutubeCacheProxy());
        
        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
    }
    
    public static long test(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();
        
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");
        
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
    
}
