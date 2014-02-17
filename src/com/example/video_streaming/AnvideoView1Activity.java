package com.example.video_streaming;


import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class AnvideoView1Activity extends Activity {

 String SrcPath = "rtsp://192.168.1.163/img/video.sav";// 
/* Give IP address ofCamera.
--- If Audio is also required then use media.sav instead of Video.sav */

/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.main);

VideoView myVideoView = (VideoView)findViewById(R.id.videoView1);
myVideoView.requestFocus();  
myVideoView.setVideoPath(SrcPath);
//myVideoView.setMediaController(newMediaController(this));

myVideoView.start();

       }
}
