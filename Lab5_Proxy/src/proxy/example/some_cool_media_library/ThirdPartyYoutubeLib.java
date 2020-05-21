/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy.example.some_cool_media_library;

/**
 *
 * @author 1cadmin
 */

import java.util.HashMap;

public interface ThirdPartyYoutubeLib {
    HashMap<String, Video> popularVideos();
    
    Video getVideo(String videoId);
}
