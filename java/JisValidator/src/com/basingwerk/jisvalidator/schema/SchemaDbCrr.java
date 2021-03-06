package com.basingwerk.jisvalidator.schema;

import org.apache.log4j.Logger;

public class SchemaDbCrr extends SchemaDb{

  private static final long serialVersionUID = 1L;

  private SchemaDbCrr () {
    super("crrschema_([\\d.]+)\\.json");
    Logger logger = Logger.getLogger(SchemaDbCrr.class);
  }

  private static SchemaDbCrr SINGLE_INSTANCE = null;

  public static SchemaDbCrr getInstance() {
    Logger logger = Logger.getLogger(SchemaDbCrr.class);

    if (SINGLE_INSTANCE == null) {
      synchronized (SchemaDbCrr.class) {
        SINGLE_INSTANCE = new SchemaDbCrr();
      }
    }
    return SINGLE_INSTANCE;
  }
}
