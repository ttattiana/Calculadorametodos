
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <h1>
            <form name="entrada" action="./calServelt" method="POST">
                
                <input type="text" name="valor1" />
                <br>
                <input type="button" value="1" onClick="document.entrada.valor1.value+='1'">
                <input type="button" value="2" onClick="document.entrada.valor1.value+='2'">
                <input type="button" value="3" onClick="document.entrada.valor1.value+='3'">
                <input type="button" value="+" onClick="document.entrada.valor1.value+=' + '">
                <br>
                <input type="button" value="4" onClick="document.entrada.valor1.value+='4'">
                <input type="button" value="5" onClick="document.entrada.valor1.value+='5'">
                <input type="button" value="6" onClick="document.entrada.valor1.value+='6'">
                <input type="button" value="-" onClick="document.entrada.valor1.value+=' - '">
                <br>
                <input type="button" value="7" onClick="document.entrada.valor1.value+='7'">
                <input type="button" value="8" onClick="document.entrada.valor1.value+='8'">
                <input type="button" value="9" onClick="document.entrada.valor1.value+='9'">
                <input type="button" value="*" onClick="document.entrada.valor1.value+=' * '">
                <br>
                <input type="button" value="0" onClick="document.entrada.valor1.value+='0'">
                <input type="button" value="%" onClick="document.entrada.valor1.value+=' % '">
                
                <input type="button" value="/" onClick="document.entrada.valor1.value+=' / '">
                <br>
                <input type="button" value="elevar" onClick="document.entrada.valor1.value+=' ^ '">
                <input type="reset" value="c">
                <input type="submit" value="=" />
            </form>
        </h1>
        </center>
    </body>
</html>
