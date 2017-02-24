/**
 * Zentech-Inc
 * Copyright (C) 2016 All Rights Reserved.
 */
package com.mjj.util.serialization;

/**
 * @author zhoujp
 * @version $Id SerializationException.java, v 0.1 2016-07-29 17:25 zhoujp Exp $$
 */
public class SerializationException extends RuntimeException {
    /**
     * Required for serialization support.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 4029025366392702726L;

    /**
     * <p>Constructs a new <code>SerializationException</code> without specified
     * detail message.</p>
     */
    public SerializationException() {
        super();
    }

    /**
     * <p>Constructs a new <code>SerializationException</code> with specified
     * detail message.</p>
     *
     * @param msg The error message.
     */
    public SerializationException(String msg) {
        super(msg);
    }

    /**
     * <p>Constructs a new <code>SerializationException</code> with specified
     * nested <code>Throwable</code>.</p>
     *
     * @param cause The <code>Exception</code> or <code>Error</code>
     *              that caused this exception to be thrown.
     */
    public SerializationException(Throwable cause) {
        super(cause);
    }

    /**
     * <p>Constructs a new <code>SerializationException</code> with specified
     * detail message and nested <code>Throwable</code>.</p>
     *
     * @param msg   The error message.
     * @param cause The <code>Exception</code> or <code>Error</code>
     *              that caused this exception to be thrown.
     */
    public SerializationException(String msg, Throwable cause) {
        super(msg, cause);
    }
}