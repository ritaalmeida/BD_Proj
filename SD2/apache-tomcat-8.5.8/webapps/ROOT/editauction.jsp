
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <title>Edit Auction</title>

    <link rel="stylesheet" href="css/demo.css">
    <link rel="stylesheet" href="css/header-second-bar.css">
    <div class="header-two-bars">

        <div class="header-first-bar">

            <div class="header-limiter">

                <h1><a href="#">I<span>bei</span></a></h1>

                <nav>
                    <div class="button">
                        <form action="createpage">
                            <button type="submit">Send Message</button>
                        </form>
                        <form action="createpage">
                            <button type="submit">My Messages</button>
                        </form>
                    </div>
                </nav>

                <div class="buttonLog">
                    <form action="logout">
                        <button type="submit">Logout</button>
                    </form>


                </div>
            </div>

        </div>

        <div class="header-second-bar">

            <div class="header-limiter">
                <h2><a href="#">Welcome <c:out value="${user.getUser().getName()}"/></a></h2>

                <div class="button">

                    <form action="searchpage">
                        <button type="submit">Search Auction</button>
                    </form>
                    <form action="detailpage">
                        <button type="submit">Detail Auction</button>
                    </form>

                </div>

            </div>

        </div>

    </div>



</head>

<body>
<div class="menu">


    <h1>Ibei - the best way to make easy money</h1>
    <nav>
        <div class="button">

            <form action="createpage">
                <button type="submit">New Auction</button>
            </form>
            <form action="searchpage">
                <button type="submit">Search Auction</button>
            </form>
            <form action="detailpage">
                <button type="submit">Detail Auction</button>
            </form>
            <form action="myauctions">
                <button type="submit">My Auctions</button>
            </form>
            <form action="createbidpage">
                <button type="submit">Create Bid</button>
            </form>
            <form action="editauctionpage">
                <button type="submit">Edit Auction</button>
            </form>
            <form action="messageauctionpage">
                <button type="submit">Message Auction</button>
            </form>
        </div>
    </nav>

    <div class="info">
        <div class="info">
            <form action="editauction" method="post">
                <p><strong>Insira o ID do leilao:</strong></p>
                <input id="ID" type="number" class="form-control" placeholder="ID" name="ID" required/><br>
                <p></p>
                <input type="submit" class="btn btn-primary" method="execute" value="Select Bid">
            </form>

        </div>

    </div>

</div>

</body>
</html>