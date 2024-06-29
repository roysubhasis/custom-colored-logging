package com.custom.colour.msg.print;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessagePrinter {

  private static final Logger logger = LoggerFactory.getLogger(MessagePrinter.class);

  public static void main(String[] args) {
        MessagePrinter.printMessage();
  }

  private static void printMessage(){
      logger.info("Printing an {} message... ","info");
      logger.debug("Printing an {} message... ","debug");
      logger.warn("Printing an {} message... ","warning");
      logger.error("Printing an {} message... ","error");
      logger.trace("Printing an {} message... ","trace");
  }
}
