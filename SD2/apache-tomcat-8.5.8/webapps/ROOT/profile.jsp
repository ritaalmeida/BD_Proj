<%@ taglib prefix="s" uri="/struts-tags" %>
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <title>Home</title>

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
                    <form name = "logout" action="logout">
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
        <p><strong>Novas licitações nos leilões onde participou: </strong></p>
        <c:forEach items="${ofnotification}" var="bid">
            <p><strong>Notificação:</strong></p>
            <p>O user <c:out value="${bid.getUsername()}"/> fez um notificação no leilão de id <c:out value="${bid.getIdLeilao()}"/> de valor <c:out value="${bid.getValor()}"/></p>
            <p>--------------------------------------------------------------------</p>
        </c:forEach>
        <p><strong>Novas mensagens nos leilões onde tambem deixou uma mensagem: </strong></p>
        <c:forEach items="${ofmessages}" var="mesg">
            <p><strong>Notificação:</strong></p>
            <p>O user <c:out value="${mesg.getUsername()}"/> deixou uma mensagem no leilão de id <c:out value="${mesg.getAuctionID()}"/> com o conteudo <c:out value="${mesg.getmessage()}"/></p>
            <p>--------------------------------------------------------------------</p>
        </c:forEach>
        <p><strong>Novas mensagens nos seus leilões: </strong></p>
        <c:forEach items="${myofmessages}" var="mymesg">
            <p><strong>Notificação:</strong></p>
            <p>O user <c:out value="${mymesg.getUsername()}"/> deixou uma mensagem no seu leilão de id <c:out value="${mymesg.getAuctionID()}"/> com o conteudo <c:out value="${mymesg.getmessage()}"/></p>
            <p>--------------------------------------------------------------------</p>
        </c:forEach>

    </div>

</div>

</body>
</html>