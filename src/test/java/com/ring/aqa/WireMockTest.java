package com.ring.aqa;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.common.ConsoleNotifier;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static com.github.tomakehurst.wiremock.client.WireMock.proxyAllTo;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

public class WireMockTest {
    WireMockServer wireMockServer;

    @BeforeClass
    private void setup() {
        wireMockServer = new WireMockServer(wireMockConfig()
                .dynamicPort()
                .dynamicHttpsPort()
                .notifier(new ConsoleNotifier(true)));
        wireMockServer.start();
        WireMock.configureFor("localhost", wireMockServer.port());
        stubFor(proxyAllTo("https://www.google.com").atPriority(1));
    }

    @AfterClass
    private void tearDown() {
        if (wireMockServer != null) {
            wireMockServer.stop();
        }
    }

    @Test
    public void test() throws IOException {
        System.out.println(wireMockServer.port());
        URL url = new URL("http://localhost:" + wireMockServer.port() + "/search?q=wiremock");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        Assert.assertEquals(connection.getResponseCode(), 200);
    }
}
