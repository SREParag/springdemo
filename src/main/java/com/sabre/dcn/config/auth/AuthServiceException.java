package com.sabre.dcn.config.auth;

import javax.ws.rs.WebApplicationException;

public class AuthServiceException extends WebApplicationException
{
    protected static String message = "Auth service generic error.";

    public AuthServiceException()
    {
        super(message);
    }

    public AuthServiceException(String message)
    {
        super(message);
    }

    public AuthServiceException(String message, int code)
    {
        super(message, code);
    }
}
