package com.carsearch.search.exception;

import org.springframework.http.HttpStatus;

/**
 * custom exception class
 */
public class RestOperationException extends RuntimeException{

  private final String message;
  private final HttpStatus httpStatus;

  public RestOperationException(String message, HttpStatus httpStatus) {
    this.message = message;
    this.httpStatus = httpStatus;
  }

  @Override
  public String getMessage() {
    return message;
  }

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }
}
