<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="en-US" dir="ltr">
<head> 
<title>Testing File Upload Inputs</title> 
<script type="text/javascript"> 

function replaceAll(txt, replace, with_this) { 
return txt.replace(new RegExp(replace, 'g'),with_this); 
} 
function showSrc() { 
document.getElementById("myframe").href = document.getElementById("myfile").value; 
var theexa=document.getElementById("myframe").href.replace("file:///",""); 
var path=document.getElementById("myframe").href.replace("file:///",""); 
var correctPath=replaceAll(path,"%20"," "); 

alert(correctPath); 

} 
</script> 
</head> 
<body> 
<form method="get" action="#" > 
<input type="file" id="myfile" onChange="javascript:showSrc();" size="30"> 
<br> 
<a href="#" id="myframe"></a> 
</form> 
</body> 
</html>