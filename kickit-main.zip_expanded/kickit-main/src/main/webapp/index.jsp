<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>KickIt CTB Quiz</title>
<style>
body{
   padding:20px;
   text-align: center;
}
  
#count{
  margin:20px auto;
  border-radius:50%;
  height: 100px;
  width: 100px;
  padding: 10px;
  font-size:100px;
  font-weight: bold;
  background:blue;
  color:white;
  display:flex;
  justify-content: center;
  align-items: center;
}

img{
    height: 50px;
    width: 50px; 
}

#user-info{
    border: 1px solid gray;
    border-radius: 20px;
    padding: 5px;
}
.res{
    border-radius: 20px;
    padding: 5px 10px;
    color: white;
    font-size: medium;
    font-weight: bold;
}
.res.correct{
    background-color: lime;
}
.res.incorrect{
    background-color:  tomato;
}
</style>
</head>
<body>
    <h1>****** KickIt CTB Quiz App ******</h1>
    <hr>
    <div id="user-info">
        <img src="img/avatar.png">
        <h2><%= request.getParameter("name") %></h2>
    </div>
    <p>Number of Question in Our Database is:</p>
    <div id="count">
      <%= request.getParameter("count") %>
    </div>
</body>
</html>