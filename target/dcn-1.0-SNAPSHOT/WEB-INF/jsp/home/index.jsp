<%@ include file="../common/header.jspf" %>
<style type="text/css">
    .spark-step-indicator__item {
        max-width: 25.333333rem;
    }

    .spark-toggle .spark-label {
        font-size: 1rem;
    }

    .col-xs-6, .col-md-6 {
        padding-left: 0px !important;
    }

    textarea {
        height: auto !important;
    }

    p {
        margin-bottom: 1rem;
    }

    .section-opacity{
        opacity: 0;
    }
</style>
<body>
<%@ include file="../common/navigation.jspf" %>

<div id="main-content" class="container">
        <div class="" data-example-id="">
            <div class="spark-message spark-message--lg spark-message--info spark-panel">
                <div class="spark-panel__content">
                    <i class="spark-message__icon spark-icon-note spark-icon--fill"></i>
                    <div class="spark-message__content">
                        <h4 class="spark-message__heading">
                            Hi  ${user}
                        </h4>
                        <p>
                            The current time is : ${date}
                        </p>
                    </div>
                </div>
            </div>
        </div>
</div>
<%@ include file="../common/footer.jspf" %>
<script type="text/javascript">
</script>
</body>
</html>