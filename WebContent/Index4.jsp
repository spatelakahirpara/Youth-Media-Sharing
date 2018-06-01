<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
  <script type="text/javascript" src="https://cdn.jsdelivr.net/clappr/latest/clappr.min.js"></script>
</head> 
<body> 
  <div id="player"></div>
  <script>
    var player = new Clappr.Player({source: "https://s3-us-west-2.amazonaws.com/data-download-out/job1/hls_mycreation0.9840407320298254.m3u8", parentId: "#player"});
  </script>
  
  <div id="player1"></div>
  <script>
    var player = new Clappr.Player({source: "https://s3-us-west-2.amazonaws.com/data-upload-in/SampleVideo_1280x720_1mb.mp4", parentId: "#player1"});
  </script>
</body> 
</html>

