package com.cmcm;

import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Spontaneously
 * @time 2018-10-25 下午2:49
 */
public class GSONTest {

    private static final String APOLLO_ARGS = "-Denv=DEV -Didc=ab-docker-compose -Dapp.id=ab.cmcm.com -Dapollo.autoUpdateInjectedSpringProperties=false";

    public static void main(String[] args) {
        Map<String, String> params = new HashMap<>();
        params.put("buildArgs", APOLLO_ARGS);
        try {
            String encodeBuildParam = encodeBuildParam(params);
            System.out.println(encodeBuildParam);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String encodeBuildParam(Object buildParam) throws Exception {
        try {
            return URLEncoder.encode(new Gson().toJson(buildParam), "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new Exception("Could not build image", e);
        }
    }
}
