// Copyright 2016 Yahoo Inc.
// Licensed under the terms of the Apache license. Please see LICENSE.md file distributed with this work for terms.
package com.yahoo.bard.webservice.data;

import java.util.ArrayList;
import java.util.List;

/**
 * ResultSet.
 */
public class ResultSet extends ArrayList<Result> {

    private final ResultSetSchema schema;

    /**
     * Constructor.
     *
     * @param results  The list of results
     * @param schema  The associated schema
     */
    public ResultSet(List<Result> results, ResultSetSchema schema) {
        super(results);
        this.schema = new ResultSetSchema(schema);
    }

    /**
     * Getter for ResultSet schema.
     *
     * @return The schema associated with this result set
     */
    public ResultSetSchema getSchema() {
        return this.schema;
    }

    @Override
    public String toString() {
        return "Schema: " + schema;
    }
}
