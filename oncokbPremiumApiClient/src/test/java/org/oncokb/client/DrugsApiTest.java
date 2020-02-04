/*
 * OncoKB APIs for Premium Users
 * These endpoints are designed for premium users. Please contact OncoKB team(contact@oncokb.org) if you want to be upgraded.
 *
 * OpenAPI spec version: v1.0.0
 * Contact: contact@oncokb.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.oncokb.client;

import org.oncokb.ApiException;
import org.oncokb.client.Drug;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DrugsApi
 */
@Ignore
public class DrugsApiTest {

    private final DrugsApi api = new DrugsApi();

    
    /**
     * Get all curated drugs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void drugsGetUsingGETTest() throws ApiException {
        List<Drug> response = api.drugsGetUsingGET();

        // TODO: test validations
    }
    
    /**
     * Search drugs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void drugsLookupGetUsingGETTest() throws ApiException {
        Boolean exactMatch = null;
        String name = null;
        String ncitCode = null;
        String synonym = null;
        List<Drug> response = api.drugsLookupGetUsingGET(exactMatch, name, ncitCode, synonym);

        // TODO: test validations
    }
    
}
