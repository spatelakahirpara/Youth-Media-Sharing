<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
function addFile()
{
	var fileUpload = document.getElementById("fileUpload");
	
	var newFile = document.createElement("input");
	newFile.setAttribute("type", "file");
	newFile.setAttribute("name", "abc1");
	
	var br = document.createElement("br");
	
	fileUpload.appendChild(br);
	fileUpload.appendChild(newFile);
}
</script>
</head>
<body>
	<form action="UploadServletMultiple" method="post" enctype="multipart/form-data">
	    <input type="text" name="description" />
	    <div id="fileUpload">
	    	<input type="file" name="abc" />
	    </div>
	    <input type="button" onclick="addFile()" value="Add" />
	    <input type="submit" />
	</form>
</body>
</html>