<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>List Products</title>
</head>

<body>

<table border="1">
<g:each in="${allProducts}" var="item">
    <tr>
        <td>id: ${item.id} </td>
        <td>name: ${item.name} </td>
        <td>sku: ${item.sku} </td>
        <td>price: ${item.price} </td>
    </tr>
</g:each>
</table>

</body>
</html>