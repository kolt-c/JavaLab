/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy.example.proxy;

/**
 *
 * @author 1cadmin
 */

import proxy.example.some_cool_media_library.ThirdPartyYoutubeClass;
import proxy.example.some_cool_media_library.ThirdPartyYoutubeLib;
import proxy.example.some_cool_media_library.Video;

import java.util.HashMap;
import proxy.example.some_cool_media_library.ThirdPartyYoutubeClass;
import proxy.example.some_cool_media_library.ThirdPartyYoutubeLib;
import proxy.example.some_cool_media_library.Video;

public class YoutubeCacheProxy implements ThirdPartyYoutubeLib {
    
    private ThirdPartyYoutubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();
    
    public YoutubeCacheProxy() {
        this.youtubeService = new ThirdPartyYoutubeClass();
    }
    
    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.print("Retrieved list from cache.");
        }
        return cachePopular;
    }
    
    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.print("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }
    
    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
