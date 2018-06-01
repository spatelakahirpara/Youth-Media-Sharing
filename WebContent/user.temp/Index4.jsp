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
    var player = new Clappr.Player({source: "https://s3-us-west-2.amazonaws.com/data-download-out/job3/hls_mycreation.m3u8", parentId: "#player"});
  </script>
  
  <div id="player1"></div>
  <script>
    var player = new Clappr.Player({source: "https://s3-us-west-2.amazonaws.com/data-upload-in/The+Croods+Movie+Clip+%23+6+%26quot%3BShades%26quot%3B.mp4", parentId: "#player1"});
  </script>
</body> 
</html>

