<%@ include file="common/header.jspf" %>

<body class="spark-content--sticky-footer">
<div class="spark-content__wrapper--sticky-footer">
    <div class="spark-content__wrapper--sticky-footer">

        <article
                class="spark-splash-screen spark-splash-screen--panel spark-splash-screen--sign-in spark-main--sticky-footer">
            <section class="spark-splash-screen__content">
                <div class="spark-panel spark-splash-screen__center col-xs-12 col-md-8 col-lg-6">
                    <div class="spark-panel__content">
                        <i class="spark-logo spark-logo--sabre spark-logo--md spark-logo--sabre-red"></i>
                        <h3 class="spark-splash-screen__heading">Demo Example</h3>
                        <form action="/login" method='POST' class="spark-splash-screen__form spark-text-left">
                            <p class="spark-mar-t-2 spark-mar-b-1">
                                Sign In
                            </p>
                            <c:if test='${param.error}'>
                                <div class="spark-message spark-message--error">
                                    <i class="spark-message__icon spark-icon-ban spark-icon--fill"></i>
                                    <p class="spark-message__content">
                                        Invalid username or password.
                                    </p>
                                </div>
                            </c:if>

                            <c:if test='${param.logout}'>
                                <div class="spark-message spark-message--warning">
                                    <i class="spark-message__icon spark-icon-log-out spark-icon--fill"></i>
                                    <p class="spark-message__content">
                                        You have been logged out.
                                    </p>
                                </div>
                            </c:if>
                            <label class="spark-input">
                                <input value="" class="spark-input__field" name="username" placeholder="Enter Username..."
                                       role="textbox">
                                <span class="spark-label">Username</span>
                            </label>
                            <label class="spark-input">
                                <input value=""type="password" class="spark-input__field" name="password"
                                       placeholder="What is your password?" role="textbox" required>
                                <span class="spark-label">Password</span>
                                <span class="spark-input__addon spark-input__password-toggle">
                <i class="spark-input__password-show spark-icon--md spark-icon-password-view"></i>
                <i class="spark-input__password-hide spark-icon--md spark-icon-password-hide"></i>
              </span>
                            </label>
                            <div class="row">
                                <div class="col-xs-12 spark-mar-t-1">
                                    <button name="submit" type="submit"
                                            class="spark-btn spark-btn--md spark-btn--primary spark-block--lte-sm spark-mar-b-1--md spark-pull-right--gte-sm">
                                        Sign in
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </section>
        </article>

        <footer class="spark-footer">
            <div class="container">
                <a class="spark-footer__logo spark-hidden--lte-sm" title="Sabre"><i
                        class="spark-logo spark-logo--sabre spark-logo--xs"></i></a>
                <div class="spark-footer__content">
                    <div class="spark-footer__copyright">
                        &copy; 2019-20 Sabre
                    </div>
                    <ul class="spark-footer__list">
                        <li class="spark-footer__list-item">
                            <a class="spark-footer__list-link" href="javascript: void(0);">
                                Legal Policy
                            </a>
                        </li>
                        <li class="spark-footer__list-item">
                            <a class="spark-footer__list-link" href="javascript: void(0);">
                                Contact Us
                            </a>
                        </li>
                        <li class="spark-footer__list-item">
                            <a class="spark-footer__list-link" href="javascript: void(0);">
                                Support
                            </a>
                        </li>
                    </ul>
                </div>
                <ul class="spark-footer__list spark-footer__list--right spark-footer__list--icons">
                    <li class="spark-footer__list-item">
                        <a class="spark-footer__list-link" title="Twitter">
                            <i class="spark-icon-social-twitter spark-icon--fill"></i>
                        </a>
                    </li>
                    <li class="spark-footer__list-item">
                        <a class="spark-footer__list-link" title="Facebook">
                            <i class="spark-icon-social-facebook spark-icon--fill"></i>
                        </a>
                    </li>
                    <li class="spark-footer__list-item">
                        <a class="spark-footer__list-link" title="LinkedIn">
                            <i class="spark-icon-social-linkedin spark-icon--fill"></i>
                        </a>
                    </li>
                    <li class="spark-footer__list-item">
                        <a class="spark-footer__list-link" title="Instagram">
                            <i class="spark-icon-social-instagram spark-icon--fill"></i>
                        </a>
                    </li>
                    <li class="spark-footer__list-item">
                        <a class="spark-footer__list-link" title="YouTube">
                            <i class="spark-icon-social-youtube spark-icon--fill"></i>
                        </a>
                    </li>
                </ul>
            </div>
        </footer>

    </div>


    <%@ include file="common/footer.jspf" %>
</body>
