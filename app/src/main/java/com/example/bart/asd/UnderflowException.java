package com.example.bart.asd;

/**
 * Created by jberg on 5/26/2016.
 */
    public class UnderflowException extends RuntimeException
    {
        /**
         * Construct this exception object.
         * @param message the error message.
         */
        public UnderflowException( String message )
        {
            super( message );
        }
    }

