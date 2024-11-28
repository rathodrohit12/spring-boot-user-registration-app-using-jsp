<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 320px;
            margin: auto;
        }

        h1 {
            text-align: center;
            color: #333;
            font-size: 20px;
            margin-bottom: 20px;
        }

        label {
            color: #333;
            display: block;
            margin-bottom: 8px;
            font-size: 14px;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #5cb85c;
            color: white;
            border: none;
            padding: 12px;
            width: 100%;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #4cae4c;
        }

        a {
            display: block;
            text-align: center;
            margin-top: 15px;
            color: #007bff;
            text-decoration: none;
            font-size: 14px;
        }

        a:hover {
            text-decoration: underline;
        }

        .error {
            color: #d9534f;
            text-align: center;
            font-size: 13px;
            margin-top: 15px;
        }

        @media (max-width: 600px) {
            .container {
                padding: 15px;
                width: 90%;
                max-width: 100%;
            }

            h1 {
                font-size: 18px;
            }

            label {
                font-size: 12px;
            }

            input[type="text"],
            input[type="password"] {
                padding: 8px;
                font-size: 12px;
            }

            input[type="submit"] {
                font-size: 14px;
            }

            a {
                font-size: 12px;
                margin-top: 10px;
            }

            .error {
                font-size: 12px;
            }
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Login</h1>

    <form action="login" method="post">
        <label for="email">Enter Email</label>
        <input type="text" id="email" name="email" placeholder="Enter Email" required>
        <br><br>
        <label for="pass">Enter Password</label>
        <input type="password" id="pass" name="pass" placeholder="Enter Password" required>

        <input type="submit" value="Login">

        <a href="reg">Don't have an account? Register</a>


    </form>
</div>

</body>
</html>
